package animal.oop;

public class Bear implements Animal {
    private String name;

    public Bear(String name) {
        this.name = name;
    }

    public String getVoice() {
        return "RRRRR";
    }

    public Integer getVoiceDuration() {
        return 10;
    }

    public String getName() {
        return name;
    }

}
