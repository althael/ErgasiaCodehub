package DiaxeirishAsfaleiwn;

public class Vehicle {
    private int id;
    private String number_plate;
    private String model;

    public Vehicle(int id, String number_plate, String model) {
        this.id = id;
        this.number_plate = number_plate;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber_plate() {
        return number_plate;
    }

    public void setNumber_plate(String number_plate) {
        this.number_plate = number_plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
