package foodmenu;
import java.util.*;

public class FoodMenu {


    private static void main() {
    }
    private String Food="";
    private int price;
    public FoodMenu (String f, int  p){
        this.price = p;
        this.Food = f;
    
}
    public static FoodMenu[] mt = new FoodMenu[10];
    public static int num = 0;
    public static void main  (String[]args){
        OUTER:
        while (true){
        System.out.println("MENU");
        Scanner fm= new Scanner(System.in);
                
        System.out.println("1. Insert");
        System.out.println("2. Edit");
        System.out.println("3. View");
        System.out.println("4. Exit");
        System.out.print("ENTER CHOICE: ");
        int b = fm.nextInt();
        
                
        
        switch (b){
            case 1:
                if (num >= 10){
                    System.out.println("Food menu is alreaday 10");
                }else{
                int  num1 = 0;
                System.out.println("ADDING NEW FOOD MENU");
                System.out.print("Name of food: " );
                String fn = fm.next();
                    for (int x = 0; x < num; x++){
                        if(mt[x].Food.equalsIgnoreCase(fn)){
                            System.out.println("Food already exist!");
                            num1++;
                        }
                    }
                    if(num1 == 0 ){
                System.out.print("Price: ");
                int pr= fm.nextInt();
                mt[num] = new FoodMenu(fn, pr);
                System.out.println("Succesfully Added");
                num++;
                }
                }
                break;
                
                
            
            case 2:

                System.out.print("Enter Food Name: ");
                String f=fm.next();
                for (int i = 0; i < num; i++){
                    if(mt[i].Food.equalsIgnoreCase(f)){
                        System.out.println("Old price: " + mt[i].price);
                        System.out.print("Enter new price: ");
                        int np = fm.nextInt();
                        mt[i].price = np;
                    }
                    else{
                        System.out.println("Food not found!!");
                    }
                }
                break;
                
            case 3:
                for (int a = 0; a < num; a++){
                    System.out.println(mt[a].Food + "  " + mt[a].price);
                }
                break;
                
            case 4:
                System.out.print("-----Exiting-----");
                break OUTER;
                
            default:
                System.out.println("Invalid number entered!");
                break;
                
            
        }
                
        }
    }
}