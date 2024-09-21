import java.util.List;

public class Controller {

    private final StudentGroupService studentGroupService;
    private final StreamService streamService;

    public Controller(StudentGroupService studentGroupService, StreamService streamService) {
        this.studentGroupService = studentGroupService;
        this.streamService = streamService;
    }

    public void removeStudentByFIO(String firstName,  String middleName, String lastName){
        studentGroupService.removeStudentByFIO(firstName, middleName, lastName);
    }

    public List<Student> getSortedStudentList(){
        return studentGroupService.getSortedStudentList();
    }
    public List<Student> getSortedStudentByFIO() {
        return studentGroupService.getSortedStudentByFIO();
    }

    public List<Stream> getSortedStream (List<Stream> streamList){
        return streamService.getSortedStream(streamList);
    }
}
