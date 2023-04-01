public class Griffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int courage;

    public Griffindor(String fullName, int powerOfMagic, int transgressionDistance, int nobility, int honour, int courage) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getCourage() {
        return courage;
    }

    @Override
    public String toString() {
        return "Gryfindor{" +
                "nobility=" + nobility +
                ", honour=" + honour +
                ", courage=" + courage +
                ", fullName='" + getFullName() + ' ' +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                '}';
    }
    private int getAbilitiesSum(){
        return nobility+honour+courage;
    }
    public static void compare(Griffindor student1, Griffindor student2){
        int student1Sum = student1.getAbilitiesSum();
        int student2Sum = student2.getAbilitiesSum();


        if(student1Sum >= student2Sum){
            System.out.println(" Студент " + student1.getFullName() + " лучше чем " + student2.getFullName());
        }else {
            System.out.println(" Студент " + student2.getFullName() + " лучше чем " + student1.getFullName());
        }
    }
}

