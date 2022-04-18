package builder.components;

import builder.components.enums.TypeOfRamMemory;

public class RamMemory {
    private int memoryCapacity;
    private TypeOfRamMemory typeOfRamMemory;

    public RamMemory(int memoryCapacity, TypeOfRamMemory typeOfRamMemory) {
        this.memoryCapacity = memoryCapacity;
        this.typeOfRamMemory = typeOfRamMemory;
    }

    @Override
    public String toString() {
        return " memoryCapacity=" + memoryCapacity +
                ", typeOfRamMemory=" + typeOfRamMemory;
    }
}

