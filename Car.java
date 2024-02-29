public class Car {
    private String brand;
    private String model;
    private int year;
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);

        Car car2 = new Car("Honda", "Civic", 2018);

        System.out.println("Car 1: Brand = " + car1.getBrand() + ", Model = " + car1.getModel() + ", Year = " + car1.getYear());
        System.out.println("Car 2: Brand = " + car2.getBrand() + ", Model = " + car2.getModel() + ", Year = " + car2.getYear());
    }
}

