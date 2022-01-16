package course1.lesson5;

import java.util.Random;

public class DemoApp {

    public static void main(String[] args) {
        Car car = new Car("Dodge", 2020);



        car.info();
        car.printModel();

        car.crash();
        car.info();


        String carModel = car.getModel();

        //car.year = -100;

        //Car.info() - нельзя, так как нее статический



      /*  Car car2 = new Car();
        car2.model = "Ford";
        car2.year = 1990;
        car2.wheelsNumber = 6;

        System.out.println("Model = " + car.model + " year=" + car.year + " wasCrashed=" + car.wasCrashed + " wheelsNumber = " + car.wheelsNumber);
        System.out.println("Model = " + car2.model + " year=" + car2.year + " wasCrashed=" + car2.wasCrashed + " wheelsNumber = " + car2.wheelsNumber);


        int wheelsNumber = Car.wheelsNumber;
        String model = car.model;
*/

        //Car[] cars = {car, car2};

        //stringpool

        String str = new String("newString");

        Robot[] robots = new Robot[10];
        for(int i=0; i< robots.length; i++) {
            robots[i] = new Robot("Robot"+i, i+10);
        }

        for(Robot robot : robots) {
            robot.info();
        }

    }
}
