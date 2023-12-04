package de.szut.soccer1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    public void givenShootGoal_whenAddGoal_ReturnUpdatedNumberOfGoals() {
        Player player = new Player("Müller", 30, 8, 9, 10, 0);
        player.addGoal();
        assertEquals(1, player.getNumberOfGoals());
    }

}
