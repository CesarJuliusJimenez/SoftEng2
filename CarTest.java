public class CarTest {

    public static void main (String[] args) {

        Car car = new Car.CarBuilder()
        .color("Black")
        .transmission("Manual")
        .brand("Ferrari")
        .capacity(2)
        .engineType("Gasoline")
        .build();


    System.out.println();
    System.out.println("Car Information");
    System.out.println();
    System.out.println("Color: " + car.color);
    System.out.println();
    System.out.println("Brand: " + car.brand);
    System.out.println();
    System.out.println("Transmission: " + car.transmission);
    System.out.println();
    System.out.println("Capacity: " + car.capacity);
    System.out.println();
    System.out.println("Engine Type: " + car.engineType);
        
    }

}