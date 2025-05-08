package partA.ex01;



public class Player {
    public String name;

    public String height;

    public int yearsinLeague;


    public Player(String name, String height, int yearsinLeague) {
        this.name = name;
        this.height = height;
        this.yearsinLeague = yearsinLeague;

    }



    public static String Player() {
        Player stephenCurry = new Player("Stephen Curry", "6'2", 13);
        Player michaelJordan = new Player("Michael Jordan", "6'6", 15);

        String response = "Player 1: \n" +
                "variable: " + stephenCurry.name + "\n" +
                "Name: " + stephenCurry.name + "\n" +
                "Height: " + stephenCurry.height + "\n" +
                "Years in the League: " + stephenCurry.yearsinLeague + " years\n";

        String response2 =  "Player 2:\n" +
                "variable: " + michaelJordan.name + " \n" +
                "Name: " + michaelJordan.name + "\n" +
                "Height: " + michaelJordan.height + "\n" +
                "Years in the League: " + michaelJordan.yearsinLeague + " years";


        return response + "\n" + response2 ;
    }

    public static void main(String[] args) {
        System.out.println(Player());
    }
}
