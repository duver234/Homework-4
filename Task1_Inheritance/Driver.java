class Driver {
    public static void main(String[] args) {
        
        // Joe Jones Salaried Employee
        SalariedEmployee joeJones = new SalariedEmployee("Joe", "Jones", 111111111, 2500);
        joeJones.print();

        // Stephanie Smith Wage Employee
        HourlyEmployee stephanieSmith = new HourlyEmployee("Stephanie", "Smith", 222222222, 25, 32);
        stephanieSmith.print();

        // Mary Quinn Wage Employee
        HourlyEmployee maryQuinn = new HourlyEmployee("Mary", "Quinn", 333333333, 19, 47);
        maryQuinn.print();

        // Nicole Dior Commission Employee
        CommisionEmployee nicoleDior = new CommisionEmployee("Nicole", "Dior", 444444444, 15, 50000);
        nicoleDior.print();
        
        // Renwa Chanel Salary Employee
        SalariedEmployee renwaChanel = new SalariedEmployee("Renwa", "Chanel", 555555555, 1700);
        renwaChanel.print();
        
        // Mike Davenport Base Employee
        BaseEmployee mikeDavenport = new BaseEmployee("Mike", "Davenport", 666666666, 95000);
        mikeDavenport.print();
        
        // Mahnaz Vaziri Commission Employee
        CommisionEmployee mahnazVaziri = new CommisionEmployee("Mahnaz", "Vaziri", 777777777, 22, 40000);
        mahnazVaziri.print();

    }
}