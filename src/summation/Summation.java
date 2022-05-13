//factory pattern
package summationFactory;

public class SummationFactory {

   
    public static void main(String[] args) {
        int sum = 0;
        int n = 50;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
      } 
      System.out.println("The Sum Of " + n + " is " + sum);
    }
    
}
