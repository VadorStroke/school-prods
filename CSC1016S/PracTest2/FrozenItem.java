public class FrozenItem extends Item{
   private int condition;
   
   public FrozenItem(int ID, String name , int price, int condition){
      super(ID, name, price);
      this.condition = condition;
      }
   
   public String toString(){
      return super.toString() + ", frozen"+", condition " + this.condition;
      }
 }