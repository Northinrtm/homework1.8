import java.time.LocalDate;

public class Task2 {
    private static void checkPhone(int os, int year) {
        if (year <= 2015) {
            System.out.print("Установите облегченную версию приложения ");
        } else {
            System.out.print("Установите приложение ");
        }
        if (os == 0) {
            System.out.println("для Андройд по ссылке");
        } else {
            System.out.println("для IOS по ссылке");
        }
    }

    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        checkPhone(0, currentYear);
        checkPhone(0, 2010);
        checkPhone(1, currentYear);
        checkPhone(1, 2010);
    }
}
