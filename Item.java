
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
       this.description= description;
       this.weight = weight;
       this.name = name;
    }
    
    /**
     *   
     */
    public void getItemDescription()
    {
        System.out.println("There is a" + this.description);
    }
}
