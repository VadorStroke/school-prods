public class PerishableItem extends Item{
  private String date;
  
  public PerishableItem(int ID , String name, int price , String date){
     super(ID, name, price);
     this.date = date;
     }
  public String getUseByDate(){
    return date;
   }
  public String toString(){
    return super.toString() + ", use by " + this.date;
    }
}