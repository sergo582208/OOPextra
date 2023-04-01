public class Slizerin extends Hogwarts {
    private int cunning;
    private int determined;
    private int ambitious;
    private int resourceful;
    private int hungryForPower;

    public Slizerin(String fullName, int powerOfMagic, int transgressionDistance, int cunning, int determined, int ambitious, int resourceful, int hungryForPower) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determined = determined;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.hungryForPower = hungryForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermined() {
        return determined;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public int getResourceful() {
        return resourceful;
    }

    public int getHungryForPower() {
        return hungryForPower;
    }

    @Override
    public String toString() {
        return "Slizerin{" +
                "cunning=" + cunning +
                ", determined=" + determined +
                ", ambitious=" + ambitious +
                ", resourceful=" + resourceful +
                ", hungryForPower=" + hungryForPower +
                "fullName='" + getFullName() + ' ' +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                '}';
    }

    private int getAbilitiesSum() {
        return cunning + determined + ambitious;
    }

    public static void compare(Slizerin student1, Slizerin student2) {
        int student1Sum = student1.getAbilitiesSum();
        int student2Sum = student2.getAbilitiesSum();

        if (student1Sum >= student2Sum) {
            System.out.println(" Студент " + student1.getFullName() + " лучше чем " + student2.getFullName());
        } else {
            System.out.println(" Студент " + student2.getFullName() + " лучше чем " + student1.getFullName());
        }
    }
}
