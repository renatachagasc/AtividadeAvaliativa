/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeavaliativa;

/**
 *
 * @author 20171148060029
 */
public class ShellSort {

    void shellSort(int[] nums) {
        int h = 1;
        int n = nums.length;

        h = n / 2;
        int c, j;

        while (h > 0) {
            for (int i = h; i < n; i++) {
                c = nums[i];
                j = i;
                while (j >= h && nums[j - h] > c) {
                    nums[j] = nums[j - h];
                    j = j - h;
                }
                nums[j] = c;
            }
            h = h / 2;
        }
    }
}
