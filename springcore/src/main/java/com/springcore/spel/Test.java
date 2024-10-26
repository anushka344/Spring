package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
	 ApplicationContext context =
				new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
	 
	Demo d1= context.getBean("demo",Demo.class);
	 System.out.println(d1);
	 System.out.println("jj");
	 
	 //Api is also there for Spel where u can directly put experssion n get result
	 SpelExpressionParser spel = new SpelExpressionParser();
	 Expression exp =spel.parseExpression("2+3");
	 System.out.println(exp.getValue());
	 
	}
}
