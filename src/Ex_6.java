/*Создать приложение, которое будет делить вводимое число на 2,
на 5 и на 10. И выводить ответ на консоль.
Для этого задайте вводимому числу тип данных float
*/
import java.util.Scanner;
public class Ex_6 {
    public Ex_6(){

        System.out.println("Практика деления чисел:");
        System.out.println("Введите число:");
        float a = new Scanner(System.in).nextFloat();
        System.out.println("Сейчас мы поделим ваше число на два:");
        a = a / 2;
        System.out.println("Итого = " + a);
        System.out.println("Теперь результат разделим еще на 5, = " + (a / 5));
        System.out.println("Полученные данные разделим еще на 10 = " + (a / 10));

    }
}
