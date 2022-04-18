package chain_of_responsibility;

public abstract class Handler{

    Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    abstract boolean check(Rent obj,DataBase dataBase);


    boolean checkNext(Rent obj,DataBase dataBase) {
        if (next == null) {
            return true;
        }
        return next.check(obj, dataBase);
    }

}
