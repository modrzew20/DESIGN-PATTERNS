package builder;

import builder.PCs.Laptop;
import builder.PCs.PC;
import builder.PCs.Tablet;
import builder.builders.LaptopBuilder;
import builder.builders.PCBuilder;
import builder.builders.TabletBuilder;
import builder.technician.Technician;

public class Main {

    public static void main(String[] args) {

        Technician technician = new Technician();

        LaptopBuilder laptopBuilder = new LaptopBuilder();
        technician.constructLaptop(laptopBuilder);
        Laptop laptop = laptopBuilder.getResult();

        PCBuilder pcBuilder = new PCBuilder();
        technician.constructPC(pcBuilder);
        PC pc = pcBuilder.getResult();

        TabletBuilder tabletBuilder = new TabletBuilder();
        technician.constructTablet(tabletBuilder);
        Tablet tablet = tabletBuilder.getResult();

        System.out.println(laptop);
        System.out.println(pc);
        System.out.println(tablet);


    }


}
