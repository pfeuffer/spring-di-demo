package de.pfeufferweb.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    @Autowired
    private Prototype prototype;

    public SingletonBean() {
        System.out.println("creating singleton bean");
    }

    @Override
    public String toString() {
        return "Singleton with " + prototype
//                + " of class " + prototype.getClass()
                ;
    }
}
