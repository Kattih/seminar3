import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {

    private int count;
    private final List<Teacher> teacherList;

    public TeacherGroupIterator(TeacherGroup teacherGroup) {
        this.teacherList = teacherGroup.getTeacherList();
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < teacherList.size();
    }

    @Override
    public Teacher next() {
        if(!hasNext()){
            return null;
        }
        count++;
        return teacherList.get(count);//возвращает текущее значение (студента)
        // по индексу count (count от 0 до studentList.size()-1)
    }
    @Override
    public void remove() {
        teacherList.remove(count);
    }
}
