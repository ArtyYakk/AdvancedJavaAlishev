package org.example.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        Class personClass = Person.class;
        Class personClass2 = person.getClass();
     //   Class personClass3 = Class.forName("Person");

//        Method[] methods = personClass.getMethods();
//        for(Method method : methods){
//            System.out.println(method.getName() + ", "
//                    + method.getReturnType() + ", "
//                    + Arrays.toString(method.getParameterTypes()));
//            System.out.println();
//        }

//        Field[] fields = personClass.getDeclaredFields();
//        for(Field field : fields){
//            System.out.println(field.getName() + ", "
//                    + field.getType() + ", ");
//            System.out.println();
//        }

        Annotation[] annotations = personClass.getAnnotations();
        System.out.println(Arrays.toString(annotations));
        for(Annotation annotation : annotations){
            if(annotation instanceof Author){
                System.out.println("YES");
            } else System.out.println("no");
        }




    }
}
