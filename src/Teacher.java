public class Teacher extends User {

    private String teacherSubject;

    public Teacher(String firstName, String middleName, String lastName, String teacherSubject) {
        super(firstName,  middleName, lastName);
        this.teacherSubject = teacherSubject;
    }

    public String getTeacherSubject() {
        return teacherSubject;
    }

    public void setTeacherSubject(String teacherSubject) {
        this.teacherSubject = teacherSubject;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getMiddleName() + " " + getLastName() + ", " + teacherSubject;
    }
}
