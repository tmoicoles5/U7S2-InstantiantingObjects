package com.codedifferently.labs.partA.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex01.Player;


public class PlayerTest {
    @Test
    public void playerTest01(){
        Player stephCurry = new Player("Steph Curry", "6'2", 13);
        Player michaelJordan = new Player("Michael Jordan", "6'2", 15);
        String expected = "Player 1: \n" +
                "variable: Stephen Curry\n" +
                "Name: Stephen Curry\n" +
                "Height: 6'2\n" +
                "Years in the League: 13 years\n" +
                "\n" +
                "Player 2:\n" +
                "variable: Michael Jordan \n" +
                "Name: Michael Jordan\n" +
                "Height: 6'6\n" +
                "Years in the League: 15 years";
        String actual = Player.Player();
        Assertions.assertEquals(expected, actual);
    }
}
