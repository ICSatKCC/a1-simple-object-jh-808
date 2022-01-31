# Assignment1 - Pokemon Object

Code Review in 1 week, 1/31, in class.

Final version due 2/2 at 11:55pm.

## Create a simple Pokemon object class. 


### Downloading and Submitting
 1. Open GitKraken on your computer
 2. Click on folder icon in upper left corner
 3. Choose "Clone" and "GitHub.com"
 4. Choose where to clone to (directory/folder you want your assignment code in)
 5. Choose Repository to clone (it should be in that list)
 6. Click "Clone the repo!" button
 7. **Before writing any code** Make a develop branch: 
    - Right click at top of project history tree, choose "Create branch here"
    - name branch "develop"
 5. Do your assignment, committing to the develop branch and pushing to Github regularly. 
 6.  **Before class on code review day** push what you have to GitHub in the develop branch.
     - I will show you how to make a pull request and do a review that day.
 7. When finished, push final version to GitHub and make a comment to the existing pull request titled *Assignment Submission*
    - Make sure you say what you did to address your reviewers comments!

## What to code
### Instance Variables
There should be 7 instance variables
  * String species
  * String name
  * int number
  * String type1
  * String type2
  * int hitPnts
  * int comPwr
  
These variables represent the fields that are stored in the Pokemon Go game. 
 - Species will be the "official" name, like Bulbasaur or Pikachu. 
 - The name is for an optional user-defined name. This should never be empty. If the user doesn't specify a name, the name should be set to be the same String as the species. 
  - The number will be the official Pokemon number out of the Pokedex. 
  - The types will be Pokemon types like water, fire, flying, etc. 
  - hitPnts is the "hit points"
  - comPwr is the "combat power"
  - If you are unfamiliar with Pokemon or their properties see for examples: [https://www.pokemon.com/us/pokedex/](https://www.pokemon.com/us/pokedex/).

### Constructors 
There should be two constructors.
 1. Takes in 5 parameters: ```species, name, number, type1, type2```
 2. Takes in 4 parameters: ```species, number, type1, type2```
   - (The 4 parameter constructor should set ```name``` to be the same String as ```species```) 
  
The ```hitPnts``` and ```comPwr``` should be set automatically when a Pokemon object is initialized. 
 * The ```hitPnts``` should be a random int between 10 and 150 inclusive.
 * ```comPwr``` is a little harder.
   * Make a **double** multiplier that is between Min=1.00 and Max=3.00
   * *hint:*  ```multiplier = Min + (Max - Min)*randGen.nextDouble();```
   * ``` comPwr = (int) hitPnts * multiplier```
   
### Get Methods
There should be a complete set of Gets methods for all instance variables. 

### Set Methods
__Only the ```name``` should have a public Set method__ (as everything else is either fixed or automatically set).
  - Either make the other set methods private access or don't write them.

### PowerUp method
There should be a public ```powerUp``` method that increases the hitPts and comPwr. It will not take in any parameters/arguments. It will calculate new values within the method.

The new hitPts should be set with this formula:
 * ```hitPnts = oldHitPnts + 1.15 + (0.2 * oldHitPnts)```
  * oldHitPnts being the value of this Pokemon's hitPts instance variable before powerUp.
 * The new comPwr should be calculated using the same formula as it is set with in the constructor, **BUT** it should only change if new value ends up to be more than the current comPwr.

### toString method
There should be a toString method that returns a String in this form:
```
Species: <Pokemon species>
Name: <Pokemon name>
Number: <number>
Type: <type1> | <type2>
HP: <hitPnts>
CP: <comPwr>
```
 * The name line should not be there if the name is the same as the species. 
 * The vertical bar should not be there if type2 is an empty string.
  
## JUnit Testing

Use the PokemonTest.java file provided in this repository to run JUnit on your Pokemon objects. 
 - I will use this when grading to determine if your code does what was assigned.

## Commenting and Style

All code should be commented using Javadoc and should follow the [Google Java style guide](https://google.github.io/styleguide/javaguide.html) for formatting.
  - Run checkstyle on your file to check that it is following the style guide.
  - Your grade will be marked down for checkStyle errors.

## Exceptions and error checking

We are going to implement that later. For now, do not worry about checking invalid input parameters or throwing Exceptions. Assume that correct Pokemon species, numbers, and types will be given to the constructor.

## Grading

Assignment is worth 100 points.

### Rubric:

| Requirement | Points |
| --- | --- |
| Passes all JUnit tests | y/n | 
| Passes Checkstyle | y/n |
| Constructor with 5 parameters | 10/10 |
| Constructor with 4 parameters |10/10 |
| Initialization of hitPnts & comPwr | 15/15 |
| Gets & Sets Methods | 15/15 |
| powerUp Method | 15/15 |
| toString Method | 15/15 |
|Commenting and Style |  10/10 |
| Reviewed Code (partner:    ) | 5/5 |
| Responded to Review from (     ) | 5/5 |
| **Total** | **100/100** |

