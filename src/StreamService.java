import java.util.List;
import java.util.stream.Collectors;

public class StreamService {

    public List<Stream> getSortedStream (List<Stream> streamList){

        return streamList.stream().sorted(new StreamComparator()).collect(Collectors.toList());
    }
}
