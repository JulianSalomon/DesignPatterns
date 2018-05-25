package builder;

public class CityHouseBuilder implements HouseBuilder {

    private House house;

    public CityHouseBuilder() {
        this.house = new House();
    }

    public void buildBasement() {
        house.setBasement("Concrete Poles");
    }

    public void buildStructure() {
        house.setStructure("Metal beams");
    }

    public void buildInterior() {
        house.setInterior("Drywalls");
    }

    public void bulidRoof() {
        house.setRoof("Concrete roof tiles");
    }

    public House getHouse() {
        return this.house;
    }
}
