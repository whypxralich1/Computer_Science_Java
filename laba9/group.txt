import java.util.Scanner;

public class Group {
    private Student[] students;
    private int count;
    private final int MAX_STUDENTS = 15;

    public Group() {
        students = new Student[MAX_STUDENTS];
        count = 0;
    }

    public void addStudent() {
        if (count >= MAX_STUDENTS) {
            System.out.println("Группа переполнена. Нельзя добавить студента.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        try {
            student.setAge(age);
        } catch (NotCorrectAgeException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.print("Введите пол студента: ");
        student.gender = scanner.next();
        System.out.print("Введите имя студента: ");
        student.firstName = scanner.next();
        System.out.print("Введите фамилию студента: ");
        student.lastName = scanner.next();
        System.out.print("Введите отчество студента: ");
        student.patronymic = scanner.next();
        System.out.print("Введите курс студента: ");
        student.course = scanner.nextInt();
        System.out.print("Введите средний бал студента: ");
        student.averageScore = scanner.nextDouble();

        students[count++] = student;
        System.out.println("Студент был успешно добавлен.");
    }

    public void addStudent(Student student) {
        if (count >= MAX_STUDENTS) {
            System.out.println("Группа переполнена. Нельзя добавить студента.");
            return;
        }

        students[count++] = student;
        System.out.println("Студент был успешно добавлен.");
    }

    //удаление студента
    public void removeStudent(int index) {
        if (count <= 3) {
            System.out.println("Невозможно удалить студента. В группе должно быть минимум 3 студента.");
            return;
        }

        if (index < 0 || index >= count) {
            System.out.println("Ошибка. Некорректный индекс студента.");
            return;
        }
        for (int i = index; i < count - 1; i++) {
            students[i] = students[i + 1];
        }

        students[--count] = null;
        System.out.println("Студент был успешно удален.");
    }

    public Student getStudent(int index) {
        if (index < 0 || index >= count) {
            System.out.println("Ошибка. Некорректный индекс студента.");
            return null;
        }
        return students[index];
    }
}