public class Main {
    public static void main(String[] args) {
        int a = 250; //Начальная сумму на счете
        System.out.println("Начальная сумма на счете - " + a + " рублей");
        int b = 2700; //Сумма пополнения
        System.out.println("Сумма пополнения - " + b + " рублей");
        int c;
        if (b > 1000) {
            c = b / 100;
        } //Коль-во бонусов
        else {
            c = 0;
        }
        int e = a + b + c;
        System.out.println("Сумма на счете - " + e + " рублей");
        System.out.println("Коль-во бонусов " + c + " рублей");
    }
}