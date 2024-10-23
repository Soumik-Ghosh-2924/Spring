package com.Spring1.Sp_app1;

import com.Spring1.Sp_app1.model.Alien;
import com.Spring1.Sp_app1.model.Laptop;
import com.Spring1.Sp_app1.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpApp1Application {

	public static void main(String[] args) {

		ApplicationContext Context = SpringApplication.run(SpApp1Application.class, args);
		System.out.println();
		System.out.println("Hello World.");
		System.out.println();
		System.out.println();
		System.out.println();
		Alien obj = Context.getBean(Alien.class);
		System.out.println(obj.getAge());
		obj.code();

		LaptopService service = Context.getBean(LaptopService.class);
		Laptop lap = Context.getBean(Laptop.class);

		if(service.goodforProg(lap))
		{
			service.addLaptop(lap);
		}




	}

}
