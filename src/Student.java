import java.util.ArrayList;

public class Student extends Person{
    private ArrayList<String> subjects;
    private int graduationYear;

    public Student(String newName, int newAge, char newSex, ArrayList<String> newSubjects, int newGraduationYear){
        super(newName, newAge, newSex); //use the super method to call the constructor of the super class (Person in this case)
        //after calling super, you can then initialize the special attributes of the subclass
        subjects = newSubjects;
        graduationYear = newGraduationYear;
    }


    public String Study(){
        return "I am studying!";
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public String showSubjects(){
        String subjectNames = "";

        for(String i: subjects){
            subjectNames += "\n" + i;
        }

        return subjectNames;
    }


}
