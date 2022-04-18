package builder.builders;

import builder.components.CPU;
import builder.components.GraphicsCard;
import builder.components.RamMemory;

public interface Builder {

    void setCPU(CPU cpu);
    void setGraphicsCard(GraphicsCard graphicsCard);
    void setRamMemory(RamMemory ramMemory);
    void setHddcapacity(int hddCapacity);

}
