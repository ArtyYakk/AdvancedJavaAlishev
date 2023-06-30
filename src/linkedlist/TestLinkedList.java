package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    // Считывание и запись в конец листа -> ArrayList
    // Удаление элементов или добавление в начало -> LinkedList
    public static void main(String[] args) {
//        List<Integer> linkedList = new LinkedList<>();
//        List<Integer> arrayList = new ArrayList<>();
//
//        measureTime(linkedList);
//        measureTime(arrayList);

        MyLinkedList list = new MyLinkedList();
        list.add(0); //0
        list.add(3); //1
        list.add(1); //2
        list.add(2); //3
        list.add(6); //4
        list.add(8); //5
        System.out.println(list);

        list.remove(0);

        System.out.println(list);


    }

    private static void measureTime(List<Integer> list){
        long start = System.currentTimeMillis();

        for(int i=0; i<100_000; i++){
                list.add(0, i);
            }


            long end = System.currentTimeMillis();

            System.out.println(end - start);
    }
}


