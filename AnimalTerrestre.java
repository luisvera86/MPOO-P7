public class AnimalTerrestre extends Animal{
  private int numPatas;

  //Constructores
  
  public AnimalTerrestre(){
  }

  public AnimalTerrestre(String nombre, String lugarOrigen, String color, int numPatas){
    super(nombre, lugarOrigen, color);
    this.numPatas = numPatas;
  }

  //Metodos de AnimalTerrestre

  public void correr(){
    System.out.println("El animal está corriendo");
  }

  @Override
  public void comer(){
    System.out.println("El animal come con su hocico");
  }

  //Getters y Setters

  public int getNumPatas(){
    return numPatas;
  }

  public void setNumPatas(int numPatas){
    this.numPatas = numPatas;
  }

  @Override
  public String toString(){
    return super.toString()+" AnimalTerrestre{numPatas="+numPatas+"}";
  }
}