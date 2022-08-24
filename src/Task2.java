import java.time.LocalDate;

public class Task2 {
    static void checkPhone(int os, int year) {
        if (os == 0) {
            if (year >= 2015) {
                System.out.println("У вас IOS " + year + " года.");
            } else System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (year >= 2015) {
            System.out.println("У вас Android " + year + " года.");
        } else System.out.println("Установите облегченную версию приложения для Android по ссылке.");
    }

    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        checkPhone(0, currentYear);
        checkPhone(0, 2010);
        checkPhone(1, currentYear);
        checkPhone(1, 2010);
    }
}
