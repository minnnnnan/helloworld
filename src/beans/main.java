package beans;

import beans.helloworld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String [] args){
        //创建一个spring的ioc容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //从ioc中获取bean实例
        helloworld helloworld = (helloworld) context.getBean("helloworld");
        //调用sayhello方法
        helloworld.sayHello();
    }
}