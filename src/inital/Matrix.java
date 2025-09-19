package inital;

import java.util.Arrays; // we know this is important

public class Matrix
{
    public static void main(String[] args)
    {
        int[][] arr = // Got the array, baby!
        	{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        
        System.out.println(Arrays.toString(matrixSearch(arr, 5)));
        System.out.println(Arrays.toString(matrixSearch(arr, 15)));
    }

    public static int[] matrixSearch(int[][] arr, int key)
    {
        if (arr == null || arr.length == 0 || arr[0].length == 0) // WHY DID AI DO THIS!?
        {
            return new int[]{-1, -1};
        }

        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < rows; i++) {
           
            if (key < arr[i][0] || key > arr[i][cols - 1]) continue;

            int j = binarySearchRow(arr[i], key);
            if (j != -1) return new int[]{i, j};
        }

        return new int[]{-1, -1}; // It's not found, I guess.
    }

    private static int binarySearchRow(int[] row, int key) // Got the good ol' binary search needed for this assignment
    {
        int lo = 0, hi = row.length - 1;
        while (lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if (row[mid] == key) return mid;
            else if (row[mid] < key) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }
}