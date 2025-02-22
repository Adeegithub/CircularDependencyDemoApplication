package org.adeesha.service;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ServiceB {
    private ServiceA serviceA;

    // Use constructor injection, and manually get the bean
    public ServiceB(ApplicationContext context) {
        System.out.println("Constructing ServiceB");
        this.serviceA = context.getBean(ServiceA.class); // Force early usage
        serviceA.sayHelloFromServiceA();  // This will trigger circular dependency
    }

    public String sayHelloFromServiceB() {
        return "Response from B";
    }
}
