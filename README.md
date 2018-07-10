# education
SpringBoot集成学习

创建Starter
先创建一个core核心、cache缓存、security授权认证，其它的后面再集成进去。

跟上面一样的方式，在education下创建education-starter-core、education-starter-cache、education-starter-security、education-starter-common子模块。

这样分模块后，我们以后需要哪个模块就引入哪个模块即可，如果哪个模块不满足需求，还可以重写该模块。
