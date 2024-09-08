/*Создать приложение для вычисления периметра прямоугольника.
В консоли вводятся длины двух сторон (целочисленные),
необходимо вывести периметр прямоугольника.
*/
import java.util.Scanner;
public class Ex_3 {

    public Ex_3(){System.out.println("Для того, чтоб вычислить периметр прямоугольника, введите значения:");
        System.out.println("Введите длину короткой стороны прямоугольника без запятых:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите длину длинной стороны прямоугольника без запятых:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Периметр данного прямоугольника равен:");
        System.out.println(2 * (a + b) + "см");

    }


}
