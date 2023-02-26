package animal.oop;

import java.util.ArrayList;
import java.util.List;

public class VoicePlayer {
    private List<Animal> animalList;

    public VoicePlayer(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void playVoices() {
        for (Animal animal : animalList) {
            System.out.println("PlayVoice: " + animal.getVoice());
        }
    }

    public void howDurationVoice() {
        for (Animal animal : animalList) {
            System.out.println(animal.getName() + " Duration for: " + animal.getVoiceDuration() + " sec");
        }
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }
}
