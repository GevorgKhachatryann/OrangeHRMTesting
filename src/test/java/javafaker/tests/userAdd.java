package javafaker.tests;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;

public class userAdd {
    public String Email() {
        FakeValuesService fakeValuesService = new FakeValuesService(
                new Locale("en-GB"), new RandomService());
        return fakeValuesService.bothify("aa?????#@gmail.com");
    }
}