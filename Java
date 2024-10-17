import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    // Объявляем объект класса Scanner ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        // Считывание четырех целых чисел X, A, B, C из консоли
        int X = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        //проверяем, что вес человека не больше грузоподъемности лифта
        if (A>X || B>X || C>X)
            out.println("Вес человека не может быть больше грузоподъемности лифта");
        //если вес каждого человека меньше грузоподъемности
        else
            //Сравниваем, сможет ли лифт поднять троих людей
            if (A+B+C<=X)
            // выводим результат, если сможет
                out.print("лифт сможет поднять 3 человек");
            else
            //если лифт не может поднять 3 человек одновременно, то проверяем сможет ли он поднять 2 человек
                if (A+B<=X || B+C<=X || A+C<=X)
                //если сможет, то выводим результат:
                    out.print("лифт сможет поднять 2 человек");
        //если лифт не может поднять 3 или 2 человек, то лифт может перевести только одного человека
        else
            out.print("лифт сможет поднять 1 человека");

    }
}
