public class Comparing {

  public static void main (String [args]){
  
  int a = 9;
  int b = 9;

  //  == or !=
  if(a == b) {
    System.out.println("equal");
  }
  else {
    System.out.println("not equal");
  }
  }

  // when using string equalities, dont use the above notation. 
  String a = "Sherryll"
  String b = "Sherryll"
  
  
  //  instead use:
  if (a.equals(b)){
    System.out.println("equal");
  }
  else {
    System.out.println("not equal");
  }

  //Switch statement
  // a bit neater than if else statements
  int a = 4;


  switch (a)
  {
    case 3:
      System.out.println("3");
      break;
    case 4:
      System.out.println("3");
      break;
      default:
        System.out.println("default");

  }

}
