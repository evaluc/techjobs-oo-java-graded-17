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
    /*
    @Override
    //public String toString() {return System.lineSeparator() + System.lineSeparator();}
    public String toString() {
        String printedJobObject;

        printedJobObject = """

                ID: %d
                Name: %s
                Employer: %s
                Location: %s
                Position Type: %s
                Core Competency: %s
                """;

        return printedJobObject.formatted(this.getId(), this.getName(), this.getEmployer().getValue(), this.getLocation().getValue(), this.getPositionType().getValue(), this.getCoreCompetency().getValue());
    }
*/
    @Override
    //public String toString() {return System.lineSeparator() + System.lineSeparator();}
    public String toString() {
        String printedJobObject;
        String lineSep = System.lineSeparator();

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

        return printedJobObject.formatted(lineSep, this.getId(), lineSep, this.getName(), lineSep, this.getEmployer().getValue(), lineSep, this.getLocation().getValue(), lineSep, this.getPositionType().getValue(), lineSep, this.getCoreCompetency().getValue(), lineSep);
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


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

