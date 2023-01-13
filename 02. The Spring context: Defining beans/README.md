# Chapter 2. The Spring context: Defining beans

## 2.1 Creating a Maven project

- Maven is a tool you use to easily manage an app’s build process regardless of the framework you use.
- A build tool is software we use to build apps more easily. You configure a build tool to do the tasks that are part of building the app instead of manually doing them.
- Some examples of tasks that are often part of building the app are as follows:
  - Downloading the dependencies needed by your app
  - Running tests
  - Validating that the syntax follows rules that you define
  - Checking for security vulnerabilities
  - Compiling the app
  - Packaging the app in an executable archive

## 2.2 Adding new beans to the Spring context

- You can add beans in the Spring context in the following ways:
  - Using the @Bean annotation:  enables you to add any kind of object instance as a bean and even multiple instances of the same kind to the Spring context.
  - Using stereotype annotations: This configuration approach requires writing less code, which makes your configuration more comfortable to read.
  - Programmatically: Using the registerBean() method enables you to implement custom logic for adding beans to the Spring context.
