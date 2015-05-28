package de.pfeufferweb.springdi;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PrototypeBean {
    private static int counter = 0;
    private final int instanceNr;
    public PrototypeBean() {
        this.instanceNr = ++counter;
        System.out.println("creating prototype bean nr. " + this.instanceNr);
    }

    @Override
    public String toString() {
        return "Prototype nr. " + instanceNr;
    }
}
