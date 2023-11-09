import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите кол-во яблок: ");
        int apple = scanner.nextInt();

        appleKeeper(name, apple);
    }

    public static void appleKeeper(String name, int apple) {
        if (apple < 0 || apple > 100) {
            System.out.println("Ой йо йой как много яблок");
            return;
        }
        String apples;
        if (apple % 10 == 1 && apple % 100 != 11) {
            apples = "яблоко";
        }
        else if (apple % 10 >= 2 && apple % 10 <= 4 && (apple % 100 < 10 || apple % 100 >= 20)) {
            apples = "яблока";
        }
        else  {
            apples = "яблок";
        }
        System.out.println(name + " хранит у себя " + apple + " " + apples);
    }
}
