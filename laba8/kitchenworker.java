public class KitchenWorker extends Employee implements Worker {
    private String specialty;
    private int shiftDuration;

    public KitchenWorker(String name, String surname, String gender, boolean active, String position, double payment, int experience, String department, String specialty, int shiftDuration) {
        super(name, surname, gender, active, position, payment, experience, department);
        this.specialty = specialty;
        this.shiftDuration = shiftDuration;
    }

    @Override
    public void work() {
        System.out.println(getName() + " готовит как " + specialty);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getShiftDuration() {
        return shiftDuration;
    }

    public void setShiftDuration(int shiftDuration) {
        this.shiftDuration = shiftDuration;
    }
}
