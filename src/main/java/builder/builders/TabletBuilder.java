package builder.builders;

import builder.PCs.Tablet;
import builder.components.CPU;
import builder.components.GraphicsCard;
import builder.components.RamMemory;

public class TabletBuilder implements Builder {

    private CPU cpu;
    private GraphicsCard graphicsCard;
    private RamMemory ramMemory;
    private int hddcapacity;
    private double displaySize;


    @Override
    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public void setRamMemory(RamMemory ramMemory) {
        this.ramMemory = ramMemory;
    }

    @Override
    public void setHddcapacity(int hddcapacity) {
        this.hddcapacity = hddcapacity;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public Tablet getResult() {return new Tablet(cpu,graphicsCard,ramMemory, hddcapacity, displaySize);}

}
