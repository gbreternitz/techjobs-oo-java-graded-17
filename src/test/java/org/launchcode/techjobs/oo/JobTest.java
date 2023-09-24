package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.testng.annotations.BeforeTest;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {

        Job testJob1 = new Job();
        Job testJob2 = new Job();

        assertTrue(testJob1.getId() > 0);
        assertNotEquals(testJob1.getId(), testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){

        Job testJob = new Job("Product tester",
                      new Employer("ACME"),
                      new Location("Desert"),
                      new PositionType("Quality control"),
                      new CoreCompetency("Persistence"));

        assertTrue(testJob.getName() instanceof String);
        assertEquals(testJob.getName(), "Product tester");

        assertTrue(testJob.getEmployer() instanceof Employer);
        assertEquals(testJob.getEmployer().getValue(), "ACME");

        assertTrue(testJob.getLocation() instanceof Location);
        assertEquals(testJob.getLocation().getValue(), "Desert");

        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertEquals(testJob.getPositionType().getValue(), "Quality control");

        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");

//        assertNotNull(testJob.getName());
//        assertNotNull(testJob.getEmployer());
//        assertNotNull(testJob.getLocation());
//        assertNotNull(testJob.getPositionType());
//        assertNotNull(testJob.getCoreCompetency());

    }

    @Test
    public void testJobsForEquality() {

        Job testJob1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        Job testJob2 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertNotEquals(testJob1, testJob2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {

        Employer e = new Employer("Flying Dutchman");
        Location l = new Location("The High Seas");
        PositionType pt = new PositionType("Manager");
        CoreCompetency cc = new CoreCompetency("People Person");
        Job testJob = new Job("Captain",e,l,pt, cc);
        char[] testJobToStringCharArray = testJob.toString().toCharArray();

        assertEquals(testJobToStringCharArray[0], '\n');
        assertEquals(testJobToStringCharArray[testJobToStringCharArray.length - 1], '\n');

    }
}
