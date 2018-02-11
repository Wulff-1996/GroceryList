public class GroceryList
{

    private GroceryItemOrder[] groceryItemOrders;
    private int length;
    private int size;

    public GroceryList()
    {
        this.groceryItemOrders = new GroceryItemOrder[10];
        this.length = 10;
        this.size = 0;
    }

    //  methods
    public int getSize()
    {
        this.size = 0;

        for (int i = 0; i < this.length; i++)
        {
            if (this.groceryItemOrders[i] != null)
            {
                this.size++;
            }
        }

        return this.size;
    }


    public void add(GroceryItemOrder groceryItemOrder)
    {
        //  calculate the size of the list
        this.size = getSize();

        //  check listsize < this.length
        if (this.size < length && this.size >= 0)
        {
            groceryItemOrders[this.size] = groceryItemOrder;
        }
        //  create a new list with double length
        else
        {
            //  create temp to store the values
            GroceryItemOrder[] temp = this.groceryItemOrders;


            //  create a new double length list
            this.groceryItemOrders = new GroceryItemOrder[this.length + 10];

            //  add the old elements to the new
            for (int i = 0; i < this.length ; i++)
            {
                this.groceryItemOrders[i] = temp[i];
            }

            //  update the length
            this.length = this.length + 10;

            //  add the new element
            this.groceryItemOrders[this.size] = groceryItemOrder;
        }
    }

    public double getTotal()
    {
        this.size = getSize();
        double total = 0;

        for (int i = 0; i <this.size ; i++)
        {
            total += this.groceryItemOrders[i].getPrice();
        }

        return total;
    }

    public void remove(int index)
    {
        //  if index is not larger than the size
        if (index < this.size &&  index >= 0)
        {
            this.size = getSize();

            //  temp for storing values
            GroceryItemOrder[] temp = this.groceryItemOrders;

            //  create a new list with same length
            this.groceryItemOrders = new GroceryItemOrder[this.length];

            //  remove the first object
            if (index == 0)
            {
                //  add all element without the first
                for (int i = 1; i < this.size ; i++)
                {
                    this.groceryItemOrders[i-1] = temp[i];
                }
            }
            // remove the last object
            else if (index == this.size-1)
            {
                //  add all element without the first
                for (int i = 0; i <this.size-1 ; i++)
                {
                    this.groceryItemOrders[i] = temp[i];
                }
            }

            else
            {
                //  from first to index -1
                for (int i = 0; i < index ; i++)
                {
                    this.groceryItemOrders[i] = temp[i];
                }
                //  from index + 1 to this.size
                for (int i = index+1; i <this.size ; i++)
                {
                    this.groceryItemOrders[i-1] = temp[i];
                }
            }
        }
        else
        {
            //  print error
            System.out.println("indexOutOfBounds (remove cancelled)");
        }
    }

    public int getLength()
    {
        return this.length;
    }

    @Override
    public String toString()
    {
        String list = "\nGroceryList";

        for (GroceryItemOrder item: this.groceryItemOrders)
        {
            if (item != null)
            list += item;

        }
        return list;
    }
}
