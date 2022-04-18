package builder.PCs;

import builder.components.CPU;
import builder.components.GraphicsCard;
import builder.components.PowerSupply;
import builder.components.RamMemory;

public class PC {

    private final CPU cpu;
    private final GraphicsCard graphicsCard;
    private final PowerSupply powerSupply;
    private final RamMemory ramMemory;
    private int HDDCapacity;

    public PC(CPU cpu, GraphicsCard graphicsCard, PowerSupply powerSupply, RamMemory ramMemory, int HDDCapacity) {
        this.cpu = cpu;
        this.graphicsCard = graphicsCard;
        this.powerSupply = powerSupply;
        this.ramMemory = ramMemory;
        this.HDDCapacity = HDDCapacity;
    }


    @Override
    public String toString() {
        return "PC \n" +
                "cpu : " + cpu +
                ", \ngraphicsCard : " + graphicsCard +
                ", \npowerSupply : " + powerSupply +
                ", \nramMemory : " + ramMemory +
                ", \nHDDCapacity : " + HDDCapacity + "\n";
    }
}
