package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public String toString() {

        String dataMissingMessage = "Data not available";

        if (name == null && employer == null &&
            location == null && positionType == null &&
            coreCompetency == null){
            return "OOPS! This job does not seem to exist.";
        }

        String returnMessage = System.lineSeparator() + "ID: " + id +
                System.lineSeparator() + "Name: " + (name.isEmpty() ? dataMissingMessage : name) +
                System.lineSeparator() + "Employer: " + ((Objects.equals(employer.getValue(), "")) ? dataMissingMessage : employer) +
                System.lineSeparator() + "Location: " + ((Objects.equals(location.getValue(), "")) ? dataMissingMessage : location) +
                System.lineSeparator() + "Position Type: " + ((Objects.equals(positionType.getValue(), "")) ? dataMissingMessage : positionType) +
                System.lineSeparator() + "Core Competency: " + ((Objects.equals(coreCompetency.getValue(), "")) ? dataMissingMessage : coreCompetency) +
                System.lineSeparator();

        return  returnMessage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
