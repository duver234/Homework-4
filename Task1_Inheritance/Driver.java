class Driver {
    public static void main(String[] args) {
        
        // Joe Jones Salaried Employee
        SalariedEmployee joeJones = new SalariedEmployee("Joe", "Jones", 111111111, 2500);

        // Stephanie Smith Wage Employee
        WageEmployee stephanieSmith = new WageEmployee("Stephanie", "Smith", 222222222, 25, 32);

        // Mary Quinn Wage Employee
        WageEmployee maryQuinn = new WageEmployee("Mary", "Quinn", 333333333, 19, 47);
        
        // Nicole Dior Commission Employee
        CommissionEmployee nicoleDior = new CommissionEmployee("Nicole", "Dior", 444444444, 15, 50000);
        
        // Renwa Chanel Salary Employee
        SalariedEmployee renwaChanel = new SalariedEmployee("Renwa", "Chanel", 555555555, 1700);
        
        // Mike Davenport Base Employee
        BaseEmployee mikeDavenport = new BaseEmployee("Mike", "Davenport", 666666666, 95000);
        
        // Mahnaz Vaziri Commission Employee
        CommissionEmployee mahnazVaziri = new CommissionEmployee("Mahnaz", "Vaziri", 777777777, 22, 40000);

    }
}