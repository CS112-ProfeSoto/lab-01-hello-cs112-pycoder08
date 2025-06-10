/*
 * UML DIAGRAM
 * --------------------------
 * Dice
 * -------------------------- 
 * - rollNum: int
 * --------------------------
 * + toString: String
 * + setRollNum(int): void
 * + getRollNum: int
 * + Dice()
 * + Dice(int)
 * + Dice(Dice)
 * + equals(): boolean
 */
public class Dice {
    /* INSTANCE VARIABLES */
    private int rollNum;

    /**
     * Returns string representation of the dice object
     * @return String representation of the die
     */
    public String toString() {
        return "Dice roll number: " + rollNum;
    }

    /**
     * Sets the rolled number value of a dice object
     * @param rollNum number to set rolled value to
     */
    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    /**
     * returns current rolled number
     * @return rolled number
     */
    public int getRollNum() {
        return rollNum;
    }

    /**
     * Default constructor for the dice class
     */
    public Dice() {
        this.rollNum = 0; // 0 for default
    }

    /**
     * Full constructor for the dice class
     * @param rollNum number to set the rolled number to
     */
    public Dice(int rollNum) {
        this.rollNum = rollNum; 
    }

    /**
     * Copy constructor for the dice class
     * @param other other dice object to copy
     */
    public Dice(Dice other) {
        this.rollNum = other.rollNum;
    }

    /**
     * Equals method for the dice class
     * @param other dice object to compare source die to
     * @return true of the dice are equal, false otherwise
     */
    public boolean equals(Dice other) {
        return this.rollNum == other.rollNum;
    }

    
}
