package builder.components;

import builder.components.enums.ProcessorBrand;
import builder.components.enums.ProcessorType;
import builder.components.enums.SocketType;

public class CPU {
    private double CPUFrequency;
    private ProcessorBrand processorBrand;
    private ProcessorType processorType;
    private SocketType socketType;

    public CPU(double CPUFrequency, ProcessorBrand processorBrand, ProcessorType processorType, SocketType socketType) {
        this.CPUFrequency = CPUFrequency;
        this.processorBrand = processorBrand;
        this.processorType = processorType;
        this.socketType = socketType;
    }

    @Override
    public String toString() {
        return  "CPUFrequency=" + CPUFrequency +
                ", processorBrand=" + processorBrand +
                ", processorType=" + processorType +
                ", socketType=" + socketType;
    }
}

