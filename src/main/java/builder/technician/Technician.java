package builder.technician;

import builder.builders.LaptopBuilder;
import builder.builders.PCBuilder;
import builder.builders.TabletBuilder;
import builder.components.CPU;
import builder.components.GraphicsCard;
import builder.components.PowerSupply;
import builder.components.RamMemory;
import builder.components.enums.*;

public class Technician {

    public void constructPC(PCBuilder builder) {
        builder.setCPU(new CPU(3.2, ProcessorBrand.AMD, ProcessorType.PHENOM, SocketType.AM3));
        builder.setGraphicsCard(new GraphicsCard(1, TypeOfCard.DEDICATED, TypeOfGraphicsMemory.GDDR5));
        builder.setHddcapacity(500);
        builder.setRamMemory(new RamMemory(16, TypeOfRamMemory.DDR3));
        builder.setPowerSupply(new PowerSupply(500,230));
    }


    public void constructLaptop(LaptopBuilder builder) {
        builder.setCPU(new CPU(2.1, ProcessorBrand.INTEL, ProcessorType.CORE, SocketType.LGA));
        builder.setGraphicsCard(new GraphicsCard(2,TypeOfCard.INTEGRED,TypeOfGraphicsMemory.GDDR3));
        builder.setHddcapacity(1000);
        builder.setRamMemory(new RamMemory(12,TypeOfRamMemory.DDR4));
        builder.setDisplaySize(15.6);

    }


    public void constructTablet(TabletBuilder builder) {
        builder.setCPU(new CPU(3.2, ProcessorBrand.INTEL, ProcessorType.PENTIUM, SocketType.LGA));
        builder.setGraphicsCard(new GraphicsCard(0.512,TypeOfCard.DEDICATED,TypeOfGraphicsMemory.GDRR6));
        builder.setHddcapacity(1500);
        builder.setRamMemory(new RamMemory(4,TypeOfRamMemory.DDR4));
        builder.setDisplaySize(10);


    }

}
