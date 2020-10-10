package com.example.crudpostgres;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.crudpostgres.model.Tutorial;

import org.junit.jupiter.api.Test;

/**
 * JPAUnitTest
 */
public class JPAUnitTest {

    @Test
    public void getAllTutorials() {
        Tutorial tutorialTest = new Tutorial("Tut1", "My first tut", false);
        assertEquals(tutorialTest.getTitle(), "Tut1");
    }
}