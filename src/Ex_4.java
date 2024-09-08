/*Создать приложение для вычисления площади треугольника.
Необходимо считать из консоли значения основания и высоты,
они могут быть вещественными. Вывести на консоль площадь треугольника
*/
import java.util.Scanner;
public class Ex_4 {

    public Ex_4(){
        System.out.println("Для того, чтоб вычислить площадь треугольника, введите значения:");
        System.out.println("Введите длину основния треугольника:");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Введите длину высоты треугольника:");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Площадь данного треугольника равна:");
        System.out.println((a * b) / 2 + "см");
    }
        }
