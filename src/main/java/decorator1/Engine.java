package decorator1;

public class Engine implements Component{


    @Override
    public double updatePrice() {
        return 5000;
    }

    @Override
    public String addDescription() {
        return " silnik taki fajny ";
    }
}
