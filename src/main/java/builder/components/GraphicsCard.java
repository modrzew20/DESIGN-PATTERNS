package builder.components;

import builder.components.enums.TypeOfCard;
import builder.components.enums.TypeOfGraphicsMemory;

public class GraphicsCard {

    private double graficMemory;
    private TypeOfCard typeOfCard;
    private TypeOfGraphicsMemory typeOfMemory;


    public GraphicsCard(double graficMemory, TypeOfCard typeOfCard, TypeOfGraphicsMemory typeOfMemory) {
        this.graficMemory = graficMemory;
        this.typeOfCard = typeOfCard;
        this.typeOfMemory = typeOfMemory;
    }

    @Override
    public String toString() {
        return  "graficMemory=" + graficMemory +
                ", typeOfCard=" + typeOfCard +
                ", typeOfMemory=" + typeOfMemory;
    }
}

