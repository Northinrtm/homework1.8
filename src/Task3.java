public class Task3 {
    private static int checkDelivery(int deliveryDistance) {
        int a = 1;
        if (20 < deliveryDistance) a += 1;
        if (60 < deliveryDistance) a += 1;
        return a;
    }

    public static void main(String[] args) {
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + checkDelivery(1));
        System.out.println("Потребуется дней: " + checkDelivery(21));
        System.out.println("Потребуется дней: " + checkDelivery(deliveryDistance));
    }
}
