public class Arrays {
    public static void main(String[] args) {
        // Объявление массива:
        int [] arr = new int[10];             // создаем массив размером 10
        int [] arr1 = {1,5,7,3,7,5,8,9,3,5};  // альтернативный способ создания массива

        // Вывод каждого элемента массива:
        for(int i: arr){
            System.out.print(arr[i]+ " ");
        }
    }
}

