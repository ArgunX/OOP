package practic1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentGroup group410 = new StudentGroup("410");
        StudentGroup group411 = new StudentGroup("411");
        StudentGroup group412 = new StudentGroup("412");
        StudentGroup group413 = new StudentGroup("413");
        StudentGroup group414 = new StudentGroup("414");
        StudentGroup group510 = new StudentGroup("510");
        StudentGroup group511 = new StudentGroup("511");
        StudentGroup group512 = new StudentGroup("512");
        StudentGroup group513 = new StudentGroup("513");
        StudentGroup group610 = new StudentGroup("610");
        StudentGroup group611 = new StudentGroup("611");

        StudentStream stream1  = new StudentStream();
        StudentStream stream2  = new StudentStream();
        StudentStream stream3  = new StudentStream();

        stream1.addGroups(List.of(group410,group411,group412,group413,group414));
        stream2.addGroups(List.of(group510,group511,group512,group513));
        stream3.addGroups(List.of(group610,group611));

        ArrayList<StudentStream> streams = new ArrayList<>(List.of(stream2,stream1,stream3));

        System.out.println("=========До сортировки=========");
        for(StudentStream stream: streams){
            System.out.println(stream);
        }
        StreamServise.sortus(streams);
        System.out.println("=========После сортировки=========");
        for(StudentStream stream: streams){
            System.out.println(stream);
        }







    }
}
