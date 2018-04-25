/*
* Authors: Marielle Korringa, Rachel Angelsberg, Elizabeth Hamaoka
* Date: 24 April 2018
* Overview:
*/


package outlab4;

public class Coins {
    	  public static int[] makeChange(int[] coinsAvailable, int change, int[] list, int[] coinsGiven){
			int x = 0;
			while(x < list.length){
				list[x] = 0;
				coinsGiven[x] = 0;
				++x;
			}
			if(coinsAvailable.length <= 0) {
				throw new IllegalArgumentException("Array of size 0 is not allowed");
			}
			if(change <= 0){
				throw new IllegalArgumentException("Change must be a positive nonzero number"); 
			}
			int z = 0; 
			for(int j = 0; j < coinsAvailable.length; ++j){
				for(int w = 0; w < coinsAvailable.length; ++w){
					if(coinsAvailable[j] == 0){
						return null; 
					}
					if(coinsAvailable[j] == Integer.MAX_VALUE){
						return null;
					}
					if(coinsAvailable[j] <= change){
						list[z] = coinsAvailable[j];
						change = change-coinsAvailable[j];
						++z;
					}
				}
				++j;
			} 
			int w = 0;
			System.out.println("Coins needed for change: ");
			while(w < list.length){
				if(list[w] != 0){
					System.out.print(list[w]+" ");
				}
				++w;
			}
			System.out.println("");
			return list; 
		}
	
	/*public static void main(String[] args){
		int[] coins = {25, 10, 5, 1}; 
		int change = 24;
		int[] minimumCoins = new int[change+1]; 
		int[] usedCoins = new int[change+1];
		int[] give;
		give = makeChange(coins, change, minimumCoins, usedCoins);
	} */
}
