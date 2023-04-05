# Nox

## 模块介绍
### nox-bff
聚合服务，所有对外接口收口于该服务，包括web和app。
#### nof-bff-common
项目公用组件模块，配置、常量、工具类、aop等。
#### nof-bff-core
项目核心模块dao层、数据库实体、dto、service、feign client等，对应MVC模式中的module。
#### nof-bff-deploy
项目启动类模块，springboot主类。
#### nof-bff-web
web模块，MVC模式中的Controller层，定义接口。

### nox-goods
商品服务，包括商品、库存、促销等

### nox-order
订单服务，包括订单、物流等


## 打包 & 部署
### nox-bff
1.打开IDEA Maven Tab noxbff -> Lifecycle -> package

2.双击package，打出jar包

3.到nox-bff/nox-bff-deploy/target目录执行java -jar命令启动程序

PS：或者直接运行NoxBffDeployApplication.main方法

运行成功后，访问http://localhost:8080/hello