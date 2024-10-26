package com.springcore.sprringcore;

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
     // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        // retrieve configured instance
       Student student1 = (Student) context.getBean("Student3");
       System.out.println(student1);
       
       Student student2 = (Student) context.getBean("Student2");
       System.out.println(student2);
       
       
    }
}
