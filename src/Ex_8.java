/*Создать приложение для проведения выборов. С консоли вводится 2 числа: количество
проголосовавших за первого и второго кандидата на выборах. Нужно вывести процент
голосов которые были отданы за первого и второго кандидата соответственно.
Например, при входных данных: 1 4 . Ответ будет: 20% 80%
*/
import java.util.Scanner;
public class Ex_8 {
    public Ex_8 (){
        System.out.println("Введите количество избирателей, проголосовавших за Сеньёра Помидора:");
        int izberateliPomidora = new Scanner(System.in).nextInt();
        System.out.println("Введите количество избирателей, проголосовавших за Чополино:");
        int izberateliChopolino = new Scanner(System.in).nextInt();
        int vsegoIzbiratelej = izberateliChopolino + izberateliPomidora;

        System.out.println("Всего голосовавших: " + (vsegoIzbiratelej));

        System.out.println("За Сеньёра Помидора проголосовало " + (izberateliPomidora));
        System.out.println("За Чополино проголосовало " + (izberateliChopolino));
        float procentPomidora = ((float) izberateliPomidora /vsegoIzbiratelej) * 100;
        int a = (int)procentPomidora;
        float procentChopolino = ((float) izberateliChopolino /vsegoIzbiratelej) * 100;
        int b = (int)procentChopolino;
        System.out.println("В процентном соотношении: " + a + "% " + b + "%");
    }
}
