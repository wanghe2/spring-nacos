创建一个spring cloud的微服务项目，
这里不同的时，不再使用 euraka作为注册中心（据说坑很多），
也不使用自带的spring-cloud-config作为配置中心
这里采用nacos中间件 作为注册中心和配置中心


因为springcloud的版本与nacos的版本可能存在兼容性问题，导致注册不成功
这里所使用的nacos版本是1.0.1