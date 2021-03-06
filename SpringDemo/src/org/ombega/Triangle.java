package org.ombega;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


/*implement the ApplicationContextAware interface to allow Triangle.java use the "context"
  instantiated in DrawingApp.java*/
public class Triangle implements Shape{
	
     private Point pointA;
     private Point pointB;
     private Point pointC;
     private ApplicationContext context = null;
     
	public Point getPointA() {
		return pointA;
	}
	
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	public Point getPointB() {
		return pointB;
	}
	
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	public Point getPointC() {
		return pointC;
	}
	
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
     
	public void draw() {
		System.out.println("Drawing Triangle");
    	System.out.println("Point A is (" + getPointA().getX() +"," + getPointA().getY() +")");
    	System.out.println("Point B is (" + getPointB().getX() +"," + getPointB().getY() +")");
    	System.out.println("Point C is (" + getPointC().getX() +"," + getPointC().getY() +")");
    }

	/*
	 * @Override public void setApplicationContext(ApplicationContext context)
	 * throws BeansException { this.context = context; }
	 * 
	 * @Override public void setBeanName(String beanName) {
	 * System.out.println("Bean name is:" + beanName);
	 * 
	 * }
	 * 
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("InitializingBean init method called for Triangle");
	 * 
	 * }
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("DisposableBean destroy method called for Triangle");
	 * 
	 * }
	 */
}
