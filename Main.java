import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Wybierz obliczenie do wykonania:");
        System.out.println("1 - oblicz pole prostokąta");
        System.out.println("2 - oblicz pole trójkąta prostokątnego");
        System.out.println("3 - oblicz średnią z 10 losowych liczb z zakresu 0-100");
      System.out.println("4 - oblicz medianę z 10 losowych liczb z zakresu 0-100");
        
        int wybor = scan.nextInt();
        
        switch(wybor) {
            case 1:{
                System.out.println("Podaj długość boku a:");
                double a = scan.nextDouble();
                System.out.println("Podaj długość boku b:");
                double b = scan.nextDouble();
                double poleProstokata = a * b;
                System.out.println("Pole prostokąta wynosi: " + poleProstokata);}
                break;
            case 2:{
             System.out.println("Podaj długość przyprostokątnej a:");
                double a1 = scan.nextDouble();
                System.out.println("Podaj długość przyprostokątnej b:");
                double h = scan.nextDouble();
                double poleTrojkata = (a1 * h) / 2;
                System.out.println("Pole trójkąta wynosi: " + poleTrojkata);}
                break;
                   case 3: {
            Random rand = new Random();
            ArrayList<Integer> liczby = new ArrayList<Integer>();
            for(int i=0; i<10; i++) {
                int liczba = rand.nextInt(101);
                liczby.add(liczba);
            }
            System.out.println("Wylosowane liczby: " + liczby);
            
            double srednia;
            Collections.sort(liczby);
            
            int suma = 0;
            for(int i=0; i<liczby.size(); i++) {
                suma += liczby.get(i);
            }
            srednia = suma / (double)liczby.size();
            System.out.println("Średnia wynosi: " + srednia);
            break;
        }
        case 4: {
            Random rand = new Random();
            ArrayList<Integer> liczby2 = new ArrayList<Integer>();
            for(int i=0; i<10; i++) {
                int liczba2 = rand.nextInt(101);
                liczby2.add(liczba2);
            }
          System.out.println("Wylosowane liczby: " + liczby2);
            double mediana;
            Collections.sort(liczby2);
            if(liczby2.size() % 2 == 0) {
                mediana = (liczby2.get(liczby2.size()/2) + liczby2.get((liczby2.size()/2)-1))/2.0;
            } else {
                mediana = liczby2.get(liczby2.size()/2);
            }
            System.out.println("Mediana wynosi: " + mediana);
            break;
          }
            default:
                System.out.println("Nieprawidłowy wybór.");
        }
      return;
    }

}