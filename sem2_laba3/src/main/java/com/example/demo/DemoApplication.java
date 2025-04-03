package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        VehicleDisplay<Sedan> sedanDisplay = (VehicleDisplay<Sedan>) context.getBean("sedanDisplay");
        sedanDisplay.display();

        VehicleDisplay<SUV> suvDisplay = (VehicleDisplay<SUV>) context.getBean("suvDisplay");
        suvDisplay.display();

        VehicleDisplay<Coupe> coupeDisplay = (VehicleDisplay<Coupe>) context.getBean("coupeDisplay");
        coupeDisplay.display();
    }
}
