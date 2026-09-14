class Driver {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", 32636);
        Textbook textbook1 = new Textbook("Clean Code", "Robert Martin", "Addison-Wesley Professional");
        
        Course course = new Course("Object-Oriented Programming and Design", instructor1, textbook1);

        System.out.println("\n");
        course.print();

        Instructor instructor2 = new Instructor("Ham", "Yu", 3456);
        Textbook textbook2 = new Textbook("Cleaning", "Roberto", "Rrofessional");
        
        Course course2 = new Course("Object-Oriented Cleaning", instructor2, textbook2);

        
        System.out.println("\n");
        course2.print();
        System.out.println("\n");


    }
}