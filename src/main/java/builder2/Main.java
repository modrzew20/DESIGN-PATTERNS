package builder2;

public class Main {
    public static void main(String[] args) {
        Building building = new Building(1L,"łódzka",2,"993-02");
        building.setFlatsNumber(3);
        System.out.println(building);
    }
}
