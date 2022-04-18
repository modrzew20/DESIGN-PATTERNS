package builder.components;

public class PowerSupply {
    private int outputPower;
    private int InputPower;

    public PowerSupply(int outputPower, int inputPower) {
        this.outputPower = outputPower;
        InputPower = inputPower;
    }

    @Override
    public String toString() {
        return  "outputPower=" + outputPower +
                ", InputPower=" + InputPower;
    }
}
