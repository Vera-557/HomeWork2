/* Создать приложение, которое будет решать следующую задачу. На консоль вводится 4 числа
— зарплаты сотрудников IT отделов. Нужно вывести на экран разницу между наибольшей и
наименьшей зарплатой в отделе.
*/
import java.util.Scanner;
public class Ex_10 {
    public Ex_10(){
        System.out.println("Введите зарплату четырёх сотрудников:");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        int x = new Scanner(System.in).nextInt();

        int minimalka = ((Math.min(x, Math.min(a, Math.min(b, c)))));
        int maksimalka = ((Math.max(x, Math.max(a, Math.max(b, c)))));
        System.out.println("Разница между самой маленькой и самой большой з/п составляет - " + (maksimalka-minimalka));

    }

}
