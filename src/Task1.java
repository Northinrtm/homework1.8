public class Task1 {
    public static void checkYear(int year) {
        if (year % 400 == 0)
            System.out.println(year + " год является високосным.");
        else if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " год является високосным.");
        } else System.out.println(year + " год не является високосным.");
    }

    public static void main(String[] args) {
        checkYear(2022);
        checkYear(2023);
        checkYear(2024);
        checkYear(2025);
    }
}
