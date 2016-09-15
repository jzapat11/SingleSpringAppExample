package co.com.sampleapp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.sampleapp.beans.ConfigurationBean;

public class Main {
	
	public static void main(String args[]){
		System.out.println("XXXXX ENV: " + System.getProperty("ENV"));
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:app-context.xml");
		ConfigurationBean configurationBean = applicationContext.getBean(ConfigurationBean.class);
		
		System.out.println("HOST:" + configurationBean.getHost());
		System.out.println("DATABASE:" + configurationBean.getDatabase());
		System.out.println("USER:" + configurationBean.getUser());
		System.out.println("PASSWORD:" + configurationBean.getPassword());
		
	}
}
