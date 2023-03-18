package animals;
public class Penguin extends Animals{

    public Penguin(int eL) {
        super(eL);
    }
    public void awake(){
        System.out.println("The Penguin is ready");
        eL-=10;
    
    }
    public void eatingPeng(){
        System.out.println("You fed the panda.");
        eL +=12;
    }
    public void happyFeet(){
        System.out.println("Penguin's Happy Feet");
        eL-=19;     
   
    
}
}
