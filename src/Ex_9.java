/*Создать приложение для вычисления минимального значение из трёх введённых переменных.
Пользователь вводит три переменные, нужно вывести минимальное значение.
Для реализации задачи воспользоваться библиотекой Math.
*/
import java.util.Scanner;
public class Ex_9 {
    public Ex_9(){

        System.out.println("Введите три любых числа:");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();

        System.out.println((Math.min(a, Math.min(b, c))));

    }
}
