package chain_of_responsibility;

import java.time.LocalDate;

class ClientHandler extends Handler {

    boolean check (Rent r,DataBase dataBase) {
        boolean checked=false;
        for( Client client : dataBase.getClients()) {
            if (client.pesel.equals(r.c.pesel)) checked = true;
        }
        if(checked) return checkNext(r,dataBase);
        return false;
    }
}

class RoomHandler extends Handler {

    boolean check (Rent r,DataBase dataBase) {
        boolean checked=false;
        for( Room room : dataBase.getRooms()) {
            if (room.id == r.r.id) checked = true;
        }
        if(checked) return checkNext(r,dataBase);
        return false;
    }
}

class RentHandler extends Handler {

    boolean check (Rent r,DataBase dataBase) {
        boolean checked=false;
        for( Rent rent : dataBase.getRents()) {
            if (isOverlapping(r.checkin,r.checkout,rent.checkin,rent.checkout))
                    checked = true;
        }
        if(!checked) return checkNext(r,dataBase);
        return false;
    }

    boolean isOverlapping(LocalDate start1, LocalDate end1, LocalDate start2, LocalDate end2) {
        return !start1.isAfter(end2) && !start2.isAfter(end1);
    }


}