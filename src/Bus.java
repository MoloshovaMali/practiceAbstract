public class Bus extends Transport {
    private BusDriver busDriver;
    private ShopAsistant shopAsistant;
    @Override
    public void run() {
        System.out.println("Bus is running");
    }

    @Override
    public void stop() {
        System.out.println("bus stop");
    }

    public Bus(int ID, double productionYear, String colour, int number,BusDriver busDriver,ShopAsistant shopAsistant) {
        super(ID, productionYear, colour, number);
        this.busDriver=busDriver;
        this.shopAsistant=shopAsistant;


    }

    @Override
    public String toString() {
        return "Bus{" +
                "ID='" + getID() +
                ", productionYear=" + getProductionYear() +
                ", colour='" + getColour() +
                ", number=" + getNumber()+
                "personal"+busDriver+
                " "+shopAsistant;
    }
}