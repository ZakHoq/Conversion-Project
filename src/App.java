import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       System.out.println("Welcome to metric converter! ");
       System.out.println("Please input your query starting with on of the following units: ");
       System.out.println("mi");
       System.out.println("lbs");
       System.out.println("ft");
       System.out.println("f");
       System.out.println("Enter 'exit' or '-1' to exit the program.");
       System.out.println("Please enter unit: ");
       String unit = scan.next();
       while( unit != "exit" || unit != "-1"){
       switch(unit){
        case "mi": 
        System.out.println("Please enter double value:");
        double mi = scan.nextDouble();
        System.out.println(miToKm(mi) + "km");
        break;
        
        case "lbs": 
        System.out.println("Please enter double value:");
        double lbs = scan.nextDouble();
        System.out.println(lbsToKg(lbs) + "kg");
        break;
        
        case "ft": 
        System.out.println("Please enter double value:");
        double ft = scan.nextDouble();
        System.out.println(ftToM(ft) + "m");
        break;

        case "f": 
        System.out.println("Please enter double value:");
        double f = scan.nextDouble();
        System.out.println(fToC(f) + "C");
        break;
        
        case "exit":
        System.exit(0);
        break;
        case "-1":
        System.exit(0);
        break;

        default:
        System.out.println("Please enter valid unit."); 
       }
       System.out.println("Please enter unit: ");
       unit = scan.next();
    }
    scan.close();

    }
       
       public static double miToKm(double a){
        double km = a/0.62137;
        return km;
       }
    
       public static double lbsToKg(double b){
        double kg = b/2.2046;
        return kg;
       }
    
       public static double ftToM(double c){
        double m = c/3.2808;
        return m;
       }
    
       public static double fToC(double d){
        double C = (d-32)/1.8000;
        return C;
       }
    }

    

  

