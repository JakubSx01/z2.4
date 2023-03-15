import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int x;
    switch(x){
      case 1: {
        poleprost();
      }
        break;
             
      case 2: {
        poletrojkprost();
      }
        break;
              
      case 3: {
        liczblosowychsrednia();
      }
        break;     
      case 4: {
        liczbalosowychmediana();
      }
        break;
        
    }
  public static void poleprost(String[] args)
    double a = scanner.nextDouble();
   double b = scanner.nextDouble();
   pole=a*b;
   System.out.println("pole prostokata:" + pole);
  }
}
