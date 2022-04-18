package decorator1;

public class main {

    public static void main(String[] args) {

        Car car = new Car("BMW X6" , 20000,new Engine());
        System.out.println("Auto w podstawowej wersji ");
        System.out.println(car.getDescription() +" Cena: " + car.getPrice());
        System.out.println("Dodanie skrzyni: ");
        car.setComponent(new Gearbox(new Engine()));
        System.out.println(car.getDescription() + " Cena: " +car.getPrice());
        System.out.println("Dodanie pakietu: " );
        car.setComponent(new SRT4(new Gearbox(new Engine())));
        System.out.println(car.getDescription() +" Cena: " + car.getPrice());



    }
}