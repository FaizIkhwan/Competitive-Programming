import java.util.Scanner;

public class StringPremutation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the number of test cases");
    int test_cases = input.nextInt();
    input.nextLine();
    int i = 1;
    while (test_cases > 0 )
    {
    String s = input.nextLine();
    System.out.println("Case # " + i + ":");
    displayPermuation(s);
    i++;
    test_cases--;
  }
  }
  
  public static void displayPermuation(String s) {
    displayPermuation("", s);
  }

  public static void displayPermuation(String s1, String s2) {
    if (s2.length() > 0) {
      for (int i = 0; i < s2.length(); i++) {
        displayPermuation(s1 + s2.charAt(i),
          s2.substring(0, i) + s2.substring(i + 1));
      }
    }
    else
      System.out.println(s1);
  }
}
