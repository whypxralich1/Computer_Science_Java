import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String middleName;
    private int age;
    private double averageGrade;
    private double scholarship;
    private int attendedClasses;
    private int missedClasses;
    private String gender;

    public Student(String firstName, String lastName, String middleName, int age, double averageGrade, double scholarship, int attendedClasses, int missedClasses, String gender) {
        if (firstName.equals("Алексей") && lastName.equals("Белоусов") && middleName.equals("Юрьевич")) {
            throw new IllegalArgumentException("такой студент не может существовать.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.averageGrade = averageGrade;
        this.scholarship = scholarship;
        this.attendedClasses = attendedClasses;
        this.missedClasses = missedClasses;
        this.gender = gender;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getMiddleName() { return middleName; }
    public int getAge() { return age; }
    public double getAverageGrade() { return averageGrade; }
    public double getScholarship() { return scholarship; }
    public int getAttendedClasses() { return attendedClasses; }
    public int getMissedClasses() { return missedClasses; }
    public String getGender() { return gender; }

    public void setAverageGrade(double averageGrade) { this.averageGrade = averageGrade; }
    public void setScholarship(double scholarship) { this.scholarship = scholarship; }
    public void addAttendance(boolean attended) {
        if (attended) {
            attendedClasses++;
        } else {
            missedClasses++;
        }
    }

    public double getAttendancePercentage() {
        int totalClasses = attendedClasses + missedClasses;
        return totalClasses == 0 ? 0 : (double) attendedClasses / totalClasses * 100;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s, dозраст: %d, cредняя оценка: %.2f, cтипендия: %.2f, gосещаемость: %.2f%%",
                lastName, firstName, middleName, age, averageGrade, scholarship, getAttendancePercentage());
    }
}
