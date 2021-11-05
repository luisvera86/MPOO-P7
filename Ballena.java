public class Ballena extends AnimalAcuatico{
  private String peso;

  //Constructores

  public Ballena(){
  }

  public Ballena(String nombre, String lugarOrigen,String color, int numAletas, String peso)
  {
    super (nombre, lugarOrigen,color, numAletas);
    this.peso = peso;
  }

  //Metodos de ballena
  
  public void NardarMar(){
    System.out.println("la ballena nada en el mar");
  }

  //Getters y Setters

  public String getpeso(){
    return peso;
  }

  public void settipo(String tipo){
    this.peso= peso;
  }

  @Override
  public String toString(){
    return super.toString()+"Ballena{Peso"+peso+"}";
  }
}