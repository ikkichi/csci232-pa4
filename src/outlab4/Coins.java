/*
* Authors: Marielle Korringa, Rachel Angelsberg, Elizabeth Hamaoka
* Date: 24 April 2018
* Overview:
*/


package outlab4;

public class Coins {
	public static int counting(int[] array){ //method to count used elements in array
		int num = 0;
		int i = 0;
		while(i < array.length){
			if(array[i] != 0){
				++num;
			}
			i++;
		}
		return num;
	}
	public static void transfer(int[] list, int[] hold){ //method to transfer elements into different array
		int i = 0;
		while(i < list.length){
			hold[i] = list[i];
			++i;
		}
	}
	public static int[] makeChange(int[] coins, int change,int[] counter){
		int[] list = new int[change]; 
		int[] hold = new int[change];
		int x = 0;
		while(x < list.length){
			list[x] = 0;
			hold[x] = 0;
			counter[x] = Integer.MAX_VALUE;
			++x;
		}
		if(coins.length == 0) {
			throw new IllegalArgumentException("Array of size 0 is not allowed");
		}
		int count = 0;
		while(count < coins.length){
			int i = count;
			int change2 = change;
			int y = 0; 
			while(i < coins.length){
				for(int v=0;v < list.length; ++v){
					if(coins[i] <= change2){
						list[y] = coins[i];
						change2 = change2-coins[i];
						++y;
					}
					if(coins[i] == 0){
						return null; 
					}
					if(coins[i] == Integer.MAX_VALUE){
						return null;
					}
				}
				++i;
			}
			counter[count] = counting(list);
			for(int r = 0; r < coins.length; ++r){
				if(counter[count] < counter[r]){
					transfer(list, hold);
				}
			}
			++count;
		}
		System.out.println("Coins needed are: ");
		int z = 0;
		while(z < hold.length){
			if(hold[z] != 0){
				System.out.print(hold[z]+" ");
			}
			++z;
		}
		return hold; 
	}
	/*public static void main(String[] args){
		int[] coins = new int[4];
		coins[0] = 25;
		coins[1] = 10;
		coins[2] = 5;
		coins[3] = 1; 
		int change = 40;
		int[] give = new int[change];
		give = makeChange(coins,change);
	} */
}
