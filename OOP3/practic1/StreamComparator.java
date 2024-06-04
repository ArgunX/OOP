package practic1;

import java.util.Comparator;

public class StreamComparator implements Comparator<StudentStream> {


    @Override
    public int compare(StudentStream studentGroups, StudentStream t1) {
        return t1.stream.size()-studentGroups.stream.size();
    }
}
