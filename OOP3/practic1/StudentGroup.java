package practic1;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    public StringBuilder students = new StringBuilder();
    public  String name;

    public StudentGroup(String name) {
        this.name = name;
    }

    public void addStudent(Student student){
        students.append(student).append(" ");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
