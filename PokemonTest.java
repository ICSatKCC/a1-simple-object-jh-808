import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.*;

public class PokemonTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /* Constructor no Name test - Name same as species if not specified **/
   @Test public void noNameTest(){
      Pokemon p = new Pokemon("Bulbasaur", 1, "Grass", "Poison");
      Assert.assertEquals("Name and Species should be the same, if no name given.", "Bulbasaur", p.getName());
   
   }
   
      /* 5 Parameter Constructor no Name test - Name same as species if not specified,  **/
   @Test public void noNameTest2(){
      Pokemon p = new Pokemon("Bulbasaur", "", 1, "Grass", "Poison");
      Assert.assertEquals("Name and Species should be the same, if no name given.", "Bulbasaur", p.getName());
   
   }
   
   /*HP constructor tests
   * Checks that HP in range after 4 param constructor   *
   * Run it 5 times to check due to randomness
   */
   @Test public void hpRangeTest(){
      Pokemon p;
      int h;
      
      for(int i = 0; i < 5; i++) {
         p = new Pokemon("Bulbasaur", 1, "Grass", "Poison");
         h = p.getHitPnts();
      
         Assert.assertTrue("HP should be between 10 and 150, but is " + h,(10 <= h && h <= 150));
      } 
   }
   /*HP constructor tests
   * Checks that HP in range 5 param constructor  *
   * Run it 5 times to check due to randomness
   */
   @Test public void hpRangeTest2(){
      Pokemon p;
      int h;
      
      for(int i = 0; i < 5; i++) {
         p = new Pokemon("Bulbasaur", "Bobby", 1, "Grass", "Poison");
         h = p.getHitPnts();
      
         Assert.assertTrue("HP should be between 10 and 150, but is " + h,(10 <= h && h <= 150));
      } 
   }
      
   /*CP 4 param constructor test
   * Checks that CP in range*
   * Atleast equal HP not more than 3x HP
   * Run it 5 times to check due to randomness
   */
   @Test public void cpRangeTest(){
      Pokemon p;
      int h;
      int c;
      
      for(int i = 0; i < 5; i++) {
         p = new Pokemon("Bulbasaur", 1, "Grass", "Poison");
         h = p.getHitPnts();
         c = p.getComPwr();
         Assert.assertTrue("CP should be between 1 and 3x HP but was " + c +
              " and HP is: " + h,(h <= c && c <= (h*3)));
      }
   }
   /*CP 5 param constructor test
   * Checks that CP in range*
   * Atleast equal HP not more than 3x HP
   * Run it 5 times to check due to randomness
   */
   @Test public void cpRangeTest2(){
      Pokemon p;
      int h;
      int c;
      
      for(int i = 0; i < 5; i++) {
         p = new Pokemon("Bulbasaur", "Betty", 1, "Grass", "Poison");
         h = p.getHitPnts();
         c = p.getComPwr();
         Assert.assertTrue("CP should be between 1 and 3x HP but was " + c +
              " and HP is: " + h,(h <= c && c <= (h*3)));
      }
   }
 
   /* PowerUp test
   * Checks that HP always increases and CP never decreases
   * Run it 5 times to check due to randomness
   *
   */
   @Test public void powerUpTest(){
      Pokemon p;
      int h, h2;
      int c, c2;
      
      for(int i = 0; i < 5; i++) {
         p = new Pokemon("Bulbasaur", 1, "Grass", "Poison");
         h = p.getHitPnts();
         c = p.getComPwr();
         p.powerUp();  
         h2 = p.getHitPnts();
         c2 = p.getComPwr(); 
         Assert.assertTrue("Powerup method should increase HP and CP, "+ 
              "but values were oldHP, newHP, oldCP, newCP: " + h + 
              "," + h2 + "," + c + "," + c2, (h < h2 && c <= c2)); 
      }
   }
   /* PowerUp test2
   * Checks that HP always increases and CP never decreases
   * This one uses 5 param constructor
   * Run it 5 times to check due to randomness
   *
   */
   @Test public void powerUpTest2(){
      Pokemon p;
      int h, h2;
      int c, c2;
      
      for(int i = 0; i < 5; i++) {
         p = new Pokemon("Bulbasaur", "Barney",  1, "Grass", "Poison");
         h = p.getHitPnts();
         c = p.getComPwr();
         p.powerUp();  
         h2 = p.getHitPnts();
         c2 = p.getComPwr(); 
         Assert.assertTrue("Powerup method should increase HP and CP, "+ 
              "but values were oldHP, newHP, oldCP, newCP: " + h + 
              "," + h2 + "," + c + "," + c2, (h < h2 && c <= c2)); 
      }
   }
 
   /* testing toString method
   * checks that toString is properly formatted.
   */
   @Test
   public void toStringTest1(){
      Pokemon p = new Pokemon("Bulbasaur", 1, "Grass", "Poison");
      int hP = p.getHitPnts();
      int cP = p.getComPwr();
      Assert.assertEquals("toString format is incorrect for Pokemon with no name",  
         "Species: Bulbasaur\nNumber: 001\nType: Grass | Poison\nHP: "+hP+"\nCP: "+cP, p.toString());
   
   }
   
   /* testing toString method
   * checks that toString is properly formatted with Name and empty type2.
   */
   @Test
   public void toStringTest2(){
      Pokemon p = new Pokemon("Charmander", "Lisa's Charmander", 4, "Fire", "");
      int hP = p.getHitPnts();
      int cP = p.getComPwr();
      Assert.assertEquals("toString format is incorrect for Pokemon with name, no type 2",  
         "Species: Charmander\nName: Lisa's Charmander\nNumber: 004\nType: Fire\nHP: "+hP+"\nCP: "+cP, p.toString());
   
   }
   /* testing toString method
   * checks that toString is properly formatted with no Name and empty type2.
   */
   @Test
   public void toStringTest3(){
      Pokemon p = new Pokemon("Caterpie", 10, "Bug", "");
      int hP = p.getHitPnts();
      int cP = p.getComPwr();
      Assert.assertEquals("toString format is incorrect for Pokemon with no name, no type 2",  
         "Species: Caterpie\nNumber: 010\nType: Bug\nHP: "+hP+"\nCP: "+cP, p.toString());
   
   }
   
   /* should fail, no vertical bar if no type 2 */
