public class AnimalAereo extends Animal{
  private int numAlas;

  //Constructores
  
  public AnimalAereo(){
  }

  public AnimalAereo(String nombre, String lugarOrigen, String color, int numAlas){
    super(nombre, lugarOrigen, color);
    this.numAlas = numAlas;
  }

  //Metodos de AnimalAereo

  public void volar(){
    System.out.println("El pajaro esta volando");
  }

  
  public void comer(){
    System.out.println("El pajaro come con su pico");
  }

  //Getters y Setters

  public int getNumAlas(){
    return numAlas;
  }

  public void setNumAlas(int numAlas){
    this.numAlas = numAlas;
  }

  @Override
  public String toString(){
    return super.toString()+" AnimalAereo {número de alas = "+numAlas+"}";
  }
}