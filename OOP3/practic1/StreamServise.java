package practic1;

import java.util.Collections;
import java.util.List;

public class StreamServise {


    public static void sortus(List<StudentStream> streamList){
        Collections.sort(streamList, new StreamComparator());

    }
}
