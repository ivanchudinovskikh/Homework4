import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Work3 {
    public static void main(String[] args) {
        inOutNumber();
    }
    public static void inOutNumber() {
        int number;
        List<Integer>arrayList = new ArrayList<>(List.of());
        for(int i=0; i<10 ; i++ ) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите число от 0 до 9: ");
                number = scanner.nextInt();
                if (number>=10) {
                    System.out.println("Попробуйте снова");
                    i= i- 1;
            }
                else {
                   arrayList.add(number);
                }

        }

    }
}
