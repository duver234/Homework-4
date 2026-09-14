class Instructor{
    private String instructorFirstName;
    private String instructorLastName;
    private int officeNumber;

    public Instructor(String firstName, String lastName, int officeNumber) {
        this.instructorFirstName = firstName;
        this.instructorLastName = lastName;
        this.officeNumber = officeNumber;
    }

    public void setInstructorFirstName(String firstName) {
        this.instructorFirstName = firstName;
    }

    public void setInstructorLastName(String lastName) {
        this.instructorLastName = lastName;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getInstructorFirstName() {
        return instructorFirstName;
    }

    public String getInstructorLastName() {
        return instructorLastName;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }
}