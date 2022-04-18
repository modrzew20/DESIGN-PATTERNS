package chain_of_responsibility;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        DataBase dataBase = new DataBase();
        Client client1 = new Client("Adam","11");
        Client client2 = new Client("Adam","12");
        Room room = new Room(1);
        Room room2 = new Room(2);
        dataBase.add(client1);
        dataBase.add(room);

        Handler handler = new ClientHandler();
        handler.setNext(new RoomHandler()).setNext(new RentHandler());
        dataBase.setHandler(handler);

        Rent rent = new Rent(client1,room, LocalDate.parse("2021-06-19"),LocalDate.parse("2021-06-22"));
        Rent rent1 = new Rent(client1,room, LocalDate.parse("2021-06-18"),LocalDate.parse("2021-06-23"));
        Rent rent2 = new Rent(client2,room, LocalDate.parse("2021-06-10"),LocalDate.parse("2021-06-15"));
        Rent rent3 = new Rent(client1,room2, LocalDate.parse("2021-06-10"),LocalDate.parse("2021-06-15"));




        if(dataBase.getPermission(rent,dataBase)) System.out.println("Dodano rezerwacje - jest klient , pokoj w bazie i wolny termin");
        else System.out.println("Błąd");

        if(dataBase.getPermission(rent1,dataBase)) System.out.println("Dodano rezerwacje");
        else System.out.println("Błąd - zajety pokoj w tym terminie");

        if(dataBase.getPermission(rent2,dataBase)) System.out.println("Dodano rezerwacje");
        else System.out.println("Błąd - brak klienta w bazie");

        if(dataBase.getPermission(rent3,dataBase)) System.out.println("Dodano rezerwacje");
        else System.out.println("Błąd - brak pokoju w bazie");
    }
}
