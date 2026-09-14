class Ship {
    private String shipName;
    private String yearBuilt;

    public Ship(String shipName, String yearBuilt) {
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }

    public void print() {
        System.out.println("Ship Name: " + shipName);
        System.out.println("Year Built: " + yearBuilt);
    }


    // Getters and Setters
    public String getShipName() {
        return shipName;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }
}