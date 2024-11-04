package com.codedifferently.labs.partA.ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex03.BballTeamPt2;

public class BballTeamPt2Test {
    @Test
    public void BballTest02(){
        String expected = "false\n" +
                "true\n";
        String actual = BballTeamPt2.BballTeam();
        Assertions.assertEquals(expected, actual);
    }
}
