package guru.springframework.sfgdi.service;

public class I18nEnglishService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
