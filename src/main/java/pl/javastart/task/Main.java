package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink drink1 = new Drink("Martini", "250PLN", true, "gin", 150, "wermut", 100, "lód", 20);
        Drink drink2 = new Drink("Tequila", "550PLN", true, "agawa", 120, "alkohol", 200, "woda", 30);

        System.out.println("Pierwszy trunek:");
        drink1.pokazInfo();
        System.out.println("\nDrugi trunek:");
        drink2.pokazInfo();
    }
}
