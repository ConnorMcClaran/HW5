import java.util.Hashtable;

/**
 * Created by mcclarci on 12/01/2016.
 */
public class BasicTable {
    private Hashtable<Integer, String> table = new Hashtable<>();


    BasicTable() {}


    public int hashCode(String key)
    {
        int hash = 5;

        for(int i = 0; i < key.length(); i++)
        {
            hash = hash * 31 + key.charAt(i);
        }

        return hash;
    }

    public void insert(int key, String value)
    {
        table.put(key, value);
    }

    public void delete(int key)
    {
        table.remove(key);
    }

    public boolean search(int key)
    {
        return table.containsKey(key);
    }

    public String getValue(int key)
    {
        String value = "";
        value = table.get(key);
        return value;
    }
}

