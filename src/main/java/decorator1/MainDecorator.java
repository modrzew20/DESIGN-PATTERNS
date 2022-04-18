package decorator1;

public class MainDecorator implements Component {

    Component source;

    public MainDecorator(Component source) {
        this.source = source;
    }

    @Override
    public double updatePrice() {
        return source.updatePrice();
    }

    @Override
    public String addDescription() {
        return source.addDescription();
    }
}
