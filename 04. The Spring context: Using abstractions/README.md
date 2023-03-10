# Chapter 4. The Spring context: Using abstractions


-  In Java, the interface is an abstract structure you use to declare a specific responsibility. 
-  The interface specifies the “what needs to happen,” while every object implementing the interface specifies the “how it should happen.”
-  Decoupling implementations through abstractions is a good practice in implementing a class design. Decoupling objects makes implementations easy to change without affecting too many parts of the application. This aspect makes your application more easily extended and maintained.

- When using abstraction with dependency injection, Spring knows to search for a bean created with an implementation of the requested abstraction.
- You use stereotype annotations on classes for which Spring needs to create instances and add these instances as beans to its context. You never use stereo-type annotations on interfaces.
- When the Spring context has more beans created with multiple implementations of the same abstraction, to instruct Spring which bean to inject, you can 
  - – use the @Primary annotation to mark one of them as default, or 
  - – use the @Qualifier annotation to name the bean and then instruct Spring to  inject that bean by name.

- When we have service responsibility components, we use the @Service stereo-type annotation instead of @Component. Likewise, when a component has repository responsibility, we use the @Repository stereotype annotation instead of @Component. This way, we mark the component’s responsibility explicitly, and we make the class design more comfortable to read and understand.