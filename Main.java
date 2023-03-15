import java.util.Scanner;

class Main {
  public static void main(String[] args) {

Scanner in= new Scanner(System.in);
    
 System.out.println( "Podaj pierwszą liczbe calkowita");
   int a=in.nextInt();
    
    System.out.println( "Podaj druga liczbe calkowita");
    int b=in.nextInt();
int pot1= (int)Math.pow(a,b);
  int pot2=(int)Math.pow(b,a);
    int suma=pot1+pot2;
  // int suma =  Math.pow(a,b) + Math.pow(b,a); 
    
    System.out.println( "Suma potęg jest rowna " + suma);

    
  }
}