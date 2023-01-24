public class Main {
    public static void main(String[] args) {
        ShopAsistant shopAsistant = new ShopAsistant("Nurisa", "shop asistant", 20);
        TaxiDriver taxiDriver = new TaxiDriver("Mirlan", "taxi driver", 23);
        BusDriver busDriver = new BusDriver("Arslan", "bus driver", 30);
        BusDriver busDriver2 = new BusDriver("Mirbek", "bus driver", 25);
        Car car = new Car(2345, 2022, "black", 777,taxiDriver ,busDriver2);
        car.run();
        car.stop();
        Bus bus = new Bus(2234, 2014, "white", 555,busDriver,shopAsistant);
        bus.run();
        bus.stop();
        Trolleybus trolleybus = new Trolleybus(5789, 2019, "white", 989,shopAsistant);
        trolleybus.run();
        trolleybus.stop();
        System.out.println(bus);
        System.out.println(trolleybus);
        System.out.println(car);


    }
}


