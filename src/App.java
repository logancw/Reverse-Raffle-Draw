//                                              Assignment #37 Reversal Raffle Draw
//                                                      Logan Weisgerber
//                                                          11/30/2023

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
 public static void main(String[] args) {
    
    ArrayList<String> names = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String[] Stringnames = {"Alex", "Taylor", "Jordan", "Morgan", "Charlie", "Sam", "Dakota", "Jamie", "Blake", "Casey"};
    // Adding at least 10 names
    for(int i = 0; i < Stringnames.length; i++){
        names.add(Stringnames[i]);
    }
    // Explaining the game
    System.out.println("Welcome to the Reverse Raffle Draw!");
    System.out.println("All participants' names are in the hat. We'll draw names one by one,");
    System.out.println("and the last name remaining in the hat will be the winner.\n");
    System.out.println("Starting with: " + names);
    System.out.println("Let's begin the raffle!\n");
    // Collections library handles the randomizing of names.
    Collections.shuffle(names);
    while (names.size() > 1) {
      String removedName = names.remove(names.size() - 1); // Rmeoves the name and prints the name that is removed.
      System.out.println("Removed: " + removedName); // Prints
    }
    // Announcing the winner
    System.out.println("\nThe winner is: " + names.get(0)); // Prints the final name left in the raffle after the Collections sort is finished.
  }
}
