package university.students;

public class StudentRecord {
    private Student student;
    private String grade;
    public StudentRecord(Student student, String grade) {
        this.student = student;
        this.grade = grade;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
}
