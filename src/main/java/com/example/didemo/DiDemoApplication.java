package com.example.didemo;

import com.example.didemo.controllers.ConstructorInjectedController;
import com.example.didemo.controllers.MyController;
import com.example.didemo.controllers.PropertyInjectedController;
import com.example.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.services", "com.example.didemo"})
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) context.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(context.getBean(SetterInjectedController.class).sayHello());
		System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
	}
}
