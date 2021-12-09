package builder;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().firstName("Oles").age(30).occupations(Collections.singleton("UCU")).occupations(Collections.singleton("UC")).lastName("Dob").build();
        System.out.println(user);
    }
}
