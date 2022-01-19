package course1.lesson6;


//Is a
public class Van extends Car{

    int seats;

    public Van(String model, int year, int seats) {
        super(model, year);
        System.out.println("this is a van constructor");
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
