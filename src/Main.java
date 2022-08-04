public class Main {
    public static void main(String[] args) {
        //DZ 3.1
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для ios по ссылке");
                }
        //DZ 3.2
        int clientDeviceYear = 2015;//год создания телефона
        int clientYear = 2012;//год создания телефона для проверки
        if (clientYear < clientDeviceYear) {
            System.out.print("Установите облегченную версию приложения для ");
        } else {
            System.out.println("Установите  версию приложения для");}
        if (clientOS == 1) {
            System.out.println("Android по ссылке");
        } else {
            System.out.println("ios по ссылке");}
        //DZ 3.3
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "год является високосным");
        } else {
            System.out.println(year + "год не является високосным");
        }
        //DZ 3.4
        int deliveryDistance = 70;//дистанция до клиента
        int deliveryDays = 1; //Количество дней доставки
        int interval = 40; //Интервал доставки
        int startIntervsl = 20;//Стартовый интервал
        if (deliveryDistance <= startIntervsl){
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startIntervsl) / (double) interval);
        }
        System.out.println("Потребуется дней: " + deliveryDays);

        //DZ 3.5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }


    }
}