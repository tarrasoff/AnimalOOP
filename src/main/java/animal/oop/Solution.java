package animal.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Bear bear = new Bear("Kosolapiy");
        Wolf wolf = new Wolf("Seriy");
        Tiger tiger = new Tiger("Orange");
        Dog dog = new Dog("Sharik");

        List<Animal> animalList = new ArrayList<Animal>();
        Collections.addAll(animalList, bear, wolf, tiger);

        VoicePlayer player = new VoicePlayer(animalList);


        animalList.add(dog);
        player.playVoices();
        player.howDurationVoice();
    }
}
