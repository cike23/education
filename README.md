# education
SpringBoot集成学习

创建Starter
先创建一个core核心、cache缓存、security授权认证，其它的后面再集成进去。

跟上面一样的方式，在education下创建education-starter-core、education-starter-cache、education-starter-security、education-starter-common子模块。

这样分模块后，我们以后需要哪个模块就引入哪个模块即可，如果哪个模块不满足需求，还可以重写该模块。

5、项目结构划分
core是项目的核心模块，结构初步规划如下：

base是项目的基础核心，定义一些基础类，如BaseController、BaseService等；

cache是缓存相关；

config是配置中心，模块所有的配置放到config里统一管理；

constants里定义系统的常量。

exception里封装一些基础的异常类；

system是系统模块；

util里则是一些通用工具类；
