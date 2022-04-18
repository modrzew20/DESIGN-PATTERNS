package strategy.strategies;

import java.util.ArrayList;

public class Points {
    String name;
    ArrayList <Box> boxes = new ArrayList<Box>();

    public Points(String name) {
        this.name = name;
        for(int i=0;i<9;i++){
            for(int j =0; j<9;j++)
            if(i<3) boxes.add(new Box(i,j,Size.A,true));
            else if (i<6) boxes.add(new Box(i,j,Size.B,true));
            else boxes.add(new Box(i,j,Size.C,true));
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList getBoxes() {
        return boxes;
    }
}

class Box {
    int x,y;
    Size size;
    boolean free;

    public Box(int x, int y, Size size, boolean free) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.free =  free;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public Size getSize() {
        return size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

enum Size {
    A,B,C
}