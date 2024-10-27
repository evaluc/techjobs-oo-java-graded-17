package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job jobTestOne = new Job();
        Job jobTestTwo = new Job();

        assertNotEquals(jobTestOne, jobTestTwo);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobTestAllConstructors = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(jobTestAllConstructors.getName() instanceof String);
        assertEquals("Product tester", jobTestAllConstructors.getName());

        assertTrue(jobTestAllConstructors.getEmployer() instanceof Employer);
        assertEquals("ACME", jobTestAllConstructors.getEmployer().getValue());

        assertTrue(jobTestAllConstructors.getLocation() instanceof Location);
        assertEquals("Desert", jobTestAllConstructors.getLocation().getValue());

        assertTrue(jobTestAllConstructors.getPositionType() instanceof PositionType);
        assertEquals("Quality control", jobTestAllConstructors.getPositionType().getValue());

        assertTrue(jobTestAllConstructors.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", jobTestAllConstructors.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job jobEqualityTestOne = new Job ("Pineapple Eater", new Employer("Fruit Distributors"), new Location("Costa Rica"), new PositionType("Quality Checker"), new CoreCompetency("Acid Tolerance"));
        Job jobEqualityTestTwo = new Job ("Pineapple Eater", new Employer("Fruit Distributors"), new Location("Costa Rica"), new PositionType("Quality Checker"), new CoreCompetency("Acid Tolerance"));

        assertNotEquals(jobEqualityTestOne, jobEqualityTestTwo);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job jobTestAllConstructors = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobStringTest = jobTestAllConstructors.toString();
        String newline = System.lineSeparator();

        //Not quite working
        //assertEquals(newline, jobStringTest.substring(0, 1));
        //assertEquals(newline, jobStringTest.substring(jobStringTest.length() - 1));

        // Doesn't quite work - string vs. character
        //assertEquals(newline, jobStringTest.charAt(0));
        //assertEquals(newline, jobStringTest.charAt(jobStringTest.length() -1));

        // Better solution but not asked for by assignment
        assertTrue(jobStringTest.startsWith(newline));
        assertTrue(jobStringTest.endsWith(newline));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job jobTestAllConstructors = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobStringLabelsAndDataTest = jobTestAllConstructors.toString();
        String newline = System.lineSeparator();

        String expectedLabelsAndData = newline + "ID: " + "1" + newline + "Name: " + "Product tester" + newline + "Employer: " + "ACME" + newline + "Location: " + "Desert" + newline + "Position Type: " + "Quality control" + newline + "Core Competency: " + "Persistence" + newline;

        assertEquals(expectedLabelsAndData, jobStringLabelsAndDataTest);

    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job jobTestEmptyFieldsHandling = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        String jobStringEmptyFieldsHandlingTest = jobTestEmptyFieldsHandling.toString();
        String newline = System.lineSeparator();

        String expectedEmptyFieldHandling = newline + "ID: " + "1" + newline + "Name: " + "Product tester" + newline + "Employer: " + "Data not available" + newline + "Location: " + "Desert" + newline + "Position Type: " + "Data not available" + newline + "Core Competency: " + "Persistence" + newline;

        assertEquals(expectedEmptyFieldHandling, jobStringEmptyFieldsHandlingTest);

    }

}
