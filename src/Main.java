public class Main {
    public static void main(String[] args) {
        System.out.println("Задание_2");
        int clientDeviceYear = 2010;
        int clientOS = 1;
        if (clientOS == 0&&clientDeviceYear<2015) {
                System.out.println("Установите облегченную версию приложения для iOS по " +
                        "ссылке!");
            } else  if (clientOS == 0)
            {
                System.out.println("Установите версию приложения для iOS по ссылке!");
             }
        else if (clientOS == 1&&clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для Android по" +
                    " ссылке!");
        } else if (clientOS==1) {
            System.out.println("Установите версию приложения для Android по " +
                    "ссылке!");
        } else {
            System.out.println("Значение не верно, введите друго значение!");
        }
    }
}

