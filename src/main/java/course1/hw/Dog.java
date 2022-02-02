package course1.hw;

public class Dog extends Animal {

    private static final int MAX_RUN_DISTANCE = 200;
    private static final int MAX_SWIM_DISTANCE = 20;

    @Override
    public void run(int distance) {
        if (distance > MAX_RUN_DISTANCE) {
            System.out.println("Dog doesn't want to run");
            return;
        }
        super.run(distance);
    }

    @Override
    public void swim(int distance) {
        if (distance > MAX_SWIM_DISTANCE) {
            System.out.println("Dog doesn't want to swim");
            return;
        }
        System.out.println("Dog swan " + distance + " meters");
    }

    @Override
    int getMaxRunDistance() {
        return MAX_RUN_DISTANCE;
    }

    @Override
    int getMaxSwimDistance() {
        return MAX_SWIM_DISTANCE;
    }
}
