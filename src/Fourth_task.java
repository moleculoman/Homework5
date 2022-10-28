public class Fourth_task {
    public static void main(String[] args) {
        int deliveryDistance = 95;

        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;
        }

        if (deliveryDistance > 60) {
            deliveryDays++;
        }
            System.out.println("Потребуется дней: "+ deliveryDays);
        }
    }

