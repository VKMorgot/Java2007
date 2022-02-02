package course1.hw;

public class Cat extends Animal {

    private final int maxRunDistance;
    private final int maxSwimDistance;

    public Cat(int maxRunDistance, int maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    @Override
    public void run(int distance) {
        if (distance > maxRunDistance) {
            return;
        } else {
            super.run(distance);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats can't swim");
    }

    @Override
    int getMaxRunDistance() {
        return maxRunDistance;
    }

    @Override
    int getMaxSwimDistance() {
        return maxSwimDistance;
    }
}
