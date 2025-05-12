package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        VehicleDisplay vehicleDisplay = (VehicleDisplay) context.getBean("vehicleDisplay");
        vehicleDisplay.display();

        // очистка ресурсов 
        vehicleDisplay.cleanup();

        // закрытие контекста
        ((ClassPathXmlApplicationContext) context).close();
    }
}
