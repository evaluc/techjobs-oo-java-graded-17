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

}
