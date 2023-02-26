package animal.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Bear bear = new Bear("Teddy");
        Wolf wolf = new Wolf("Wolf");
        Tiger tiger = new Tiger("Orange");
        Dog dog = new Dog("Toys");

        List<Animal> animalList = new ArrayList<Animal>();
        Collections.addAll(animalList, bear, wolf, tiger);
        VoicePlayer player = new VoicePlayer(animalList);
        player.addAnimal(dog);

        player.playVoices();
        System.out.println("----------------------------------------------------");
        player.howDurationVoice();
    }
}
