import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TeacherGroup teacherGroup = new TeacherGroup();
        TeacherService teacherService = new TeacherService(teacherGroup);
        TeacherController teacherController = new TeacherController(teacherService);

        teacherController.createTeacher("Ольга", "Николаевна", "Ковалева","Физика");
        teacherController.createTeacher("Олег", "Евгеньевич", "Быстров","Химия");
        teacherController.createTeacher("Иван", "Алексеевич", "Аксенов","География");
        TeacherView teacherView = new TeacherView();
        teacherView.sendOnConsole(teacherGroup.getTeacherList());
        System.out.println("----------------------------------");
        teacherController.editTeacher("Ольга", "Николаевна", "Ковалева","Астрономия");
        teacherView.sendOnConsole(teacherGroup.getTeacherList());
    }




    /* //--------------------------------------------------------------------------
        List<Student> students1 = new ArrayList<>();
        students1.add (new Student(1L, "Пётр", "Петрович", "Петров"));
        students1.add (new Student(2L, "Иван", "Иванович", "Иванов"));
        students1.add (new Student(3L, "Сидор", "Сидорович", "Сидоров"));

        List<Student> students2 = new ArrayList<>();
        students2.add (new Student(4L, "Максим", "Максимович", "Максимов"));
        students2.add (new Student(5L, "Антон", "Антонович", "Антонов"));


        StudentGroup studentGroup = new StudentGroup(students1);

        StudentGroupService studentGroupService = new StudentGroupService(studentGroup);
        List<Student> sortedList = studentGroupService.getSortedStudentByFIO();
        System.out.println(sortedList);

        studentGroupService.removeStudentByFIO("Пётр", "Петрович", "Петров");
        System.out.println(studentGroup.getStudentList());


        StudentGroup studentGroup1 = new StudentGroup(students1);
        StudentGroup studentGroup2 = new StudentGroup(students2);

        List<StudentGroup> groups = new ArrayList<>();
        groups.add(studentGroup1);
        groups.add(studentGroup2);

        Stream stream1 = new Stream("Группа 1", groups);
        Stream stream2 = new Stream("Группа 2", groups);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        StreamService streamService = new StreamService();
        List<Stream> sortedStreams = streamService.getSortedStream(streams);
        System.out.println(sortedStreams);
        */
}