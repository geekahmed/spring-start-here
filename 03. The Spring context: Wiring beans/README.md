# Chapter 3. The Spring context: Wiring beans

- When implementing an app, you need to refer from one object to another. This way, an object can delegate actions to other objects when executing their responsibilities.
  - To implement this behavior, you need to establish relationships among the beans in the Spring context.

- You can establish a relationship between two beans using one of three approaches:
  - Directly referring to the @Bean annotated method that creates one of them from the method that creates the other. Spring knows you refer to the bean in the context, and if the bean already exists, it doesn’t call the same method again to create another instance. Instead, it returns the reference to the existing bean in the context.
  - Defining a parameter to the method annotated with @Bean. When Spring observes the @Bean method has a parameter, it searches a bean of that parameter’s type in its context and provides that bean as a value to the parameter.
  - Using the @Autowired annotation in three ways:
    - Annotate the field in the class where you want to instruct Spring to inject the bean from the context. You’ll find this approach often used in examples and proofs of concept.
    - Annotate the constructor you’d like Spring to call to create the bean. Spring will inject other beans from the context in the constructor’s parameters. You’ll find this approach the most used in real-world code.
    - Annotate the setter of the attribute where you’d like Spring to inject the bean from the context. You won’t find this approach often used in production-ready code.
- Whenever you allow Spring to provide a value or reference through an attribute of the class or a method or constructor parameter, we say Spring uses DI, a technique supported by the IoC principle.
- The creation of two beans that depend on one another generates a circular dependency. Spring cannot create the beans with a circular dependency, and the execution fails with an exception. When configuring your beans, make sure you avoid circular dependencies.
- When Spring has more than one bean of the same type in its context, it can’t decide which of those beans need to be injected. You can tell Spring which is the instance it needs to inject by
  - using the @Primary annotation, which marks one of the beans as the default for dependency injection, or
  - naming the beans and injecting them by name using the @Qualifier annotation.