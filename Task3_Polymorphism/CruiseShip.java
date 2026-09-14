class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String shipName, String yearBuilt, int maxPassengers) {
        super(shipName, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public void print() {
        System.out.println("Ship Name: " + getShipName());
        System.out.println("Max Passengers: " + maxPassengers);
    }


    // Getters and Setters
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}