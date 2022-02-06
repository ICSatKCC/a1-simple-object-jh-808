/**
* Exception for Pokemon Assignment 1.
* @author Jason Herrera
* @since 2/2/2022
*/
public class PokemonException extends RuntimeException {
  
  //The superclass RuntimeException has one
  //instance variable, a String called "message"
  //this Exception can use it.
  
  /**
  * Constructor. 
  * @param newMessage The error message to be sent.
  */
   public PokemonException(String newMessage) {
      super(newMessage);
   }
   
   public PokemonException() {
      super("ERROR! Something's wrong.");
   }
   
} //closes class
