package animal.oop;

public class Wolf implements Animal {
    private String name;

    public Wolf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return "rrrrr";
    }

    public Integer getVoiceDuration() {
        return 5;
    }
}
