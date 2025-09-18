package inital;

public class Matrix 
{
  System.out.println(Arrays.toString(MatrixSearch(arr,5)));
}

int MatrixSearch(int[][] arr, int key)
{
	int rows = arr.length;      // FOR M
	int columns = arr[0].length; // FOR N
	
	int row = 0;
	int column = columns - 1;
}

while (row < rows && col >= 0)
{
	if(arr[row][column] == key)
	{
		return new int[] {row, column};
		
		else if (arr[row][column] > key)
		{
			column--; // MOVING LEFT
			
			else
			{
				row++; // MOVING DOWN
			}
		}
	}
	
	return new int[](-1, -1); // This is for not found, I guess
}