import java.util.List;

public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public void editTeacher(String firstName, String middleName, String lastName, String subject){
        teacherService.editTeacher(firstName, middleName, lastName, subject);
    }

    public List<Teacher> createTeacher(String firstName, String middleName, String lastName, String subject){
        return teacherService.createTeacher(firstName, middleName, lastName, subject);
    }
}
