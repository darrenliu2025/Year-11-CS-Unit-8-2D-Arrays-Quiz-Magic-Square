import javax.swing.*;

public class MagicSquare {
    /**
     *
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {
            int sum = 0;
                for (int i = 0; i < array2d[0].length; i = i + 1)
                    sum = sum + array2d[0][i];
            return sum;
        }


    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     *         Because we have already determined the sum of the first row
     *         via the method 'calculateCheckSum', this method can begin
     *         iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {
        int yes = 0;
        int sum = 0;
        for (int k = 1; k < array2d.length; k = k + 1)
            for (int i = 0; i < array2d[k].length; i = i + 1)
                sum = sum + array2d[0][i];
            if (sum == checkSum)
                yes = yes + 1;
            sum = 0;
        if (yes == array2d.length)
            return true;
        else
            return false;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */
    public static boolean magicColumns(int[][] array2d, int checkSum) {
        int yes = 0;
        int sum = 0;
        for (int k = 1; k < (array2d[0].length + 1); k = k + 1)
            for (int i = 0; i < array2d.length; i = i + 1)
                sum = sum + array2d[i][k];
            if (sum == checkSum)
                yes = yes + 1;
            sum = 0;
            if (yes == array2d.length)
                return true;
            else
                return false;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {
        int yes = 0;
        int sum = 0;
        for (int k = 0; k < (array2d[0].length); k = k + 1)
            sum = sum + array2d[k][k];
        if (sum == checkSum)
            yes = yes + 1;
            sum = 0;
        for (int k = (array2d.length -1); k > 0; k = k - 1)
            sum = sum + array2d[k][k];
        if (sum == checkSum)
            yes = yes + 1;
        if (yes == 2)
            return true;
        else
            return false;
    }

    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {
        int sum = calculateCheckSum(array2d);
        if (((magicRows(array2d, sum) == true)&& (magicColumns(array2d, sum) == true))&& (magicDiagonals(array2d, sum) == true))
            return true;
        else
            return false;
    }

}
