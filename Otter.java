package animals;
public class Otter extends Animals{

    public Otter(int eL) {
        super(eL);
    }
  
    public void swim(){
        System.out.println("The otter has swim");
        eL -=15;
        
    }
    public void sleepingOtter(){
        System.out.println("Sleeping Otter");
        eL+=10;
    }
public void play(){
        System.out.println("You played with otter");
        eL-=15;
}
}