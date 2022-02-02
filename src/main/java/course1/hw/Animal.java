package course1.hw;

public abstract class Animal {
    protected String name;
    public static int animalCount = 0;

    public Animal() {
        animalCount++;
    }

    public void run(int distance) {
        if (distance > getMaxRunDistance()) {
            return;
        }
        System.out.println("Running " + distance);
    }

    public void swim(int distance) {
        if (distance > getMaxSwimDistance()) {
            return;
        }
        System.out.println("Swimming " + distance);
    }

    abstract int getMaxRunDistance();

    abstract int getMaxSwimDistance();

    public String getClazz() {
        return this.getClass().getSimpleName();
    }


}
