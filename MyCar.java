public class MyCar {

  public static void main () {
    // Instantiating = create an object using Car class
    Car toyota = new Car(50, "red");
    Car ferrari = new Car(200, "green");

    //using the inbuilt methods in the Car class to print 
    System.out.println(toyota.getColor());
  }
}
