import java.util.ArrayList;
import java.util.List;

public class DynamicArrays {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // Согласно конвенции Java такая запись более корректна чем:
        // ArrayList<Integer> list1 = new ArrayList<>();
        // Если мы используем upkasting, то потом можем переделать в любой другой List массив
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        System.out.println(list);
        // toString уже переопределен, так что в методе sout он выведет нам элементы массива
        // ArrayList работает через внутренний массив. При его заполнении, он пересоздается и копируется
        // При удалении из массива все элементы сдвигаются влево относительно этого элемента и изменяется размер массива
    }
}
