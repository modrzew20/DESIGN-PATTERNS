package strategy;

import strategy.pack.Pack;
import strategy.strategies.CourierStategy;
import strategy.strategies.PointStrategy;
import strategy.strategies.ShipmentStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        double lenght,width,height,weight;
        String c;
        ShipmentStrategy shipmentStrategy;
        while (true){
            System.out.println("Czy chcesz utworzyć nową przesyłkę Y/N");
            c = scanner1.nextLine();
            if (c.equals("N")) break;

            System.out.println("Podaj dane wysyłki (długość ; szerokość ; wysokość; waga)");
            lenght = scanner.nextDouble();
            width = scanner.nextDouble();
            height = scanner.nextDouble();
            weight = scanner.nextDouble();
            Pack pack = new Pack(lenght,width,height,weight);
            System.out.println("wybierz sposob wysyłki\n 1. Kurier \n 2. Paczkomat\n");
            int w = scanner.nextInt();
            if (w == 1)  shipmentStrategy = new CourierStategy();
            else shipmentStrategy = new PointStrategy();
            pack.proccessShipment(shipmentStrategy);

        }
    }
}
