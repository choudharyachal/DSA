import java.util.Scanner;
public class Lottery2 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner (System.in);
       int n = sc.nextInt();
        if(n>=300 && n<=450) {
        System.out.println("You have won Macbook");
        if(n>=300 && n<=380){
            System.out.println("Model: M1 mac");
        }else if (n>=381 && n<=460){
            System.out.println("Model: M2 mac");
        }
       } else if (n>=200 && n<=280){
        System.out.println("You have won a pack of kurkure");
        if(n>=200 && n<=240){
            System.out.println("flavour: chilli kurkure");
        }else if (n>=241 && n<=280){
            System.out.println("flavour: onion kurkure");
        }
       }else if (n>=1100 && n<=1500){
        System.out.println("You have won a cycle ");
        if (n>=1100 && n<= 1300){
            System.out.println("Brand: Avon cycle");
        }else if (n>= 1301 && n<= 1499){
            System.out.println("Brand: Hero cycle");
        }
       }else if (n>=50 && n<=80){
        System.out.println("You have won a bike");
        if (n>=51 && n<=65){
            System.out.println("Model:Bullet");
        }else if (n>=66 && n<=79){
            System.out.println("Model: Rajdoot");
        }
       }else{
        System.out.println("Better luck next time");
       }
    }
}