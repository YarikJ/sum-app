package StudentApp;

import java.util.ArrayList;

public class Student {
    private String name;
    private String familyName;
    private int id;
    private static int numStudent;
    ArrayList<Integer> marks;
    double averageMark;

    public Student (String name, String familyName){
        this.name = name;
        this.familyName = familyName;
        id = numStudent;
        numStudent++;
    }

    public String toString(Student person){
        return "Student's info: \n name- "+ person.name + "\n family name - " + person.familyName+ "\n id -" + person.id;
    }
    public String getName (){
        return name;
    }
    public String getFamilyName (){
        return familyName;
    }
    public double getAverageMark (ArrayList<Integer> marks) {
        if (marks.isEmpty()) return 0;
        else {
            int sum = 0;
            for (Integer el : marks) {
                sum += el;
            }
            return (double) sum / marks.size();
        }
    }
    public void setMarks (int mark){
       this.marks.add(mark);
    }

    public String getInfo (){
        return this.toString(this);
    }

}
