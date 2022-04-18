package chain_of_responsibility;

import java.util.ArrayList;

public class DataBase {

    ArrayList<Client> clients = new ArrayList<Client>();
    ArrayList<Room> rooms = new ArrayList<Room>();
    ArrayList<Rent> rents = new ArrayList<Rent>();
    Handler handler;

    public ArrayList<Client> getClients() {
        return clients;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<Rent> getRents() {
        return rents;
    }

    void add(Client client) {
        clients.add(client);
    }

    void add(Rent rent) {
        rents.add(rent);
    }

    void add(Room room){
        rooms.add(room);
    }


    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    boolean getPermission(Rent rent,DataBase dataBase){
        if(handler.check(rent , dataBase)) {
            dataBase.add(rent);
            return true;
        }
        return false;
    }
}
