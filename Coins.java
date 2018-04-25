/*
* Authors: Marielle Korringa, Rachel Angelsberg, Elizabeth Hamaoka
* Date: 24 April 2018
* Overview:
*/


package outlab4;

public class Coins
{
    static int makeChange(int coins[], int m, int V)
    {
        if(coins.length <= 0) {
        throw new IllegalArgumentException("Array of size 0 is not allowed");
        }

        if(V <= 0){
            throw new IllegalArgumentException("Change must be a positive nonzero number");
        }

        int arr[] = new int[V + 1];

        arr[0] = 0;

        for (int i = 1; i <= V; i++) {
            arr[i] = Integer.MAX_VALUE;
        }

        for (int i = 1; i <= V; i++)
        {
            for (int j = 0; j < m; j++)
                if (coins[j] <= i)
                {
                    int s = arr[i - coins[j]];
                    if (s != Integer.MAX_VALUE && s + 1 < arr[i]) {
                        arr[i] = s + 1;
                    }
                }
        }
        return arr[V];
    }


    /*public static void main (String[] args)
    {
        int coins[] = {1, 5, 10, 25};
        int m = coins.length;
        int V = 499;
        System.out.println ( "Minimum coins required is "
                + makeChange(coins, m, V));
    }*/
}


