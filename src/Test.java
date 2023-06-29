import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
       List<Integer> arrayList = new ArrayList<>(); //Только ссылочные типы
        // По конвенции лучше создавать объект типа реализуемого интерфейса, чтоб потом свичиться между реализациями, если это потребуется
        // Полиморфизм и кастинг
        for(int i=0; i<10; i++){
            arrayList.add(i);
        }

        arrayList.remove(5); // Неэффективен, долго удалять с середины, внутренняя реализация - обычный массив
        // Если много операций удаления, лучше ArrayList  не использовать
        System.out.println(arrayList);

        for(int i=0; i <arrayList.size(); i++){
            System.out.println("default " + arrayList.get(i));
        }

        for(Integer x : arrayList){
            System.out.println("foreach " + x);
        }

        arrayList.forEach(a -> System.out.println("lambda " + a));

        arrayList.forEach(System.out :: println);

    }
}
