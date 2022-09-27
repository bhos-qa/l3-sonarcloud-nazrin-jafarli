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
        String[] permissionLevels = {"ADMIN", "DEVELOPER", "USER"};
        int counter = 0;
        for(PermissionLevel pl : PermissionLevel.values()){
            pm.setCurrentLevel(pl);
            assertEquals(permissionLevels[counter], pm.getCurrentLevel());
            counter++;
        }
    }

}