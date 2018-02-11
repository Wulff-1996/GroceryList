import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class READFILE
{
    public void readItems(GroceryList2 list)
    {
        File file = new File("item.csv");
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine())
            {
                String nextLine = scanner.nextLine();

                String[] item = nextLine.split(",");
                list.add(new GroceryItemOrder(item[0],
                        Integer.parseInt(item[1]),
                        Double.parseDouble(item[2]))
                );
            }

            scanner.close();
        }

        catch (FileNotFoundException eFNF)
        {
            eFNF.printStackTrace();
        }
    }

    public void readItems(GroceryList list)
    {
        File file = new File("item.csv");
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine())
            {
                String nextLine = scanner.nextLine();

                String[] item = nextLine.split(",");
                list.add(new GroceryItemOrder(item[0],
                        Integer.parseInt(item[1]),
                        Double.parseDouble(item[2]))
                );
            }

            scanner.close();
        }

        catch (FileNotFoundException eFNF)
        {
            eFNF.printStackTrace();
        }
    }
}
