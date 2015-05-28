package de.pfeufferweb.springdi;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("creating singleton bean");
    }

    @Override
    public String toString() {
        PrototypeBean prototype = requestPrototype();
        return "Singleton with " + prototype
//                + " of class " + prototype.getClass()
                ;
    }

    @Lookup
    protected PrototypeBean requestPrototype() {
        return null;
    }
}
