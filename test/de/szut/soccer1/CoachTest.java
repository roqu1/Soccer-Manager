package de.szut.soccer1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoachTest {
@Test
        public void givenExperienceLowerHigher10_WhenValidate_ThenReturn10() {
            Coach rehhagel = new Coach("Rehhagel", 84, 11);
            assertEquals(10, rehhagel.getExperience());
        }
@Test
public void givenExperienceLowerThan10_WhenValidate_Return1() {
        Coach rehhagel = new Coach("Rehhagel", 84, 9);
        assertEquals(9, rehhagel.getExperience());
        }
@Test
public void givenExperience7_WhenValidate_Return7 () {
        Coach rehhagel = new Coach("Rehhagel", 84, 7);
        assertEquals(7, rehhagel.getExperience());
        }
}

