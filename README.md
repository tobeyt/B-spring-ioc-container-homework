主观题：

@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

Answer:
- @Component 定义的类自动注册和装配 bean, 此时类和 bean 一对一关系；
- @Bean 表示定义一个单一的 bean, 但是不提供注册和装配功能，我们可以自由选择如何去装配和注册；
- @Component 使用路径自动扫描和装配 bean, @Bean 只是显示声明单个 bean；
- @Bean 和 @Configure 将 @Component 解耦了；
- @Component 是类级别的，@Bean 是方法级别的；
- @Component 不需要和 @Configure 一起使用，但是 @Configure 类中的方法必须使用 @Bean 注解；
- 如果是第三方库，或者注解的类存在依赖关系，此时这个类不在 SpringApplicationContext 管理，就不能使用 @Component 创建 @Bean，此时就需要用 @Bean 创建一个 Bean
