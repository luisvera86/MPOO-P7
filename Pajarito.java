public class Pajarito extends AnimalAereo{
  private String tipoPico;

  //Constructores

  public Pajarito(){
  }

  public Pajarito(String nombre, String lugarOrigen, String color, int numAlas, String tipoPico){
    super (nombre, lugarOrigen, color, numAlas);
    this.tipoPico = tipoPico;
  }

  //Metodos de Pajarito
  
  public void recolectarRamas(){
    System.out.println("El pajaro esta recolectando ramas para su nido");
  }

  //Getters y Setters

  public String gettipoPico(){
    return tipoPico;
  }

  public void settipoPico(String tipoPico){
    this.tipoPico = tipoPico;
  }

  @Override
  public String toString(){
    return super.toString()+"Colibri {tipo de pico="+tipoPico+"}";
  }
}