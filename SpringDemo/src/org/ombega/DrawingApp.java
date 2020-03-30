package org.ombega;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		// create a new instance of the BeanFactory object, call it factory
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/spring.xml"));
		// the factory object has a method called getBean that takes in bean id
		Triangle triangle = (Triangle) factory.getBean("triangle");
		
		triangle.draw();
  
	}

}
