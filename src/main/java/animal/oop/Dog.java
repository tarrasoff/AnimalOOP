package animal.oop;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return "gav";
    }

    public Integer getVoiceDuration() {
        return 7;
    }

}
