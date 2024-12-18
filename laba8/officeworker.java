public class OfficeWorker extends Employee implements Worker {
    private String project;
    private int meetingsPerWeek;

    public OfficeWorker(String name, String surname, String gender, boolean active, String position, double payment, int experience, String department, String project, int meetingsPerWeek) {
        super(name, surname, gender, active, position, payment, experience, department);
        this.project = project;
        this.meetingsPerWeek = meetingsPerWeek;
    }

    @Override
    public void work() {
        System.out.println(getName() +  занят проектом/работает над проектом  + project);
    }
    //геттеы и сеттеры
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getMeetingsPerWeek() {
        return meetingsPerWeek;
    }

    public void setMeetingsPerWeek(int meetingsPerWeek) {
        this.meetingsPerWeek = meetingsPerWeek;
    }
}
