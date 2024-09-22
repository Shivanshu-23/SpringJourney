package org.Shivanshu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        Dev dev = new Dev();
//        dev.compile();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Dev dev = (Dev)context.getBean("dev");
//        dev.compile();
        System.out.println( "Hello World!" );
    }

}
