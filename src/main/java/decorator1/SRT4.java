package decorator1;

public class SRT4 extends MainDecorator{
    public SRT4(Component source) {
        super(source);
    }

    @Override
    public double updatePrice() {
        return super.updatePrice() + 5000;
    }

    @Override
    public String addDescription() {
        return super.addDescription() + " Pakiet SRT4 ";
    }
}
