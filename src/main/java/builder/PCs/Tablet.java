package builder.PCs;

import builder.components.CPU;
import builder.components.GraphicsCard;
import builder.components.RamMemory;

public class Tablet {
    private final CPU cpu;
    private final GraphicsCard graphicsCard;
    private final RamMemory ramMemory;
    private int HDDCapacity;
    private double DisplaySize;

    public Tablet(CPU cpu, GraphicsCard graphicsCard, RamMemory ramMemory, int HDDCapacity, double displaySize) {
        this.cpu = cpu;
        this.graphicsCard = graphicsCard;
        this.ramMemory = ramMemory;
        this.HDDCapacity = HDDCapacity;
        DisplaySize = displaySize;
    }

    @Override
    public String toString() {
        return "Tablet \n" +
                "cpu : " + cpu +
                ", \ngraphicsCard : " + graphicsCard +
                ", \nramMemory : " + ramMemory +
                ", \nHDDCapacity : " + HDDCapacity +
                ", \nDisplaySize : " + DisplaySize + "\n";
    }
}
