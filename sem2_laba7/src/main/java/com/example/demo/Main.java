package com.example.demo;

import com.example.demo.model.BMW;
import com.example.demo.model.Dodge;
import com.example.demo.service.VehicleDisplayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo")
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Main.class);
        VehicleDisplayer displayer = context.getBean(VehicleDisplayer.class);
        BMW e30 = context.getBean(BMW.class);
        Dodge challenger = context.getBean(Dodge.class);

        System.out.println(displayer.display(e30));
        System.out.println(displayer.display(challenger));

        context.close();
    }
}