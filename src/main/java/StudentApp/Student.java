package StudentApp;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private String familyName;
    private ArrayList<Integer> marks;
    private double averageMark;

    public Student(int id, String name, String familyName) {
        this.id = id;
        this.name = name;
        this.familyName = familyName;
    }

    public String toString() {
        return "Student's info: \n name- " + this.name + "\n family name - " + this.familyName + "\n id -" + this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public double getAverageMark() {
        return this.averageMark;
    }

    public void setMarks(int mark) {
        int sum = 0;

        this.marks.add(mark);

        for (Integer grade : marks) {
            sum += grade;
        }

        this.averageMark = (double) sum / this.marks.size();
    }

    public String getInfo() {
        return this.toString();
    }
}
