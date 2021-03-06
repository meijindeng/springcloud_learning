# springcloud_learning
## sc_api_commons
- 实体类服务

## sc_provide_payment(8001)
- sc_provide_payment为：服务提供者
- 服务注册发现：对于注册到Eureka中的微服务，可以通过服务发现来获得该服务的信息。

  - 在Controller中添加服务发现注解以及接口：
  - 启动两个注册中心，两个提供者，一个消费者端口；
  - 结果：{"discoveryClients":[{"services":["sc-provide-payment","sc-consumer-order"],"order":0},{"services":[],"order":0}],"services":["sc-provide-payment","sc-consumer-order"],"order":0}

## sc_consumer_order(80)
- sc_consumer_order为：服务消费者
- 集成Ribbon的负载算法;

  - 自定义配置类MyselfRule；
  - 启动类添加@RibbonClient注解，name为生产者服务的服务名称  configuration为配置类的类名；
  - 启动两个注册中心，两个提供者，一个消费者端口；
  - 结果：由原先的轮询8001服务与8002服务来回切换，变为了8001服务与8002服务随机访问。

## sc_consumer_order_feign(80)
- sc_consumer_order_feign为：服务消费者
- 集成Openfeign实现负载均衡

  - 修改pom文件，添加openfeign依赖；
  - 新建application配置文件，端口为80；
  - 在启动类上添加@EnableFeignClients注解；
  - 编写业务类以及控制层代码；
  - 运行服务，结果：8001服务与8002服务随机访问，实现负载均衡功能。

## sc_eureka_server(7001)
- sc_eureka_server为：服务注册中心1
- 将sc_provide_payment注入注册中心 

  - 在pom文件中增加spring-cloud-starter-netflix-eureka-client依赖；
  - 修改yml文件，在yml文件中新增Eureka配置；
  - 在启动类上添加@EnableEurekaClient注解。

- 将sc_consumer_order注入到注册中心（方法如上所示）

## sc_eureka_server1(7002)
- sc_eureka_server1为：服务注册中心2（搭建Eureka集群）

  - 新建一个服务注册中心；
  - 增加pom文件以及启动类；
  - Eureka集群是需要修改映射配置的，在C:\Windows\System32\drivers\etc下的hosts文件，在最后加上我们两个Eureka的映射；
  
    - 127.0.0.1  eureka7001.com
    - 127.0.0.1  eureka7002.com
    
  - 增加Eureka端口为7002的的yml文件，并将defaultZone指定为其他的Eureka（7001）；
  - 修改Eureka端口为7001的的yml文件，并将defaultZone指定为其他的Eureka（7002）；
  - 修改生产者的服务的yml文件，将该服务分别注入这个Eureka中：defaultZone换成http://eureka7001.com:7001/eureka,http://eureka7002.com:7002/eureka；
  - 分别启动7001，7002，8001，80端口，可成功搭建集群!
  
## sc_provide_payment1(8002)
- sc_provide_payment1为：服务提供者2（搭建提供者集群）
- 参照之前的服务提供者1创建类和接口以及配置pom；
- 创建application.yml配置文件，并进行集群配置；
- 启动两个Eureka服务注册中心，在启动两个服务提供者，最后再启动服务消费者，发现均能成功，但是服务消费者只能访问8001端口；
- 在服务消费者controller层，将请求路径改服务提供者名称，并且在config配置中加上@LoadBalanced注解，实现RestTemplate的负载均衡能力；
  
  - 这里需要注意的是：负载均衡Ribbon是不支持服务提供者的名称为下划线的，只支持横线。
  
## sc_provide_payment_hystrix(8001)
- sc_provide_payment_hystrix为：服务提供者（Hystrix熔断降级）
- 创建module，配置pom、application文件以及启动类，启动类加上注解@EnableEurekaClient；
- 编写业务类和控制层代码；
- 目前使用单机版的Eureka，端口为7001，记得要修改Eureka的yml文件，要指向自己；
- 以上只是生产者服务自己8001的测试，假如此时外部的消费者服务80也来访问，那消费者只能干等，最终导致消费端服务80不满意，服务端8001直接被拖死。

## sc_api_gateway(9527)
- sc_api_gateway为：API网关
- 创建module，配置pom（不要引入web依赖）、application文件以及启动类；
- 使用服务提供者为例进行网关映射；

  - 需要在gateway的yml配置新增路由配置（cloud:gateway:routes:...）；
  - 此时就可以通过地址http://localhost:9527/payment/get/1进行访问；
- 以上是通过yml方式进行访问，还有种方式是通过硬编码方式，向代码中注入RouteLocator的Bean，是为了解决YML文件配置太多，文件太大的问题。

  - 新建一个config配置文件GateWayConfig；
  - 通过地址http://localhost:9527/guonei进行访问