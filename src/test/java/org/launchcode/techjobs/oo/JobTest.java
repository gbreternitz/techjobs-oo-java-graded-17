package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.testng.annotations.BeforeTest;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {

        Job testJob = new Job();
        assertTrue(testJob.getId() > 0);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Employer e = new Employer("Flying Dutchman");
        Location l = new Location("The High Seas");
        PositionType pt = new PositionType("Manager");
        CoreCompetency cc = new CoreCompetency("People Person");


        Job testJob = new Job("Captain",e,l,pt, cc);
        assertNotNull(testJob.getName());
        assertNotNull(testJob.getEmployer());
        assertNotNull(testJob.getLocation());
        assertNotNull(testJob.getCoreCompetency());
    }

    @Test
    public void testJobsForEquality() {

        Job testJob1 = new Job();
        Job testJob1Clone = testJob1;
        Job testJob2 = new Job();

        assertNotEquals(testJob1, testJob2);
        assertEquals(testJob1, testJob1Clone);
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
