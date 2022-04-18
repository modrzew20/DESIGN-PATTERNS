package strategy.pack;

import strategy.strategies.ShipmentStrategy;

public class Pack {

    public double lenght, width, height,weight;

    public Pack(double lenght, double width, double height, double weight) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public void proccessShipment(ShipmentStrategy strategy) {
        strategy.collectShipmentDetails(this);
    }


}
