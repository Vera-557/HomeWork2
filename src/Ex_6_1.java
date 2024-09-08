/*Создать приложение, которое будет делить вводимое число на 2,
на 5 и на 10. И выводить ответ на консоль.
Для этого задайте вводимому числу тип данных float
*/
import java.util.Scanner;
public class Ex_6_1 {
    public Ex_6_1 (){

        System.out.println("Практика деления чисел:");
        System.out.println("Введите число:");
        float a = new Scanner(System.in).nextFloat();
        System.out.println("Сейчас мы поделим ваше число на два: " + a / 2 + " А если разделим его на пять: " + a / 5 + " А если на десять: " + a / 10);
    }
}
