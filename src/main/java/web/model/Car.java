package web.model;

public class Car {
    private int id;
    private String brand;
    private String name;

    public Car(int id, String brand, String name) {
        this.id = id;
        this.brand = brand;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }
}
