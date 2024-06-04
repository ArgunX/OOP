package practic1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StudentStream implements Iterable<StudentGroup>{
    List<StudentGroup> stream = new ArrayList<>();
    private int index = 0;



    public void addGroups(List<StudentGroup> group){
        this.stream.addAll(group);
    }

    @Override
    public String toString() {
        return "StudentStream{" +
                "stream=" + stream +
                '}';
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            @Override
            public boolean hasNext() {
                return index< stream.size();
            }

            @Override
            public StudentGroup next() {
                if(!hasNext()){
                return null;}
                return stream.get(index++);
            }
        };
    }


}
