package strategy.strategies;

import strategy.pack.Pack;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class CourierStategy implements ShipmentStrategy{

    @Override
    public void collectShipmentDetails(Pack pack) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dane do wysyłki:");
        String dane_wysylka = scanner.nextLine();
        System.out.println("Podaj adres odbioru:");
        String dane_odbior = scanner.nextLine();
        System.out.println("Podsumowanie: \nDane do wysyłki : " + dane_wysylka +
                "\nDane do odbioru : " + dane_odbior);
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        if(localTime.isBefore(LocalTime.parse("14:00:00.00"))) {
            System.out.println("Paczka zostanie odebrana jeszcze dzis (" + localDate +")");
        }
        else System.out.println("Paczka zostanie odebrana w dniu jutrzejszym (" + localDate.plusDays(1) +")");

    }
}
