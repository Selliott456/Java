public class BigCar extends Car {

  // keyword extends! Grabs everything from car
  // gives them to big car
  // big car adds
  public BigCar() {
    String size = "large";
  }

  public String getSize() {
    return this.size;
  }
}

// in another file you can instantiate BigCar by 
// typing BigCar caddy = new BigCar()
// System.outprintln(caddy.getSize()) to tell you its Large.
// you also have getColor and getSpeed because its inherited it
//from Car.

