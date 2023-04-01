public class Kogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int fullOFCreativity;

    public Kogtevran(String fullName, int powerOfMagic, int transgressionDistance, int smart, int wise, int witty, int fullOFCreativity) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOFCreativity = fullOFCreativity;
    }


    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOFCreativity() {
        return fullOFCreativity;
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", fullOFCreativity=" + fullOFCreativity +
                "fullName='" + getFullName() + ' ' +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                '}';
    }

    private int getAbilitiesSum() {
        return smart + wise + witty;
    }

    public static void compare(Kogtevran student1, Kogtevran student2) {
        int student1Sum = student1.getAbilitiesSum();
        int student2Sum = student2.getAbilitiesSum();

        if (student1Sum >= student2Sum) {
            System.out.println(" Студент " + student1.getFullName() + " лучше чем " + student2.getFullName());
        } else {
            System.out.println(" Студент " + student2.getFullName() + " лучше чем " + student1.getFullName());
        }
    }
}
