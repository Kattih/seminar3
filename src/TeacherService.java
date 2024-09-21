import java.util.List;

public class TeacherService {

    private final TeacherGroup teachers;

    public TeacherService(TeacherGroup teachers) {
        this.teachers = teachers;
    }

    public List <Teacher> createTeacher(String firstName, String middleName, String lastName, String subject){
        Teacher teacher = new Teacher(firstName, middleName, lastName,subject);
        teachers.getTeacherList().add(teacher);
        return teachers.getTeacherList();
    }

    public void editTeacher(String firstName, String middleName, String lastName,String subject){
        for (Teacher teacher: teachers.getTeacherList()){
            if (firstName.equals(teacher.getFirstName()) && lastName.equals(teacher.getLastName()) && middleName.equals(teacher.getMiddleName())){
                //teacher.setLastName(lastName);
                teacher.setTeacherSubject(subject);
                return;
            }
        }
        System.out.println("Учитель не найден");
    }
}
