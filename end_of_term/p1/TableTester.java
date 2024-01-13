package end_of_term.p1;

/*
程序功能：求二维数组中各行元素之和并查找其值最大的那个行
*/
public class TableTester {
    public static void main(String args[]) {
        int myTable[][] = {
                {23, 45, 65, 34, 21, 67, 78},
                {46, 14, 18, 46, 98, 63, 88},
                {98, 81, 64, 90, 21, 14, 23},
                {54, 43, 55, 76, 22, 43, 33}};
        int sum, max, maxRow = 0;
        max = 0;    //Assume all numbers are positive
        for (int row = 0; row < myTable.length; row++) {
            sum = 0;
            for (int col = 0; col < myTable[0].length; col++)
                sum += myTable[row][col];
            if (sum > max) {
                max = sum;
                maxRow = row;
            }
        }
        System.out.println("Row " + maxRow + " has the highest sum of " + max);
    }
}
