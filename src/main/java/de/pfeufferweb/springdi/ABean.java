package de.pfeufferweb.springdi;

import org.springframework.stereotype.Component;

@Component
public class ABean {
    @Override
    public String toString() {
        return "Hallo";
    }
}
