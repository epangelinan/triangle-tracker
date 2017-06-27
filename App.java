import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter the 3 lengths of the triangle.");
    int length1 = Integer.parseInt(myConsole.readLine());
    int length2 = Integer.parseInt(myConsole.readLine());
    int length3 = Integer.parseInt(myConsole.readLine());

    Triangle newTriangle = new Triangle(length1, length2, length3);

    String answer = newTriangle.determineTriangle(length1, length2, length3);
    System.out.println(answer);
  }
}
