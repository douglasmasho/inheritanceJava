public class Person {
    private String name;
    private int age;
    private char sex;

    public Person(String newName, int newAge, char newSex){
        name = newName;
        age= newAge;
        sex = newSex;
    }

    public String Greet(){
        return "Hello, my name is " + name;
    }
}
