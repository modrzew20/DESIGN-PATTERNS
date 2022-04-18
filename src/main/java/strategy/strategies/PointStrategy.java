package strategy.strategies;

import strategy.pack.Pack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PointStrategy implements ShipmentStrategy{
    private static final Map<Integer, Points> DATA_BASE = new HashMap<>();

    static {
        DATA_BASE.put(1,new Points("LOD3749"));
        DATA_BASE.put(2,new Points("TK5032"));
        DATA_BASE.put(3,new Points("WD3522"));
        DATA_BASE.put(4,new Points("RT4532"));

    }

    @Override
    public void collectShipmentDetails(Pack pack) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz punkt: ");
        for (Integer i: DATA_BASE.keySet()) {
            System.out.println(i.toString() + " " + DATA_BASE.get(i).name);
        }
        int point = scanner.nextInt();

        Box box ;
        int x = -1 ,y = -1;
        for(int i = 0;i < DATA_BASE.get(point).getBoxes().size();i++) {
            if(check(pack) == null) {
                System.out.println("Paczka nie może zostać wysłana paczkomatem");
                return;
            }

            if(check(pack) == DATA_BASE.get(point).boxes.get(i).getSize()
                   && DATA_BASE.get(point).boxes.get(i).isFree()) {
               box = DATA_BASE.get(point).boxes.get(i);
               box.setFree(false);
               x = box.getX();
               y = box.getY();
               break;
           }
        }
        if(x<0 && y<0) {
            System.out.println("Brak miejsca w paczkomacie");
            return;
        }
        System.out.println( "Podsumowanie : \n" + "Wybrano punkt: " + DATA_BASE.get(point).getName()
                + "\nWłóż paczke do skrytki: poziomo = " + (x+1) + " pionowo = "+ (y+1));

    }

    Size check(Pack pack) {
        if(pack.height < 20 && pack.width < 40 && pack.lenght < 60) return Size.A;
        else if(pack.height < 40 && pack.width < 40 && pack.lenght < 60 ) return Size.B;
        else if(pack.height < 60 && pack.width < 40 && pack.lenght < 60) return Size.C;
        else return null;


    }

}
