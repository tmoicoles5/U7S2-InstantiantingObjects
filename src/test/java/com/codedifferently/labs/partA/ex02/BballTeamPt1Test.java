package com.codedifferently.labs.partA.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex02.BballTeamPt1;

public class BballTeamPt1Test {
    @Test
    public void BballTest01() {
        String expected = "false\n" +
                "false\n" +
                "true\n";
        String actual = new BballTeamPt1().toString();
        Assertions.assertEquals(expected, actual);
    }
}
