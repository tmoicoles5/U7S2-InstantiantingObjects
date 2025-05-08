package partA.ex03;

public class BballTeamPt2 {
    public static String BballTeam() {
        String player1 = new String("Stephen Curry");
        String player2 = new String("Stephen Curry");
        boolean result1 = player1 == player2; // false

        String player3 = "Michael Jordan";
        String player4 = "Michael Jordan";
        boolean result2 = player3 == player4; // true

        return result1 + "\n" + result2 + "\n";
    }

    public static void main(String[] args) {
        System.out.print(BballTeam());

    }
}
