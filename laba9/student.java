public class Student {
    private int age;
    private String gender;
    private String firstName;
    private String lastName;
    private String patronymic;
    private int course;
    private double averageScore;

    public Student() {
    }

    public Student(int age, String gender, String firstName, String lastName, String patronymic, int course, double averageScore) {
        setAge(age);
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.course = course;
        this.averageScore = averageScore;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) throws NotCorrectAgeException {
        if (age < 16 || age > 60) {
            throw new NotCorrectAgeException("возраст должен быть от 16 до 60 лет.");
        }
        this.age = age;
    } 
    public class NotCorrectAgeException extends Exception {
        public NotCorrectAgeException(String message) {
            super(message);
    }
}

