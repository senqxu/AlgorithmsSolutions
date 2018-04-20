package me.sqxu.com.SwordToOffer;

import java.util.ArrayList;

/**
 * 顺时针打印矩阵
 *
 * @author : Administrator
 * @subject 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * @expmle 例如，如果输入如下矩阵： 1  2  3      4
 *                              5  6   7     8
 *                              9  10  11   12
 *                              13 14 15    16
 *          则依次打印出数字1,2,3,4, 8,12,16,15,14, 13,9,5,6 ,7,11, 10.
 * @create 2018-04-12 22:01
 */
public class PrintMatrix {



    /**
     * @param matrix
     * @return ArrayList
     */

     /*   int rows = matrix.length;
        int columns = matrix[0].length;
        int start = 0;
        while (rows > start * 2 && columns > start * 2) {
            printMatrixCircle(matrix, rows, columns, start);
            start++;
        }
        return list;
    }


    private void printMatrixCircle(int[][] matrix, int rows, int columns, int start) {
        // 从左到右打印一行
        for (int i = start; i < columns - start; i++) {
            list.add(matrix[start][i]);
        }
        // 从上到下打印一列
        for (int j = start + 1; j < rows - start; j++) {
            list.add(matrix[j][columns - start - 1]);
        }
        // 从右到左打印一行
        for (int m = columns - start - 2; m > start && rows - start - 1 > start; m--) {
            list.add(matrix[rows - start - 1][m]);
        }
        // 从下到上打印一列
        for (int n = rows - start - 2; n >= start + 1 && columns - start - 1 > start; n--) {
            list.add(matrix[n][start]);
        }
    }*/
    private ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(matrix == null&& matrix.length == 0){
            return list;
        }
        //获取行，列的个数
        int row = matrix.length;
        int col = matrix[0].length;
        //定义左，上，右，下四个参数
        int left =0,up = 0,right = col - 1,down = row - 1;
        while (left <= right && up<= down) {
            //从左往右打印
            for (int i = 0; i <right ; i++) {
                list.add(matrix[up][i]);
            }
            //从上往下打印
            for (int i = up + 1; i <down ; i++) {
                list.add(matrix[i][right]);
            }
            //从右往左打印
            if(up != down) {
                for (int i = right - 1; i >= left; i--) {
                    list.add(matrix[down][i]);
                }
            }
            //从下往上打印
            if(left != right) {
                for (int i = down - 1; i >= up; i--) {
                    list.add(matrix[i][left]);
                }
            }

            left++;
            right--;
            up++;
            down--;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        PrintMatrix mx = new PrintMatrix();
        System.out.println(mx.printMatrix(arr));
    }
}
