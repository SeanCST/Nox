# Nox


## 打包 & 部署
### nox-bff
1.打开IDEA Maven Tab noxbff -> Lifecycle -> package

2.双击package，打出jar包

3.到nox-bff/nox-bff-deploy/target目录执行java -jar命令启动程序

PS：或者直接运行NoxBffDeployApplication.main方法

运行成功后，访问http://localhost:8080/hello