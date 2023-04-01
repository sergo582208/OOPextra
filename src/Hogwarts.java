public class Hogwarts extends Main {
    private String fullName;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String fullName, int powerOfMagic, int transgressionDistance) {
        this.fullName = fullName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
    private int getAbilitiesSum() {
        return powerOfMagic + transgressionDistance;
    }
    public static void compare(Hogwarts student1 , Hogwarts student2){
        int student1Sum = student1.getAbilitiesSum();
        int student2Sum = student2.getAbilitiesSum();

        if (student1Sum >= student2Sum) {
            System.out.println(" Студент " + student1.getFullName() + " лучше чем " + student2.getFullName());
        } else {
            System.out.println(" Студент " + student2.getFullName() + " лучше чем " + student1.getFullName());
        }
    }
}
