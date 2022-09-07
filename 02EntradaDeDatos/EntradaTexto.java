//esto es un comentario 

/*
 * todo programa en java debe tener el nombre de la clase tal cual como el archivo 
 *
 */

class Entradatexto {
   // los limites de la clase

   // toda clase debe de tener un metodo principal
   /**
    * vamos a realizar un programada mediante el cual podamos introducir texto a
    * nuestra conveniencia
    */

   // tipo de dato

   // el; es el fin de linea

   // metodo principal
   public static void main(String[] args) {
      String nombre;
      // instancia

      int edad;
      System.out.println("por favor introduce tu nombre bien kawai");

      // vamos a obtener el nombre del usuario

      nombre = System.console().readLine();

      System.out.println("por favor introduce tu edad : ");

      edad = Integer.parseInt(System.console().readLine());

      System.out.println("Hola " + nombre + "bienvenido a tu programita  tienes " + edad + "primaveras");
   }
}