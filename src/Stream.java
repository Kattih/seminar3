import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{

    private String name;
    private List<StudentGroup> stream;

    public Stream(String name, List<StudentGroup> stream) {
        this.name = name;
        this.stream = stream;
    }

    public String getName() {
        return name;
    }

    public List<StudentGroup> getStream() {
        return stream;
    }

    public void setStream(List<StudentGroup> stream) {
        this.stream = stream;
    }

    @Override
    public String toString() {
        return "Stream{ " +
                "name = '" + name + '\'' +
                ", stream = " + stream +
                '}';
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return stream.iterator();
    }
}
