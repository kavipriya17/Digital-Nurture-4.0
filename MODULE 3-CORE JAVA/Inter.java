interface Playable{
    void play();
}
class Guittar implements Playable{
   public void play(){
    System.out.println("Guittar is playing");
   }
}
class Piano implements Playable{
     public void play(){
        System.out.print("Piano is playing");
     }
}
public class Inter {
    public static void main(String x[]){
        Guittar g=new Guittar();
        Piano p=new Piano();
        g.play();
        p.play();
    }
    
}
