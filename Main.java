class Main {
  public static void main(String[] args) {
    Perro lomito = new Perro("Fido", "Mexico", "blanco", 4, "negro");
    System.out.println(lomito);

  lomito.comer();
  lomito.hacerTrucos();
  lomito.correr();

  System.out.println(lomito.getNombre()+" tiene "+lomito.getNumPatas()+" patas");


  Pajarito Pajaro = new Pajarito("Avis", "Mexico", "Verde metalico", 2 , "Alargado");
    System.out.println(Pajaro);

  Pajaro.comer();
  Pajaro.recolectarRamas();
  Pajaro.volar();
 

  System.out.println(Pajaro.getNombre()+" tiene "+Pajaro.getNumAlas()+" alas");
  



  Ballena ballena = new Ballena("jorobada", "Mexico","azul", 2 , "pesado");
    System.out.println(ballena);

  ballena.comer();
  ballena.NardarMar();
 

  System.out.println(ballena.getNombre()+" tiene "+ballena.getNumAletas()+" aletas");
  }

}


