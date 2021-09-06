# springcloud_learning
## sc_api_commons
- 实体类服务

## sc_provide_payment(8001)
- sc_provide_payment为：服务提供者

## sc_consumer_order(80)
- sc_consumer_order为：服务消费者

## sc_eureka_server(7001)
- sc_eureka_server为：服务注册中心

- 将sc_provide_payment注入注册中心 

  - 在pom文件中增加spring-cloud-starter-netflix-eureka-client依赖；
  - 修改yml文件，在yml文件中新增Eureka配置；
  - 在启动类上添加@EnableEurekaClient注解。

- 将sc_consumer_order注入到注册中心（方法如上所示）

## sc_eureka_server1(7002)
- sc_eureka_server1为：服务注册中心1（搭建Eureka集群）

  - 新建一个服务注册中心；
  - 增加pom文件以及启动类；
  - Eureka集群是需要修改映射配置的，在C:\Windows\System32\drivers\etc下的hosts文件，在最后加上我们两个Eureka的映射；
  
    - 127.0.0.1  eureka7001.com
    - 127.0.0.1  eureka7002.com
    
  - 增加Eureka端口为7002的的yml文件，并将defaultZone指定为其他的Eureka（7001）；
  - 修改Eureka端口为7001的的yml文件，并将defaultZone指定为其他的Eureka（7002）；
  - 修改生产者的服务的yml文件，将该服务分别注入这个Eureka中：defaultZone换成http://eureka7001.com:7001/eureka,http://eureka7002.com:7002/eureka；
  - 分别启动7001，7002，8001，80端口，可成功搭建集群!