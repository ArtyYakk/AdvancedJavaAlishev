package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(2, "Bob"));
        people.add(new Person(3, "Katy"));
        people.add(new Person(1, "Mike"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getId() > o2.getId()){
                    return 1;
                } else if(o1.getId() < o2.getId()){
                    return -1;
                } else{
                    return 0;
                }
            }
        });

        System.out.println(people);
    }
}

class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        /*
        o1 > o2 -> 1
        o1 < o2 -> -1
        o1 == o1 -> 0
         */
        if(o1.length() > o2.length()){
            return 1;
        } else if(o1.length() < o2.length()){
            return -1;
        } else{
            return 0;
        }
    }
}

class Person{
    private int id;
    private String name;
    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

