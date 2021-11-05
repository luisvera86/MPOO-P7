public class Animal{
  private String nombre;
  private String lugarOrigen;
  private String color;

  //Constructores

  public Animal(){
  }

  public Animal(String nombre, String lugarOrigen, String color){
    this.nombre = nombre;
    this.lugarOrigen = lugarOrigen;
    this.color = color;
  }

  //Metodos clase Animal

  public void sonido(String grito){
    System.out.println("El animal hace este sonido: "+grito);
  }

  public void comer(){
    System.out.println("El animal esta comiendo");
  }
 
  
  //getters y setters

  public void setNombre(String nombre){
    this.nombre=nombre;
  }

  public String getNombre(){
    return nombre;
  }

  public void setLugarOrigen(String lugarOrigen){
    this.lugarOrigen = lugarOrigen;
  }

  public String getLugarOrigen(){
    return lugarOrigen;
  }

  public void setColor(String color){
    this.color = color;
  }

  public String getColor(){
    return color;
  }

  @Override
  public String toString(){
    return "Animal{nombre="+nombre+", lugarOrigen="+lugarOrigen+", color="+color+"}";
  }
}  
  