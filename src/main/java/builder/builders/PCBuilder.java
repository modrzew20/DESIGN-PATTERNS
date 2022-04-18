package builder.builders;

import builder.PCs.PC;
import builder.components.CPU;
import builder.components.GraphicsCard;
import builder.components.PowerSupply;
import builder.components.RamMemory;

public class PCBuilder implements Builder{


    private CPU cpu;
    private GraphicsCard graphicsCard;
    private RamMemory ramMemory;
    private PowerSupply powerSupply;
    private int hddCapacity;



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
    public void setHddcapacity(int hddCapacity) {
        this.hddCapacity = hddCapacity;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }


    public PC getResult() {return new PC(cpu,graphicsCard,powerSupply,ramMemory,hddCapacity);}



}
