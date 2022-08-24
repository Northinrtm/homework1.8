public class Task3 {
    static void checkDelivery(int deliveryDistance) {
        if (deliveryDistance <= 20) System.out.println("Потребуется дней: " + 1);
        if ((20 < deliveryDistance) && (deliveryDistance <= 60)) System.out.println("Потребуется дней: " + 2);
        if ((60 < deliveryDistance) && (deliveryDistance <= 100)) System.out.println("Потребуется дней: " + 3);
    }

    public static void main(String[] args) {
        int deliveryDistance = 95;
        checkDelivery(1);
        checkDelivery(21);
        checkDelivery(deliveryDistance);
    }
}
