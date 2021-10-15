package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class helloworld {
    String name;
    public void setName(String name){
        System.out.println("setName:" + name);
        this.name=name;
    }
    public void sayHello() {
        System.out.println("Hello: " + name);
    }
    //构造函数
    public helloworld(){
        System.out.println("helloworld's Constructor....");
    }
}
