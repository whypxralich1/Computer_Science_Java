public class GuardWorker extends Employee implements Worker {
    private String shiftTime;
    private int patrolsPerNight;

    public GuardWorker(String name, String surname, String gender, boolean active, String position, double payment, int experience, String department, String shiftTime, int patrolsPerNight) {
        super(name, surname, gender, active, position, payment, experience, department);
        this.shiftTime = shiftTime;
        this.patrolsPerNight = patrolsPerNight;
    }

    @Override
    public void work() {
        System.out.println(getName() + " патрулирует в " + shiftTime);
    }

    //геттеры и сеттеры
    public String getShiftTime() {
        return shiftTime;
    }

    public void setShiftTime(String shiftTime)  {
        this.shiftTime = shiftTime;
    }

    public int getPatrolsPerNight() {
        return patrolsPerNight;
    }

    public void setPatrolsPerNight(int patrolsPerNight) {
        this.patrolsPerNight = patrolsPerNight;
    }
}
