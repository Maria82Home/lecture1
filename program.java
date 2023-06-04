import java.util.Scanner;
public class program {
 public static void main(String[] args) {
 Scanner iScanner = new Scanner(System.in);
 System.out.printf("Input k: ");
 int k = Integer.parseInt(iScanner.nextLine());
 System.out.println("k = " + k);
int[] arr = new int[k+1];
 for (int i=0; i<k+1; i++){
   arr[i]=(int)(Math.random()*101);
 }
//  for (int i=0; i<k+1; i++){
//    System.out.println(arr[i]);
//   }
for (int i=k; i>0; i--){
     System.out.print(arr[i]+"*x"+i+"+");
  }
  System.out.print(arr[0]);
 iScanner.close();
 }
}
