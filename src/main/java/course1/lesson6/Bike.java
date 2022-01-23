package course1.lesson6;

public class Bike extends Transport{
    int wheelsNumber;

    public Bike(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    @Override
    public void wroomWroom() {
        System.out.println("BZZZZZZZ");
    }


    @Override
    public void printInventionDate() {
        //any other logic
        System.out.println("1950");
    }

    public final boolean requireHelmet() {
        return true;
    }
}
