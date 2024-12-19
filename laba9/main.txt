public class Main {
    public static void main(String[] args) {
        Group group = new Group();

        group.addStudent();
        Student student = new Student(18, "Male", "Максим", "Глянцев", "Андреевич", 2, 4.3);
        group.addStudent(student);
        
        group.removeStudent(1);
        
        Student s = group.getStudent(0);
        if (s != null) {
            System.out.println("Имя: " + s.firstName);
        }
    }
}