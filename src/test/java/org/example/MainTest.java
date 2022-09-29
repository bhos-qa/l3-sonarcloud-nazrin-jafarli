package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class MainTest {
    Main pm;

    @BeforeEach
    void setUp() {
        pm = new Main();
    }

    @Test
    void testGetCurrentLevel(){
        assertEquals("USER", pm.getLevel());
    }

    @Test
    void testSetCurrentLevel(){
        pm.setLevel(PermissionLevel.ADMIN);
        assertEquals("ADMIN", pm.getLevel());

        pm.setLevel(PermissionLevel.DEVELOPER);
        assertEquals("DEVELOPER", pm.getLevel());

        pm.setLevel(PermissionLevel.USER);
        assertEquals("USER", pm.getLevel());


    }

}
