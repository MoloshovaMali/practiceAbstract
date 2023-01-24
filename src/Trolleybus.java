public class Trolleybus extends Transport {
    private ShopAsistant shopAsistant;

    public Trolleybus(int ID, double productionYear, String colour, int number, ShopAsistant shopAsistant) {
        super(ID, productionYear, colour, number);
        this.shopAsistant = shopAsistant;
    }

    @Override
    public void stop() {
        System.out.println("Trolleybus is stop");
    }

    @Override
    public void run() {
        System.out.println("Trolleybus is running");
    }

    @Override
    public String toString() {
        return "Trolleybus{" +
                "ID='" + getID() +
                ", productionYear=" + getProductionYear() +
                ", colour='" + getColour() +
                ", number=" + getNumber()+
                " "+shopAsistant;

    }
}