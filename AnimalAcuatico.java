public class AnimalAcuatico extends Animal{
  private int numAletas;

  
  public AnimalAcuatico(){
  }

  public AnimalAcuatico(String nombre, String lugarOrigen,String color, int numAletas){
    super(nombre,lugarOrigen,color);
    this.numAletas= numAletas;
  }

  //Metodos de AnimalAereo

  public void nadar(){
    System.out.println("la ballena nada");
  }

  
  public void comer(){
    System.out.println("la ballena come");
  }

  //Getters y Setters

  public int getNumAletas(){
    return numAletas;
  }

  public void setNumAletas(int numAletas){
    this.numAletas = numAletas;
  }

  @Override
  public String toString(){
    return super.toString()+" AnimalAcuatico {número de aletas = "+numAletas+"}";
  }
}