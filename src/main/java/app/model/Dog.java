package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Dog")
public class Dog extends Animal {
    @Override
    public String toString() {
        return "I'm a dog";
    }
}
