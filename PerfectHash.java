/**
 * Created by mcclarci on 12/8/2016.
 * Code for 3.4.4
 * I found the values with brute force this code proves they are correct
 */
public class PerfectHash {
    public static void main(String[] args){
        int a = 13;
        int M = 19;
        int [] table;
        table = new int[args.length];
        int [] b = new int[args.length];
        for (int i = 0; i < args.length; i++){
            b[i] = Integer.parseInt(args[i]);}
        for( int j = 0; j < args.length; j++){
            table[j] = ((a * b[j]) % M);
        }
        for( int k = 0; k < args.length; k++){
            System.out.println(table[k]);
        }


    }
}
