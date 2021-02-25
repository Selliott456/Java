public class convertingVariables {

  public static void main (String [args]) {
    //casting string into an int
    int a = "3";
  
    int c = Integer.parseInt(a);

    // convert int to string
    Integer a = 9;
    String result = a.toString();
    //OR 
    String result = Integer.toString(a);

    //converting Double to string
    double d = 4;
    String result = Double.toString(d);

  }
  
}
