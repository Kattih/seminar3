public class Student extends User implements Comparable<Student>{
    private Long studentID;

    public Student(Long studentID, String firstName, String middleName, String lastName) {
        super(firstName,  middleName, lastName);
        this.studentID = studentID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentID.compareTo(o.studentID);
    }

    @Override
    public String toString() {
        return "Student {" +
                "studentID = " + studentID + '}';
    }
}
