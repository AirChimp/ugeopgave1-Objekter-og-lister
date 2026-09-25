import java.util.ArrayList;

public class Opgave4TeamManagementSystem {
    // Player.java
    /*
    public static class Player {
        String name;
        int skillLevel;

        public Player(String name, int skillLevel) {
            this.name = name;
            this.skillLevel = skillLevel;
        }

        public String toString() {
            return name + " (skill: " + skillLevel + ")";
        }
    }

    // Team.java
    public static class Team {
        String teamName;
        ArrayList<Player> players;

        public Team(String teamName) {
            this.teamName = teamName;
            this.players = new ArrayList<>();
        }

        public void addPlayer(Player p) {
            players.add(p);
            System.out.println(p.name + " tilføjet til " + teamName);
        }

        public double getAverageSkill() {
            if (players.size() == 0) {
                return 0;
            }

            int totalSkill = 0;
            for (Player p : players) {
                totalSkill = totalSkill + p.skillLevel;
            }
            return (double)totalSkill / players.size();
        }

        public void printTeam() {
            System.out.println("\n=== " + teamName + " ===");
            System.out.println("Spillere:");
            for (Player p : players) {
                System.out.println("- " + p);
            }
            System.out.println("Gennemsnitlig skill: " + getAverageSkill());
        }

        public void compete(Team opponent) {
            System.out.println("\n=== " + teamName + " vs " + opponent.teamName + " ===");
            double mySkill = getAverageSkill();
            double opponentSkill = opponent.getAverageSkill();

            System.out.println(teamName + " skill: " + mySkill);
            System.out.println(opponent.teamName + " skill: " + opponentSkill);

            if (mySkill > opponentSkill) {
                System.out.println("Vinder: " + teamName);
            } else if (opponentSkill > mySkill) {
                System.out.println("Vinder: " + opponent.teamName);
            } else {
                System.out.println("Uafgjort!");
            }
        }

        public Player findBestPlayer() {
            if (players.size() == 0) {
                return null;
            }

            Player best = players.get(0);
            for (Player p : players) {
                if (p.skillLevel > best.skillLevel) {
                    best = p;
                }
            }
            return best;
        }
    }

    // Main.java
    public static class Main {
        public static void main(String[] args) {
            Team redTeam = new Team("Røde Dragoner");
            Team blueTeam = new Team("Blå Hajer");

            // Tilføj spillere til rødt hold
            redTeam.addPlayer(new Player("Anna", 85));
            redTeam.addPlayer(new Player("Peter", 72));
            redTeam.addPlayer(new Player("Maria", 90));

            // Tilføj spillere til blåt hold
            blueTeam.addPlayer(new Player("Lars", 78));
            blueTeam.addPlayer(new Player("Emma", 82));
            blueTeam.addPlayer(new Player("Simon", 88));
            blueTeam.addPlayer(new Player("Sofia", 75));

            // Print teams
            redTeam.printTeam();
            blueTeam.printTeam();

            // Konkurrence
            redTeam.compete(blueTeam);

            // Ekstra udfordring
            System.out.println("\nBedste spillere:");
            System.out.println(redTeam.teamName + ": " + redTeam.findBestPlayer());
            System.out.println(blueTeam.teamName + ": " + blueTeam.findBestPlayer());
        }
    }
    // Output:
    // Anna tilføjet til Røde Dragoner
    //Peter tilføjet til Røde Dragoner
    //Maria tilføjet til Røde Dragoner
    //Lars tilføjet til Blå Hajer
    //Emma tilføjet til Blå Hajer
    //Simon tilføjet til Blå Hajer
    //Sofia tilføjet til Blå Hajer
    //
    //=== Røde Dragoner ===
    //Spillere:
    //- Anna (skill: 85)
    //- Peter (skill: 72)
    //- Maria (skill: 90)
    //Gennemsnitlig skill: 82.33333333333333
    //
    //=== Blå Hajer ===
    //Spillere:
    //- Lars (skill: 78)
    //- Emma (skill: 82)
    //- Simon (skill: 88)
    //- Sofia (skill: 75)
    //Gennemsnitlig skill: 80.75
    //
    //=== Røde Dragoner vs Blå Hajer ===
    //Røde Dragoner skill: 82.33333333333333
    //Blå Hajer skill: 80.75
    //Vinder: Røde Dragoner
    //
    //Bedste spillere:
    //Røde Dragoner: Maria (skill: 90)
    //Blå Hajer: Simon (skill: 88)
     */
}
