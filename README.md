# Microservices-in-Java
    My assignment
● Build a microservice that manages flows and steps using RESTful APIs.

    ○ It’s enough to implement EchoStep, ChoiceStep, GotoStep and EndStep
    ○ Use spring boot (https://spring.io/projects/spring-boot/)

● Build a flow builder ui that interacts with the APIs of the microservice that users can drag
and drop steps of different types to build a specific flow - Vote and Q&A flows.

    ○ Use react flow (https://reactflow.dev/)

Steps:
> start spring boot project
> Create Models for each steps
> use common interface step
```
// Step.java
public interface Step {
    String execute();
}
```
## EchoStep

```
// EchoStep.java
public class EchoStep implements Step {
    private String message = "Hello. Welcome to this _microservice_. Choose A or B";

@Override
public String execute() {
    return message;
}
}
```

## ChoiceStep

```
// ChoiceStep.java
public class ChoiceStep implements Step {
    private String a;
    private String b;

@Override
public String execute(){
    return a>b?a :b;
}
}
```

## GotoStep

```
// GotoStep.java
public class GotoStep implements Step {
    private String x;

@Override
public String execute(){
    return x;
}
}
```

## EndStep

```
// Step.java
public class EngStep implements Step {
    private String bye = "Okey Have a good day";

@Override
public String execute(){
    return bye;
}
}
```
## Create Service
