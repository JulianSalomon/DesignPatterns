package builder;

public class Builder {

    public static void main(String[] args) {
        HouseBuilder houseBuilder = new CityHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(houseBuilder);
        engineer.constructHouse();
        House house = engineer.getHouse();
    }

}
