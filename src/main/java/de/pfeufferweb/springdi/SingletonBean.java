package de.pfeufferweb.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    @Autowired
    private ApplicationContext context;

    public SingletonBean() {
        System.out.println("creating singleton bean");
    }

    @Override
    public String toString() {
        return "Singleton with " + getPrototype();
    }

    private PrototypeBean getPrototype() {
        return context.getBean(PrototypeBean.class);
    }
}
