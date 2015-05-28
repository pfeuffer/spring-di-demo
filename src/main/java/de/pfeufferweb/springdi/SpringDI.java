package de.pfeufferweb.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDI {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application-context.xml"});

        for (int i = 0; i < 5; ++i) {
            SingletonBean bean = context.getBean(SingletonBean.class);

            System.out.println(bean);
        }
    }
}
