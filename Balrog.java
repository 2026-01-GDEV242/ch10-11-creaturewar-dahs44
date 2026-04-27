

/**
 * The Balrog class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * @author Bill Crosbie
 * @version 2025-04 v1.1
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 80;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Constructor for objects of class Balrog -
     * Note that the calling class does not need to know anything about the 
     * requirements of Balrog minimum and maximum values
     * 
     * The instantiating class asks for a Balrog and the human class is responsible for
     * return a Balrog object with values in the appropriate range
     * 
     */
     public Balrog()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR,
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP        
        );
          
    }
    
    
    /**
     * Balrog Attacks twice
     */
    public int attack()
    {
        int tempDamage;
        
        tempDamage = super.attack(); //Left Claw
        tempDamage = tempDamage + super.attack(); //Right Claw
        
        return tempDamage;
        
    }
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

}
