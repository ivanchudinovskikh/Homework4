public class Work1 {
//    public static void main(String[] args) {  // метод проверки
//      int number = 10;
//        String convertedNumber = Work1.convertNumber(number);
//        System.out.println(convertedNumber);
//
//    }
    public static String convertNumber(int number) {
        String result;
        result = (number > 0) ? (number % 7 < 4) ? ("positive-m") : ("positive-p")
                : (number == 0) ? ("zero")
                : (number % 7 > -4) ? ("negative-m") : ("negative-p");
        return result;
    }
}
