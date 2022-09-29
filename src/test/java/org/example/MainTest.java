package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.Main.PermissionManager;
import org.example.Main.PermissionLevel;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    PermissionManager pm;

    @BeforeEach
    void setUp() {
        pm = new PermissionManager();
    }

    @Test
    void testGetCurrentLevel(){
        assertEquals("USER", pm.getCurrentLevel());
    }

    @Test
    void testSetCurrentLevel(){
        pm.setCurrentLevel(PermissionLevel.ADMIN);
        assertEquals("ADMIN", pm.getCurrentLevel());

        pm.setCurrentLevel(PermissionLevel.DEVELOPER);
        assertEquals("DEVELOPER", pm.getCurrentLevel());

        pm.setCurrentLevel(PermissionLevel.USER);
        assertEquals("USER", pm.getCurrentLevel());


    }

}