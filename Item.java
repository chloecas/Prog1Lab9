
/**
 * A collection of items that will be found in rooms
 * Question 22 Lab 9
 *
 * @author Chloe 
 * @version v1
 */
public class Item
{
    private String description;
    private int weight;
    private String name; 

    /**
     * Constructor for objects of class Item
     */
    public Item(String description, int weight, String name)
    {
        this.description = description;
        this.weight= weight;
        this.name = name;
    }

    /**
     * 
     */
    public void getDescription()
    {
        System.out.println("In this area" + this.description);
    }
}
