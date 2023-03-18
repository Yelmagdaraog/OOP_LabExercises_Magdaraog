package animals;
public class Main {
    public static void main (String[]args){
        Otter otter= new Otter(100);
        Panda pan= new Panda(100);
        Penguin peng= new Penguin(100);
        otter.swim();       
        otter.play();
        otter.sleepingOtter();
        System.out.println("----------");
        otter.displayE();
        System.out.println();
        pan.eatingPan();
        pan.rolling();
        pan.sleepingPan();
        System.out.println("----------");
        pan.displayE();
        System.out.println();
        peng.awake();
        peng.eatingPeng();
        peng.happyFeet();
        System.out.println("----------");
        peng.displayE();
    }
}
