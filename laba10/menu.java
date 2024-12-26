import java.util.*;

public class StudentStatisticsApp {
    private static TreeSet<Student> studentsByScholarship = new TreeSet<>(new ScholarshipComparator());
    private static TreeSet<Student> studentsByAverageGrade = new TreeSet<>(new AverageGradeComparator());
    private static TreeSet<Student> studentsByAge = new TreeSet<>(new AgeComparator());
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Меню:");
            System.out.print("Выберите действие: ");
            System.out.println("1. Добавить студента");
            System.out.println("2. Удалить студента");
            System.out.println("3. Изменить оценку студента");
            System.out.println("4. Изменить размер стипендии студента");
            System.out.println("5. Добавить отметку о посещении/не посещении");
            System.out.println("6. Отобразить список студентов");
            System.out.println("0. Выход");
            

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        removeStudent();
                        break;
                    case 3:
                        changeAverageGrade();
                        break;
                    case 4:
                        changeScholarship();
                        break;
                    case 5:
                        addAttendance();
                        break;
                    case 6:
                        displayStudents();
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Некорректный выбор. Попробуйте снова.");
                }
            } catch (NumberFormatException e) {
                System.out.println("ошибка. пожалуйста, введите число.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void addStudent() {
        System.out.print("введите имя: ");
        String firstName = scanner.nextLine();
        System.out.print("введите фамилию: ");
        String lastName = scanner.nextLine();
        System.out.print("введите отчество: ");
        String middleName = scanner.nextLine();
        System.out.print("введите возраст: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("введите среднюю оценку: ");
        double averageGrade = Double.parseDouble(scanner.nextLine());
        System.out.print("введите размер стипендии: ");
        double scholarship = Double.parseDouble(scanner.nextLine());
        System.out.print("введите количество посещенных занятий: ");
        int attendedClasses = Integer.parseInt(scanner.nextLine());
        System.out.print("введите количество пропущенных занятий: ");
        int missedClasses = Integer.parseInt(scanner.nextLine());
        System.out.print("введите пол: ");
        String gender = scanner.nextLine();

        Student student = new Student(firstName, lastName, middleName, age, averageGrade, scholarship, attendedClasses, missedClasses, gender);
        studentsByScholarship.add(student);
        studentsByAverageGrade.add(student);
        studentsByAge.add(student);
        System.out.println("студент был успешно добавлен.");
    }

    private static void removeStudent() {
        System.out.print("введите фамилию студента для удаления: ");
        String lastName = scanner.nextLine();
        Student toRemove = null;

        for (Student student : studentsByScholarship) {
            if (student.getLastName().equalsIgnoreCase(lastName)) {
                toRemove = student;
                break;
            }
        }

        if (toRemove != null) {
            studentsByScholarship.remove(toRemove);
            studentsByAverageGrade.remove(toRemove);
            studentsByAge.remove(toRemove);
            System.out.println("студент был успешно удален.");
        } else {
            System.out.println("такой студент не найден.");
        }
    }

    private static void changeAverageGrade() {
        System.out.print("введите фамилию студента: ");
        String lastName = scanner.nextLine();
        Student student = findStudentByLastName(lastName);
        if (student != null) {
            System.out.print("введите новую среднюю оценку: ");
            double newGrade = Double.parseDouble(scanner.nextLine());
            studentsByAverageGrade.remove(student);
            student.setAverageGrade(newGrade);
            studentsByAverageGrade.add(student);
            System.out.println("средняя оценка была успешно обновлена.");
        } else {
            System.out.println("такой студент не найден.");
        }
    }

    private static void changeScholarship() {
        System.out.print("введите фамилию студента: ");
        String lastName = scanner.nextLine();
        Student student = findStudentByLastName(lastName);
        if (student != null) {
            System.out.print("введите новый размер стипендии: ");
            double newScholarship = Double.parseDouble(scanner.nextLine());
            studentsByScholarship.remove(student);
            student.setScholarship(newScholarship);
            studentsByScholarship.add(student);
            System.out.println("размер стипендии был успешно обновлен.");
        } else {
            System.out.println("такой студент не найден.");
        }
    }

    private static void addAttendance() {
        System.out.print("введите фамилию студента: ");
        String lastName = scanner.nextLine();
        Student student = findStudentByLastName(lastName);
        if (student != null) {
            System.out.print("введите 1 для посещения или 0 для пропуска: ");
            boolean attended = scanner.nextLine().equals("1");
            student.addAttendance(attended);
            System.out.println("запись о посещении была обновлена.");
        } else {
            System.out.println("такой студент не найден.");
        }
    }

    private static void displayStudents() {
        System.out.println("Сортировка по:");
        System.out.println("1. стипендии");
        System.out.println("2. средней оценке");
        System.out.println("3. возрасту");
        System.out.print("выберите параметр: ");
        int sortChoice = Integer.parseInt(scanner.nextLine());

        switch (sortChoice) {
            case 1:
                studentsByScholarship.forEach(System.out::println);
                break;
            case 2:
                studentsByAverageGrade.forEach(System.out::println);
                break;
            case 3:
                studentsByAge.forEach(System.out::println);
                break;
            default:
                System.out.println("ошибка. некорректный выбор.");
        }
    }

    private static Student findStudentByLastName(String lastName) {
        for (Student student : studentsByScholarship) {
            if (student.getLastName().equalsIgnoreCase(lastName)) {
                return student;
            }
        }
        return null;
    }
}
