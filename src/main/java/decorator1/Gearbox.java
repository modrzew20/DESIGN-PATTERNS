package decorator1;

public class Gearbox extends MainDecorator {

    public Gearbox(Component source) {
        super(source);
    }

    @Override
    public double updatePrice() {
        return 5000 + super.updatePrice();
    }

    @Override
    public String addDescription() {
        return " manualna skrzynia biegow " + super.addDescription();
    }
}
