# springcloud_learning
## sc_api_commons
- 实体类服务

## sc_provide_payment
- sc_provide_payment为：服务提供者

## sc_consumer_order
- sc_consumer_order为：服务消费者

## sc_eureka_server
- sc_eureka_server为：服务注册中心

- 将sc_provide_payment注入注册中心 

  - 在pom文件中增加spring-cloud-starter-netflix-eureka-client依赖；
  - 修改yml文件，在yml文件中新增Eureka配置；
  - 在启动类上添加@EnableEurekaClient注解。

- 将sc_consumer_order注入到注册中心（方法如上所示）
