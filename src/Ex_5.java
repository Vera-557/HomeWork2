/*Создать приложение для вычисления площади квадрата.
Необходимо считать из консоли длину стороны квадрата и вывести его площадь.
*/
import java.util.Scanner;
public class Ex_5 {
    public Ex_5(){
        System.out.println("Для того, чтоб вычислить площадь квадрата, введите значения:");
        System.out.println("Введите длину стороны квадрата:");
        int a = new Scanner(System.in).nextInt();
        a = a * a;
        System.out.println("Площадь квадрата = " + a + " см");
    }
}
