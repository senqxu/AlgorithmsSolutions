package me.sqxu.com.SwordToOffer;

import java.util.ArrayList;

/**
 * 把数组拍成最小的数
 *
 * @author : Administrator
 * @subject : 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 *      例如输入数组 {3，32，321}， 则打印出这三个数字能排成的最小数字为 321323 。
 * @create 2018-03-25 13:32
 */
public class PrintMinNumber {

    public String printMinNumber(int[] numbers) {
        int n;
        String s = "";
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        return "";
    }
}
