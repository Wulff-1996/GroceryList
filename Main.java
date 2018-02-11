public class Main
{
    public static void main(String[] args)
    {
        GroceryList groceryList = new GroceryList();
        GroceryList2 groceryList2 = new GroceryList2();

        READFILE readfile = new READFILE();
        readfile.readItems(groceryList);
        readfile.readItems(groceryList2);

        System.out.println("comparing the two lists");
        System.out.println("--------------------------\n");

        //  compare the two lists
        System.out.println("GroceryList1:");
        System.out.println("size: " + groceryList.getSize());
        System.out.println("GroceryList2:");
        System.out.println("size: " + groceryList2.size());

        //  print the lists
        System.out.println(groceryList);
        System.out.println(groceryList2);


        System.out.println("\nindex 0 removed");
        System.out.println("----------------------------------\n");

        //  test if it removes the right index as arraylist
        // first index 0
        groceryList.remove(0);
        groceryList2.remove(0);

        //  print the lists again
        System.out.println(groceryList);
        System.out.println(groceryList2);


        System.out.println("\nindex last removed");
        System.out.println("----------------------------------\n");

        // remove last index
        groceryList.remove(10);
        groceryList2.remove(10);

        //  print the lists again
        System.out.println(groceryList);
        System.out.println(groceryList2);


        System.out.println("\nindex 5 removed");
        System.out.println("----------------------------------\n");

        // remove middle index
        groceryList.remove(5);
        groceryList2.remove(5);

        //  print lists again
        System.out.println(groceryList);
        System.out.println(groceryList2);


        System.out.println("\nOVERVIEW");
        System.out.println("----------------------------------");

        //  calculate the total of the lists
        System.out.println("\ngrocery list 1:");
        System.out.println("-size: " + groceryList.getSize());
        System.out.println("-total: " + groceryList.getTotal());

        System.out.println("\ngrocery list 2: ");
        System.out.println("-size: " + groceryList2.size());
        System.out.println("-total: " + groceryList2.getTotal());
    }
}
