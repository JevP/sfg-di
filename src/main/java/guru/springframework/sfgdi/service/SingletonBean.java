package guru.springframework.sfgdi.service;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton");
    }

    public String getMyScope() {
        return "I'm a Singleton";
    }
}
