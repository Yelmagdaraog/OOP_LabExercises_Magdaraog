package animals;
public class Panda extends Animals {

    public Panda(int eL) {
        super(eL);
    }public void rolling(){
        System.out.println("The panda is rolling in the deep.");
        eL-=20;   
    }
    public void eatingPan(){
        System.out.println("You fed the panda.");
        eL +=10;
 
    }
    public void sleepingPan(){
        System.out.println("Never give on your dream. Just keep sleeping");
        eL+=5;
    }
}
    

