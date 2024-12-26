import java.util.Comparator;

class AverageGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getAverageGrade(), s2.getAverageGrade());
    }
}

class ScholarshipComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getScholarship(), s2.getScholarship());
    }
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}

class AttendancePercentageComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getAttendancePercentage(), s2.getAttendancePercentage());
    }
}
