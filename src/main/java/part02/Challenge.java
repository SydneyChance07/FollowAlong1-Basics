package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 for every data type
// Guide: GUIDE.md in this folder, steps 4–10
//
// SECTION D — Challenge. A video game character card. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

```java
package part02;

/*
 * Sydney Chance
 * Super Mario character card.
 */
public class Challenge {
    public static void main(String[] args) {
        // Stores the character name.
        String name = "Super Mario";

        // Stores the level.
        int level = 10;

        // Stores the number of coins.
        long coins = 10000000000L;

        // Stores health.
        double health = 100.0;

        // Stores speed.
        float speed = 4.5f;

        // Stores whether Mario can jump.
        boolean canJump = true;

        // Stores the character rank.
        char rank = 'A';

        // Prints the character card.
        System.out.println("===== CHARACTER CARD =====");
        System.out.println("Name:\t" + name);
        System.out.println("Level:\t" + level);
        System.out.println("Coins:\t" + coins);
        System.out.println("Health:\t" + health);
        System.out.println("Speed:\t" + speed);
        System.out.println("Jump:\t" + canJump);
        System.out.println("Rank:\t" + rank);
    }
}
```
