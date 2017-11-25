# stream-java8

day 11.25

@RequestMapping --- 提供“路线信息” ，告诉HTTP 请求方法来自哪里 
@RestController --- 告诉spring立即返回结果给请求者

	
Auto-configuration自动装配（概念）
  操作：手动添加@EnableAutoConfiguration 或 @SpringBootApplication注解在你的@Configuration（需要配置的）类中
  提示：只应该添加一个 @EnableAutoConfiguration 注解。推荐添加在你的主要配置（@Configuration）类中
 
@Configuration 不需要讲全部配置放在一个类中， @Import可以用来导入其他的类
或者用@ComponentScan自动装配spring配置文件（其中包括@Configuration ）
如果必须使用XML配置文件，建议从@Configuration 类开始配置，可以使用@ImportResource注解加载配置文件
 
@SpringBootApplication 注解 等同于 使用@Configuration,@EnableAutoConfiguration和@ComponentScan 的默认属性。
	@SpringBootApplication也为 @EnableAutoConfiguration and @ComponentScan提供了别名
 
@EnableAutoConfiguration
	让Spring Boot根据你以来或添加的jar 自动完成你想要的spring配置文件
	
	
	
stream.generator方法：生成一个无限长度的Stream，其元素的生成是通过给定的Supplier（这个接口可以看成一个对象的工厂，每次调用返回一个给定类型的对象）
	这个无限长度Stream是懒加载，一般配合Stream的limit()方法来用。
	stream.limit: 截断操作，获取stream前N个元素(如果原Stream中包含的元素个数小于N，那就获取其所有的元素)
