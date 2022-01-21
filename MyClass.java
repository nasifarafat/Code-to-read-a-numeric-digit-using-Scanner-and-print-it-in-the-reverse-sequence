import java.util.*;
public class MyClass{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int no=sc.nextInt();
    int rev=0;
    int x;
    while(no>0){ 
      x=no%10;
      rev=rev*10+x;
      no=no/10;
     } 
     System.out.println("Reverse of the number is " + rev);
  }
}
