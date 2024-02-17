package org.example.less2;

import java.lang.annotation.Target;

public class Test {

    @MethodInfo(author = "Artem", dateOfCreation = 2024, purpose = "test")
    public void printHelloWorld(){
        System.out.println("Hello world");
    }
}
