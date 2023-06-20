public class While {
    public static void main(String[] args) {
        // Циклы предназначены для повторного воспроизведения кода
        // Конкретно цикл while применяется в тех случаях, когда мы заранее не знаем количество итераций в цикле

        // Пример использования кода:
        int i =0;

        while(i<10){
            System.out.println(i + " Hello Amigo");
            i++;
        }

        // цикл do while
        // Цикл с постусловием, (сначала выполняем инструкцию, потом проверяем условие)
        // Следовательно в теле цикла do инструкция выполнится минимум 1 раз.

        do{
            System.out.println("Hello Amigo");
        }
        while(false);
    }
}
