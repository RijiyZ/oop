public class Main {
    public static void main(String[] args) {
        People max = new People(-2424,"Максим","Минкс","бренд-менеджером");
        People anya = new People(1993,null,"Москва","методист образовательных программ");
        People kate = new People(1992,"Клининград","Екатерина","продакт-менеджером");
        People artem = new People(1995,"Артем","Москва","директор по развитию бизнеса");
        System.out.println(max);
        System.out.println(anya);
        System.out.println(kate);
        System.out.println(artem);

        Car ladaGranta = new Car(null, "Granta", 1.7, "Желтый",
                2015, "Россия");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный",
                2020, "Германия");
        Car bmvZ8 = new Car("BMW", "Z8", 3.0, "Черный",
                2021, "Германия");
        Car kiaSportage = new Car("Kia", "Sportage 4-го поколения", 2.4, null,
                2018, "Южная Корея");
        Car hyundaiAvante = new Car("Hyundai", null, -1, "",
                -43, null);
        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmvZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
    }
}