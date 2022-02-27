public class Vehicle {
    private String vehicleName;
    private String vehicleCompany;
    private String fuel;
    private String mileage;

    // Generate Getter - Setter method
    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getvehicleCompany() {
        return vehicleCompany;
    }

    public void setvehicleCompany(String vehicleCompany) {
        this.vehicleCompany = vehicleCompany;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public Vehicle(String vehicleName, String vehicleCompany, String fuel, String mileage)
    {
        this.vehicleName = vehicleName;
        this.vehicleCompany = vehicleCompany;
        this.fuel = fuel;
        this.mileage = mileage;
    }
    public String toString()
    {
        return this.vehicleName +" "+ this.vehicleCompany +" "+ this.fuel +" "+ this.mileage;
    }

    public static void main(String[] args) {
        Vehicle bike = new Vehicle("Apache", "TVS", "Petrol","45");
        Vehicle car = new Vehicle("Scorpio", "Mahindra", "Diesel","14");

        System.out.println(bike);
        System.out.println(car);
    }
}
