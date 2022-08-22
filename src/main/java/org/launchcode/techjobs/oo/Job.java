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

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(){
        id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency  coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String noData = "Data not available";
        String jobID = (Integer.toString(id) == null) ? noData : Integer.toString(id);
        String jobName = (this.name == null || this.name == "") ? noData : this.name;
        String jobEmployer = (this.employer.getValue() == null || this.employer.getValue() == "") ? noData : this.employer.getValue();
        String jobLocation = (this.location.getValue() == null || this.location.getValue() == "") ? noData : this.location.getValue();
        String jobPositionType = (this.positionType.getValue() == null || this.positionType.getValue() == "") ? noData : this.positionType.getValue();
        String jobCoreCompetency = (this.coreCompetency.getValue() == null || this.coreCompetency.getValue() == "") ? noData : this.coreCompetency.getValue();

    return
            "\n" +
            "ID: " + jobID + "\n" +
            "Name: " + jobName + "\n" +
            "Employer: " + jobEmployer + "\n" +
            "Location: " + jobLocation + "\n" +
            "Position Type: " + jobPositionType + "\n" +
            "Core Competency: " + jobCoreCompetency + "\n";
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() { return Objects.hash(getId()); }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
