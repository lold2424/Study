package hello.core;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombook {

    private String name;
    private  int age;

    public static void main(String[] args) {
        HelloLombook helloLombook = new HelloLombook();
        helloLombook.setName("abcd");

        String name = helloLombook.getName();
        System.out.println("name = " + name);
    }
}
