class Course {
    private String courseName;
    private Instructor instructor1;
    private Textbook textbook1;
    
    public Course(String courseName, Instructor instructor1, Textbook textbook1) {
        this.courseName = courseName;
        this.instructor1 = instructor1;
        this.textbook1 = textbook1;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setInstructor1(Instructor instructor1) {
        this.instructor1 = instructor1;
    }
    public void setTextbook1(Textbook textbook1) {
        this.textbook1 = textbook1;
    }

    public void print() {
        System.out.println("Course: " + courseName);
        System.out.println("Instructor: " + instructor1.getInstructorFirstName() + " " + instructor1.getInstructorLastName());
        System.out.println("Textbook: " + textbook1.getTextbookTitle() + " by " + textbook1.getTextbookAuthor() + ", published by " + textbook1.getTextbookPublisher());
    }
}