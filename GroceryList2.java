import java.util.ArrayList;

public class GroceryList2
{
    private ArrayList<GroceryItemOrder> groceryList;

    public GroceryList2()
    {
        this.groceryList = new ArrayList<>();
    }

    //  methods
    public void add (GroceryItemOrder groceryItemOrder)
    {
        this.groceryList.add(groceryItemOrder);
    }

    public void remove(int index)
    {
        this.groceryList.remove(index);
    }

    public int size()
    {
        return this.groceryList.size();
    }

    public double getTotal()
    {
        double sum = 0;

        for (GroceryItemOrder temp: this.groceryList)
        {
            sum += temp.getPrice();
        }

        return sum;
    }

    //  toString
    @Override
    public String toString()
    {
        String list = "\nGroceryList2";

        for (GroceryItemOrder item:this.groceryList)
        {
            list += item;
        }
        return list;
    }
}
