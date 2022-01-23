package course1.lesson6;

public class Car extends Transport {

    protected String model;
    protected int year;


    public Car(String model, int year) {
        System.out.println("this is a car constructor");
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return model + " " + year;
    }




    void info() {
        System.out.println(this);
    }

    @Override
    public void wroomWroom() {
        System.out.println("Wrooooooom");
    }
}
