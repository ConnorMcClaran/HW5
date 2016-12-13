import java.io.File;
import java.io.IOException;
import java.util.Scanner;



/**
 * Created by mcclarci on 12/02/2016.
 */
public class DMAHashTable {
    public static void main(String[] args) throws IOException
    {
        String filename = "dma.txt";
        File file = new File(filename);
        Scanner reader = new Scanner(file).useDelimiter("[,\n]");

        BasicTable hashTable = new BasicTable();

        int key = 0;
        String city = "";
        String state = "";
        String value  = "";

        long startTime = System.nanoTime();
        int collisions = 0;

        while(reader.hasNext())
        {
            key = reader.nextInt();
            city = reader.next();
            state = reader.next();
            value = city + "," + state;
            value = value.replace("\n", "").replace("\r", "");

            if(hashTable.search(key))
            {
                collisions++;
            }

            hashTable.insert(key, value);
        }

        long endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1000000.0;
        System.out.println("Time from first item to last item read: " + duration + " milliseconds");
        System.out.println(" Collisions : " + collisions);


    }
}