//    @Test
//    public void toStringTest4(){
//       Pokemon p = new Pokemon("Caterpie", 10, "Bug", "");
//       int hP = p.getHitPnts();
//       int cP = p.getComPwr();
//       Assert.assertEquals("To string incorrect format", 
//          "Species: Caterpie\nNumber: 010\nType: Bug | \nHP: "+hP+"\nCP: "+cP+"\n", p.toString());
//    }
   
   /** Test get methods **/
   
   /*Test returning name */
   @Test
   public void getSpeciesTest(){
      Pokemon p = new Pokemon("Caterpie", 10, "Bug", "");
      String actSpecies = "Caterpie";
      
      Assert.assertEquals("getSpecies doesn't correctly return Pokemon's species.",  
         actSpecies, p.getSpecies());
   
   }
   /* Test returning name as species when none specified */
   @Test
   public void getNameTest1(){
      Pokemon p = new Pokemon("Caterpie", 10, "Bug", "");
      String actName = "Caterpie";
      
      Assert.assertEquals("getName doesn't correctly return Pokemon's species if no Name.",  
         actName, p.getName());
   
   }
   
   /* Test returning Name when one is specified */
   @Test
   public void getNameTest2(){
      Pokemon p = new Pokemon("Squirtle", "My Squirtly", 7, "Water", "");
      String actName = "My Squirtly";
      
      Assert.assertEquals("getName doesn't correctly return a named Pokemon's Name.",  
         actName, p.getName());
   
   }
  
   /* Test returning type1 */
   @Test
   public void getType1Test(){
      Pokemon p = new Pokemon("Squirtle", "My Squirtly", 7, "Water", "");
      String actType = "Water";
      
      Assert.assertEquals("getType1 doesn't correctly return Pokemon's type1.",  
         actType, p.getType1());
   
   }
   
   /* Test get methods */
   @Test
   public void getType2Test1(){
      Pokemon p = new Pokemon("Squirtle", "My Squirtly", 7, "Water", "");
      String actType = "";
      
      Assert.assertEquals("getType2 doesn't correctly return empty string when none.",  
         actType, p.getType2());
   
   }
   
   @Test
   public void getType2Test2(){
      Pokemon p = new Pokemon("Venusaur", "Lisa's Venusaur", 3, "Grass", "Poison");
      String actType = "Poison";
      
      Assert.assertEquals("getType2 doesn't correctly return Pokemon's type 2.",  
         actType, p.getType2());
   
   }
   
   @Test
   public void getNumberTest(){
      Pokemon p = new Pokemon("Venusaur", "Lisa's Venusaur", 3, "Grass", "Poison");
      int actNumber = 3;
      
      Assert.assertEquals("getNumber doesn't correctly return Pokemon number.",  
         actNumber, p.getNumber());
   
   }
   
   /**
   * Test only set method
   */
   @Test
   public void setNameTest(){
      Pokemon p = new Pokemon("Venusaur", "Lisa's Venusaur", 3, "Grass", "Poison");
      p.setName("Venus");
      Assert.assertEquals("setName doesn't correctly set Pokemon's Name to new value", "Venus", p.getName());
       
   }
   
   
}
