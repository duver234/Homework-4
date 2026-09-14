class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String shipName, String yearBuilt, int cargoCapacity) {
        super(shipName, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void print() {
        System.out.println("Ship Name: " + getShipName());
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
    }

    // Getters and Setters
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}