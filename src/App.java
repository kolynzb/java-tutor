import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

//TYPE CASTING AND CONVERTING
    //this is casting
  System.out.println((int)3.14);
  System.out.println((double)3);
    //this is converting
  int intFromString = Integer.parseInt("50");
  System.out.println(intFromString * 2);


//STRINGS --google java string class
String greeting = "Hello, World!";

System.out.println(greeting.length());
System.out.println(greeting.indexOf("orld"));
System.out.println(greeting.substring(1,4));
System.out.println(greeting.indexOf("z")); //returns a negative one

//MATH CLASS
System.out.println(Math.pow(2,3));
System.out.println(Math.sqrt(144));
System.out.println(Math.round(2.7));

//GETTING USER INPUT
Scanner input = new Scanner(System.in);

try{
  String user = input.nextLine();
  System.out.println("input "+user);
} finally {
  input.close();//close the scanner
}  


    }
}
