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

        // Getters and Setters:

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public Employer getEmployer () {
            return employer;
        }

        public void setEmployer (Employer employer){
            this.employer = employer;
        }

        public Location getLocation () {
            return location;
        }

        public void setLocation (Location location){
            this.location = location;
        }

        public PositionType getPositionType () {
            return positionType;
        }

        public void setPositionType (PositionType positionType){
            this.positionType = positionType;
        }

        public CoreCompetency getCoreCompetency () {
            return coreCompetency;
        }

        public void setCoreCompetency (CoreCompetency coreCompetency){
            this.coreCompetency = coreCompetency;
        }

        public int getId () {
            return id;
        }

    @Override
    public String toString() {
        String printedJobObject;
        String lineSep = System.lineSeparator();
        Integer aJobID = this.getId();
        String aJobName = this.getName();
        String aJobEmployer = this.getEmployer().getValue();
        String aJobLocation = this.getLocation().getValue();
        String aJobPosition = this.getPositionType().getValue();
        String aJobCompetency = this.getCoreCompetency().getValue();

       String checkedNEJobName = aJobName.isEmpty() ? "Data not available" : aJobName;
       String checkedNEJobEmployer = aJobEmployer.isEmpty() ? "Data not available" : aJobEmployer;
       String checkedNEJobLocation = aJobLocation.isEmpty() ? "Data not available" : aJobLocation;
       String checkedNEJobPosition = aJobPosition.isEmpty() ? "Data not available" : aJobPosition;
       String checkedNEJobCompetency = aJobCompetency.isEmpty() ? "Data not available" : aJobCompetency;

        printedJobObject = "%s"
                + "ID: %d"
                + "%s"
                + "Name: %s"
                + "%s"
                + "Employer: %s"
                + "%s"
                + "Location: %s"
                + "%s"
                + "Position Type: %s"
                + "%s"
                + "Core Competency: %s"
                + "%s";

        return printedJobObject.formatted(lineSep, aJobID, lineSep, checkedNEJobName, lineSep, checkedNEJobEmployer, lineSep, checkedNEJobLocation, lineSep, checkedNEJobPosition, lineSep, checkedNEJobCompetency, lineSep);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

