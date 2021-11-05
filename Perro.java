public class Perro extends AnimalTerrestre{
  private String colorCollar;

  //Constructores

  public Perro(){
  }

  public Perro(String nombre, String lugarOrigen, String color, int numPatas, String colorCollar){
    super (nombre, lugarOrigen, color, numPatas);
    this.colorCollar = colorCollar;
  }

  //Metodos de Perro
  
  public void hacerTrucos(){
    System.out.println("El perro está rodando");
  }

  //Getters y Setters

  public String getColorCollar(){
    return colorCollar;
  }

  public void setColorCollar(String colorCollar){
    this.colorCollar = colorCollar;
  }

  @Override
  public String toString(){
    return super.toString()+"Perro{colorCollar="+colorCollar+"}";
  }
}