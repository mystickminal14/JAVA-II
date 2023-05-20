package an;

import java.util.Random;

public class gene {
    public static void main(String[] args) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        String[] consonants = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};

        Random random = new Random();
        int nameLength = random.nextInt(7) + 4; 
        String name = "";

        for (int i = 0; i < nameLength; i++) {
            if (i % 2 == 0) { 
                name += consonants[random.nextInt(consonants.length)];
            } else { // Odd index means we need a vowel
                name += vowels[random.nextInt(vowels.length)];
            }
        }

        System.out.println(name.substring(0,1).toUpperCase() + name.substring(1)); // Capitalize the first letter
    }
}
