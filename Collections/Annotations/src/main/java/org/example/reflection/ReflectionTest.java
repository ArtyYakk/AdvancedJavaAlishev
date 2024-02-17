package org.example.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException {
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

//        Annotation[] annotations = personClass.getAnnotations();
//        System.out.println(Arrays.toString(annotations));
//        for(Annotation annotation : annotations){
//            if(annotation instanceof Author){
//                System.out.println("YES");
//            } else System.out.println("no");
//        }

        Scanner scanner = new Scanner(System.in);
        // Название_класса_1 Название_класса_2 Називание_метода
        Class classObject1 = Class.forName(scanner.next());
        Class classObject2 = Class.forName(scanner.next());
        String methodName = scanner.next();

        Method m = classObject1.getMethod(methodName, classObject2);
        Object o1 = classObject1.newInstance();



    }
}
