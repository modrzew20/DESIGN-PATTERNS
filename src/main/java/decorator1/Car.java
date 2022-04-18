package decorator1;

public class Car {

    String model,description="";
    double price;
    Component component;

    public Car(String model, double price, Component component) {
        this.model = model;
        this.description = description;
        this.price = price;
        this.component = component;
    }

    public String getModel() {
        return model;
    }

    public String getDescription() {
        return "Model: "+ getModel() + " ||| Wyposażenie:  " + description + component.addDescription() +" ||| ";
    }

    public double getPrice() {
        return price + component.updatePrice();
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
