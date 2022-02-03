import java.util.Random;
/**
* Assignment 1 - Pokemon Object.
* @author Jason Herrera
* @since 2/2/2022
*/


public class Pokemon {

   //========= instance variables =========
   
   /** The Pokemon's species. */
   private String species = "";
   /** The Pokemon's name. */
   private String name = "";
   /** The Pokemon's pokedex number. */
   private int number = 0;
   /** The Pokemon's type1. */
   private String type1 = "";
   /** The Pokemon's type2. */
   private String type2 = "";
   /** The Pokemon's hitPnts "hit points". */
   private int hitPnts = 0;
   /** The Pokemon's comPwr "combat power". */
   private int comPwr = 0;
   /** Max int for hitPnts. */
   static final int MAX1 = 150;
   /** Min int for hitPnts. */
   static final int MIN1 = 10;
   /** Max double for comPwr multiplier. */
   static final double MAX2 = 3.00;
   /** Min double for comPwr multiplier. */
   static final double MIN2 = 1.00;   
   
   //========== Constructor ===========
   /**
   * Constructs a Pokemon object.
   * @param newSpecies the Pokemon's species
   * @param newName the Pokemon's name
   * @param newNumber the Pokemon's pokedex number  was newID
   * @param newType1 the Pokemon's type1
   * @param newType2 the Pokemon's type2
   */
   
   public Pokemon(String newSpecies, String newName, int newNumber, String newType1, String newType2) 
   throws PokemonException {
      
      this.setSpecies(newSpecies);
      this.setName(newName);
      this.setNumber(newNumber);
      this.setType1(newType1);
      this.setType2(newType2);
      //this.setHitPnts(newHitPnts);
      //this.setComPwr(newComPwr);
      
   } //close constructor
   
   //========== Constructor ===========
   /**
   * Constructs a Pokemon object.
   * @param newSpecies the Pokemon's species
   * @param newNumber the Pokemon's pokedex number  was newID
   * @param newType1 the Pokemon's type1
   * @param newType2 the Pokemon's type2
   */
   
   public Pokemon(String newSpecies, int newNumber, String newType1, String newType2) 
   throws PokemonException {
      
      this.setSpecies(newSpecies);
      this.setName(newSpecies);
      this.setNumber(newNumber);
      this.setType1(newType1);
      this.setType2(newType2);
      
   } //close constructor
   
   
   //============= toString ==================
   
   /**
   * toString method.
   * @return a String representation of the Pokemon object
   */
   public String toString() {
      String s = "";
      s = "Species: " + this.species;
      s = s + "\nName: " + this.name;
      s = s + "\nNumber: " + this.number;
      s = s + "\nType: " + this.type1 + " | " + this.type2;
      s = s + "\nHP: " + this.hitPnts;
      s = s + "\nCP: " + this.comPwr;
      
      return s;
   }
   
   //=========== get methods =================
   
   /**
   * gets the Pokemon's species.
   *@return the Pokemon's species
   */
   public String getSpecies() {
   
      return this.species;
   }
   
   /**
   * gets the Pokemon's name.
   *@return the Pokemon's name
   */
   public String getName() {
      
      return this.name;
   }
   
   /**
   * gets the Pokemon's pokedex number.
   *@return the pokedex number
   */
   public int getNumber() {
   
      return this.number;
   }
   
   /**
   * gets the Pokemon's type1.
   *@return the type1
   */
   public String getType1() {
   
      return this.type1;
   }
   
   /**
   * gets the Pokemon's type2.
   *@return the type2
   */
   public String getType2() {
   
      return this.type2;
   }
   
   /**
   * gets the Pokemon's hitPnts.
   *@return the hitPnts
   */
   public int getHitPnts() {
   
      return this.hitPnts;
   }
   
   /**
   * gets the Pokemon's comPwr.
   *@return the comPwr
   */
   public int getComPwr() {
   
      return this.comPwr;
   }
   
   //========== set methods ==============
   /**
   * Sets the Pokemon's species.
   * @param newSpecies the new species
   */
   public void setSpecies(String newSpecies) throws PokemonException {
   
         if (newSpecies.length() > 0) {
            this.species = newSpecies;
         } else {
            //send error in form of exception
            throw new PokemonException("Species should not be empty or contain only spaces.");
         }
   }
   
   /**
   * Sets the Pokemon's name.
   * @param newName the new name
   */
   public void setName(String newName) {
      
         if (newName.length() > 0) {
            this.name = newName;
         } else {
            //the name instance variable is set to be same as species if name is empty
            this.name = species;
         }
   }

   /**
   * Sets the Pokemon's number.
   * @param newNumber the new number
   */
   public void setNumber(int i) throws PokemonException {
   
         if (i >= 1 && i <= 151) {
            this.number = i;
         } else {
            //send error in form of exception
            throw new PokemonException("Number must be between 1 and 151.");
         }
   }
   
   /**
   * Sets the Pokemon's Type1.
   * @param newType1 the new type1
   */
   public void setType1(String newType1) {
   
         if (newType1.length() > 0) {
            this.type1 = newType1;
         }
   }

   /**
   * Sets the Pokemon's Type2.
   * @param newType2 the new type2
   */
   public void setType2(String newType2) {
   
         if (newType2.length() > 0) {
            this.type2 = newType2;
         }
   }
   
   /**
   * Sets the Pokemon's hit points.
   * @param newHitPnts the new hit points
   */
   public void setHitPnts(int h) {
   
         Random ranGen = new Random(); //random number generator
         int i = ranGen.nextInt(MAX1 - MIN1 + 1) + MIN1;
         this.hitPnts = i;
      
   }    
   
   /**
   * Sets the Pokemon's conbat poewr.
   * @param newComPwr the new hit points
   */
   public void setComPwr(double j) {
   
         Random ranGen = new Random(); //random number generator
         double multiplier = MIN2 + (MAX2 - MIN2)* ranGen.nextDouble();
         double comPwr = (int) hitPnts * multiplier;
         
         
         this.comPwr = (int)comPwr;
      
   }

} //close class
