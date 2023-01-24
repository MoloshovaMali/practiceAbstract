public class Car extends Transport {
    private TaxiDriver taxiDriver;
    private BusDriver busDriver;
    public Car(int ID, double productionYear, String colour, int number,TaxiDriver taxiDriver,BusDriver busDriver) {
        super(ID, productionYear, colour, number);
        this.taxiDriver=taxiDriver;
        this.busDriver=busDriver;
    }

    @Override
    public void run() {
        System.out.println("car is running ");
    }

    @Override
    public void stop() {
        System.out.println("car is stop");
    }

    @Override
    public String toString() {
        return "Car{" +
                "ID='" + getID() +
                ", productionYear=" + getProductionYear() +
                ", colour='" + getColour() +
                ", number=" + getNumber()+
                "Personal "+taxiDriver+
                "Personal "+busDriver;

    }
}