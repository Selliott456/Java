public class Car {

  int speed;
  String color;

  // intitializer - a method that kicks off the class

  
  public Car (int speed, String Color){
    // params passes the items into class variables
    this.speed = speed;
    this.color = color;

  }

  public int getSpeed() {
    return this.speed;
  }

  public String getColor() {
    return this.color;
  }
}
// whole class defines something called a car - like a blue print. 
// when you grab your blue print and create something out of it, it 
// requires you to give a speed and a color so that you can apply that
// speed and colour to the car.
// later on you can also get the speed out of the car and the color.
// ! go look at MyCar.java to see it applied
