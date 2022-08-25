public class Task1 {
    private static void checkYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " номер года — високосный год.");
        } else {
            System.out.println(year + " номер года — не високосный год.");
        }
    }

    public static void main(String[] args) {
        checkYear(2022);
        checkYear(2023);
        checkYear(2024);
        checkYear(2025);
        checkYear(2026);
    }
}
