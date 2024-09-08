/*Создать приложение, которое будет просчитывать примерное время ожидания в
очереди на приёме к врачу. Известно, что врач тратит минимум 10 минут на
приём одного пациента, а максимум 20. С консоли вводится количество пациентов в
очереди, необходимо вывести минимальное, максимальное и среднее время ожидания в очереди.
*/
import java.util.Scanner;
public class Ex_7 {
    public Ex_7 (){
        System.out.println("Введите количество пациентов в очереди:");
        int pacienti = new Scanner(System.in).nextInt();
        int timeMinimum = 10;
        int timeMaximum = 20;
        int timeMiddle = (timeMinimum + timeMaximum) / 2;

        System.out.println("Среднее время ожидания " + (timeMiddle * pacienti));
        System.out.println("Минимальное время ожидания " + (timeMinimum * pacienti));
        System.out.println("Максимальное время ожидания " + (timeMaximum * pacienti));

    }
}
