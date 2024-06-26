public class Car {
    private String make;
    private String model;
    private int year;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
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
        if(year > 1885 && year <= 2024) {
            this.year = year;
        } else {
            System.out.println("Please enter a valid year.");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("Toyota");
        car.setModel("Corolla");
        car.setYear(2020);

        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Year: " + car.getYear());

        car.setYear(1800);
    }
}
