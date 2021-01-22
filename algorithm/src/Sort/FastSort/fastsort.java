package Sort.FastSort;

import sun.text.resources.cldr.ia.FormatData_ia;

/**
 * @author zhangpeishi
 *
 * @version 1.0
 *
 * 快速排序实现算法
 */
public class fastsort {

    private int [] a;

    public fastsort(int [] a){

        this.a = a;
    }

    public void fast(int i , int j) {

        while (i < j) {
            int key = a[i];
            while ((i < j) && (a[i] < a[j])) {

                --j;
            }
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            while ((i < j) && (a[i] < a[j])) {

                ++i;
            }

            int temp1 = a[i];
            a[i] = a[j];
            a[j] = temp1;

        }

        int  index  = i;


        fast(0,index-1);
        fast(index+1,a.length);

        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }


    }


    }



