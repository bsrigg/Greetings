// In Java, you can have multiple classes in the same file, but only one class that is public. That public class needs to be named identically to the file's name.
// Convention on class names in Java is to start the name with a Noun and should be PASCAL Case - every word Capitalized for first letter of each. 
public class Greeter {
    // Methods should be named starting with a verb.
    public String greet(String name){
        return createGreeting(name);
    }
    public String greet(){
        return createGreeting("World");
    }
    public String greet(String firstName, String lastName) {
        return createGreeting(firstName + " " + lastName);
    }
    private String createGreeting(String toBeGreeted){
        return "Greeting " + toBeGreeted + ", Welcome to Coding Dojo";
    }
}