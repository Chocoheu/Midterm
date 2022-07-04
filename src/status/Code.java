package status;

/**
 * This class +++Insert Description Here+++
 *
 * @author Carly Pham
 */
public class Code 
{
    public enum Number{ZERO, ONE, TWO, THREE};
    private Number number;

    /**
     * @return the number
     */
    public Number getNumber() 
    {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(Number number) 
    {
        this.number = number;
    }
}
