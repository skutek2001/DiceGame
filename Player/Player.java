package javaapplication1.Player;

abstract public class Player {
    private String name = "Gracz";
    
    public Player(){}
    
    public Player(String name){
        setName(name);
    }
    
    final public String getName(){
        return name;
    }
    
    final public void setName(String name){
//        if(name != null && !name.equals("")){
          if(name != null && name.matches("^[\\w\\-._]{3,}$")){
            this.name = name;
            //System.out.println("imie poprawne");
        }
          else{
              throw new IllegalArgumentException("Nie prawidłowe imie");
              //System.err.println("imie nie poprawne");
          }
    }
    
    abstract public int guess();
}