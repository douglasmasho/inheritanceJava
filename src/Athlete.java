import java.util.ArrayList;

public class Athlete extends Person{
    private int medals;
    private ArrayList<String> sports =  new ArrayList<String>();

    public Athlete(String newName, int newAge, char newSex, int newMedals, ArrayList<String> newSports){
        super(newName, newAge, newSex);
        medals = newMedals;
        sports = newSports;
    }

    public String Train(){
        return "I am doing pushups!";
    }

}
