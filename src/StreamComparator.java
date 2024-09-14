import java.util.Comparator;

public class StreamComparator implements Comparator <Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        int s1 = o1.getStream().size();
        int s2 = o2.getStream().size();
        return Integer.compare(s1, s2);
    }
}
