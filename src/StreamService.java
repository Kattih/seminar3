import java.util.List;

public class StreamService {

    public List<Stream> getSortedStream (List<Stream> streamList){

        streamList.stream().sorted(new StreamComparator());
        return streamList;
    }
}
