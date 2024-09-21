import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher>{

    private List<Teacher> teacherList;

    public TeacherGroup() {
        this.teacherList = new ArrayList<>();
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this);
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
}
