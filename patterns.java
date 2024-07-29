import java.util.Scanner;
class patterns {
 public static void pattern1(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            } 
            System.out.println(" ");
        }
 }
 public static void pattern2(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
           System.out.print("*"); 
        }
         System.out.println(" ");
    }
 }
 public static void pattern3(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
           System.out.print("*"); 
        }
         System.out.println(" ");
    }
 }
 public static void pattern4(int n){
    for(int i=0;i<=n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        for(int j=0;j<2*i+1;j++){
            System.out.print("*");
        }
        for (int j = 0; j <n-i-1; j++) {
            System.out.print(" ");
        }
        System.out.println(" ");
    }
 }
 public static void pattern5(int n){
    for(int i=0;i<=n;i++){
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<2*n-(2*i+1);j++){
            System.out.print("*");
        }
        for (int j = 0; j <i; j++) {
            System.out.print(" ");
        }
        System.out.println(" ");
    }
 }
 public static void pattern6(int n){
    int stars;
    for(int i=1;i<=2*n-1;i++){  
        if(i<n){
          stars=2*n-i;
          for(int j=1;j<stars;j++){
            System.out.print("*");
          }
        }
        System.out.println(" ");
    }
 }
 public static void pattern7(int n){
    for(int i=0;i<=n;i++){
        for(char ch='A';ch<'A'+i;ch++){
            System.out.print(ch+" ");
        }
        System.out.println(" ");
    }
 }
 public static void pattern8(int n){
    for(int i=0;i<=n;i++){
        for(char ch='A';ch<'A'+(n-i-1);ch++){
            System.out.print(ch+" ");
        }
        System.out.println(" ");
    }
 }
  public static void pattern9(int n){
    for(int i=0;i<=n;i++){
        for(char ch='E';ch<'E'-i;ch++){
            System.out.print(ch+" ");
        }
        System.out.println(" ");
    }
 }
 public static void pattern10(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
             if (i == 1 || j == 1 || i == n || j == n) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println(" ");
    }
 }
 public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.print("enter the length:");
            int n=sc.nextInt(); 
            pattern1(n);
            pattern2(n);
            pattern3(n);
            pattern4(n);
            pattern5(n);
            pattern6(n);
            pattern7(n);
            pattern8(n);
            pattern9(n);
            pattern10(n);

        }
    }

