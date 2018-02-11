public class GroceryItemOrder
{
    private String name;
    private int quantity;
    private double price;

    public GroceryItemOrder(String name, int quantity, double price)
    {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }



    //  method for calculation total prise
    public double getPrice()
    {
        return this.price * this.quantity;
    }

    //  getters and setters
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }

    //  toString
    @Override
    public String toString()
    {
        return "\n" + this.quantity + " x " + this.name + " total: " + this.getPrice();
    }
}
