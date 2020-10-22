主观题：

@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

Answer:
区别：@Component 可以让 ApplicationContext 自动扫描到，并且可以让 ApplicationContext 自己去创建管理 Bean；@Bean + @Configuration
是 @Component 的实现底层，@Bean 就是告诉 ApplicationContext 这是一个 Bean ,并没有注入进去。
比如有时候我需要第三方的库，但是没有源代码，此时就不能用 @Component ，这个时候可以自定义 Configuration 类进行手动配置。