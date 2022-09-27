public class Animal implements Horse {
     String name;
     public void breed(){
        System.out.println("Draft horse ");
     }
  
   
  public void sound(){
    System.out.println("neigh neigh");
  }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}