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

    public String toString() {
        return "Student's info: \n name- "+ this.name + "\n family name - " + this.familyName+ "\n id -" + this.id;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public double getAverageMark(ArrayList<Integer> marks) {
        return averageMark;
    }

    public void setMarks (int mark){
       this.marks.add(mark);
        int sum = 0;
        for (Integer el : marks) {
            sum += el;
        }
        averageMark = (double) sum / marks.size();
    }

    public String getInfo (){
        return this.toString();
    }

}
