public class clsobj {
    public static void main(String x[]){
    Car c=new Car();
    c.displayDetails("Toyota", "Corolla", 2020);
    c.displayDetails("Honda", "Civic", 2022);
    }
}
class Car{
  private String make,model;
   private int year; 
   public void displayDetails(String m,String mm,int y){
    this.make=m;
    this.model=mm;
    this.year=y;
        System.out.println("Make: "+make+"\n"+"Model: "+model+"\n"+"Year: "+year);
   }
}
