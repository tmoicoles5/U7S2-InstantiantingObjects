package partA.ex02;

public class BballTeamPt1 {
    public String name;
    String height;
    int years;

    public BballTeamPt1(String name, String height, int years) {
        this.name = name;
        this.height = height;
        this.years = years;
    }

    public BballTeamPt1() {

    }

    public static String BballTeam() {
        BballTeamPt1 Stephen = new BballTeamPt1("Stephen Curry", "6'2", 13);
        BballTeamPt1 Michael = new BballTeamPt1("Michael Jordan", "6'6", 15);

        StringBuilder sb = new StringBuilder();
        sb.append(Stephen == Michael).append("\n");

        Stephen.name = Michael.name;
        Stephen.height = Michael.height;
        Stephen.years = Michael.years;

        sb.append(Stephen == Michael).append("\n");

        Stephen = Michael;

        sb.append(Stephen == Michael).append("\n");

        return sb.toString();
    }

    @Override
    public String toString() {
        return BballTeam();
    }
}
