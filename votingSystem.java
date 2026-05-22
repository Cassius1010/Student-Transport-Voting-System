package manyopa;

import java.util.ArrayList;

public class votingSystem {

    private ArrayList<Vote> votes = new ArrayList<>();
    
    public void addVote(Vote vote) {
        votes.add(vote);
        System.out.println("Vote recorded successfully!");
    }

    
    public void displayAllVotes() {
        System.out.println("\n--- ALL VOTES ---");

        for (Vote v : votes) {
            v.displayVote();
        }
    }
    
    public void showResults() {

        int shuttle = 0;
        int taxi = 0;
        int uber = 0;
        int none = 0;

        for (Vote v : votes) {

            String choice = v.getTransportChoice();

            if (choice.equalsIgnoreCase("Shuttle")) {
                shuttle++;
            } 
            else if (choice.equalsIgnoreCase("Taxi")) {
                taxi++;
            } 
            else if (choice.equalsIgnoreCase("Uber")) {
                uber++;
            } 
            else {
                none++;
            }
        }

        System.out.println("\n--- RESULTS ---");
        System.out.println("Shuttle Bus: " + shuttle);
        System.out.println("Taxi Pool: " + taxi);
        System.out.println("Uber/Bolt: " + uber);
        System.out.println("No Transport: " + none);
        String winner = "Shuttle Bus";
        int max = shuttle;

        if (taxi > max) {
            max = taxi;
            winner = "Taxi Pool";
        }

        if (uber > max) {
            max = uber;
            winner = "Uber/Bolt";
        }

        if (none > max) {
            winner = "No Transport";
        }

        System.out.println("\nMost Popular Option: " + winner);
    }

}