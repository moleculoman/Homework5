public class Second_task {
    public static void main(String[] args) {
        int iOS = 0;
        int Android = 1;
        boolean clientOS = Android > iOS;
        int clientDeviceYear = 2014;
        if (clientOS && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (!clientOS && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (!clientOS && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную приложения для iOS по ссылке");

        }
    }
}