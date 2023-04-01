public class Puffenduy extends Hogwarts{
    private int hardWorking;
    private int honest;
    private int loyal;

    public Puffenduy(String fullName, int powerOfMagic, int transgressionDistance, int hardWorking, int honest, int loyal) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.hardWorking = hardWorking;
        this.honest = honest;
        this.loyal = loyal;
    }

    public int getHardWorking() {
        return hardWorking;
    }

    public int getHonest() {
        return honest;
    }

    public int getLoyal() {
        return loyal;
    }

    @Override
    public String toString() {
        return "Puffenduy{" +
                "hardWorking=" + hardWorking +
                ", honest=" + honest +
                ", loyal=" + loyal +
                "fullName='" + getFullName() + ' ' +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                '}';
    }

    private int getAbilitiesSum() {
        return hardWorking + loyal + honest;
    }

    public static void compare(Puffenduy student1, Puffenduy student2) {
        int student1Sum = student1.getAbilitiesSum();
        int student2Sum = student2.getAbilitiesSum();

        if (student1Sum >= student2Sum) {
            System.out.println(" Студент " + student1.getFullName() + " лучше чем " + student2.getFullName());
        } else {
            System.out.println(" Студент " + student2.getFullName() + " лучше чем " + student1.getFullName());
        }
    }
}
