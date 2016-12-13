import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by mcclarci on 12/02/2016.
 */
public class RegionHashTable {
    public static void main(String[] args) throws IOException
    {
        String filename = "dma.txt";
        File file = new File(filename);
        Scanner reader = new Scanner(file).useDelimiter("[,\n]");

        BasicTable regionTable = new BasicTable();

        String key = "";
        String city = "";
        int region = 0;
        String state = "";
        String value  = "";

        long startTime = System.nanoTime();
        int collisions = 0;

        while(reader.hasNext())
        {
            key = reader.next();
            city = reader.next();
            state = reader.next();
            value = state + "," + key;
            value = value.replace("\n", "").replace("\r", "");

            region = regionTable.hashCode(city);

            if(regionTable.search(region))
            {
                collisions++;
            }

            regionTable.insert(region, value);
        }

        long endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1000000.0;
        System.out.println("Time from first item to last item read:: " + duration + " milliseconds");
        System.out.println(" Collisions : " + collisions);


    }
}

