package animal.oop;

public class Tiger implements Animal {
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    public String getVoice() {
        return "rerere";
    }

    public String getName() {
        return name;
    }

    public Integer getVoiceDuration() {
        return 15;
    }

}
