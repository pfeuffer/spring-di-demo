package de.pfeufferweb.springdi;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class ABean {
    public ABean() {
        System.out.println("creating a bean");
    }

    @Override
    public String toString() {
        return "Hallo";
    }
}
