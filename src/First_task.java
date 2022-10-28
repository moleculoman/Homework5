public class First_task {
    public static void main(String[] args) {

        int iOS =0;
        int Android =1;
        boolean clientOS = Android > iOS;
        if (clientOS){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }
}