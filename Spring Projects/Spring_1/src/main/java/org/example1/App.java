package org.example1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathCmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println();
        System.out.println();
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext();
        Alien obj =(Alien) context.getBean("alien");
    }
}
