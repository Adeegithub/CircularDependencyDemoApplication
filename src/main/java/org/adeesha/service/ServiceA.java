package org.adeesha.service;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {
    private ServiceB serviceB;

    // Use constructor injection, and manually get the bean
    public ServiceA(ApplicationContext context) {
        System.out.println("Constructing ServiceA");
        this.serviceB = context.getBean(ServiceB.class); // Force early usage
        serviceB.sayHelloFromServiceB();  // This will trigger circular dependency
    }

    public String sayHelloFromServiceA() {
        return "Response from A";
    }
}
