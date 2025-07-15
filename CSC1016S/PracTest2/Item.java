public class Item{
   private int ID;
   private int price;
   private String name;
   
   public Item(int ID, String name, int price){
      this.ID = ID;
      this.name = name;
      this.price = price;
    }
   public boolean equals(Object ob){
      Item o;
      o = (Item)ob;
      if(this.ID == o.getUID() && this.price == o.getPrice() && this.name.equals(o.getName())){
         return true;
         }
      return false;
      }
   public int getPrice(){
     return price;
     }
   public int getUID(){
     return ID;
  }
   public String getName(){
     return name;
     }
   public String toString(){
     return "Item number " + this.ID + ", " + this.name + ", price " + "R" + this.price;
   }
 }