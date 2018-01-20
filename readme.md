# war-gas

this is the gas-war (index's war add common's class and config )
## Javaweb项目部署总结

### 简介:

 这里部署的JavaWeb项目是一个使用maven构建的web项目的war包文件,这个项目采用SSM架构以及mysql数据库进行开发.
 
### 具体部署步骤:

1. openshift 安装mysql
  
  这里需要注意在安装mysql时,默认的服务host映射为`mysql` ,这个如果不改,链接数据库的url应改为:`jdbc:mysql://mysql:3306/<db-name>`格式.
  
2. openshift 安装phpAdmin 软件.

  这个软件主要是为了方便我们在服务器上管理mysql数据库.该项目的git地址为`https://github.com/SnowLive/phpMyAdmin.git`(这是本人fork下来项目地址).

3. javaweb项目部署(重头戏)

  在进行Javaweb项目部署时,需要注意,选用的是openshift提供的`wildfly`模板进行部署.
  
完成以上三步,整个javaweb项目就部署完成了.

下面贴上本人部署的一个web项目实例:
GAS XX 政务网站(baidu)[https://www.baidu.com];


