package Sort.BubbleSort;

/**
 * @author zhangpeishi
 *
 * 冒泡排序实现算法优化
 *
 * 当检测到一趟无交换发生时，停止循环
 */
public class BubbleBetter {

    private int[] a;

    //记录交换的次数
    private int num;

    public BubbleBetter(int [] a){

        this.a = a;
    }

    public void Bubble(){


        boolean flag = true;
        num = 0;

        for (int i = 0; i < a.length; i++) {

            while(flag){


            flag = false;

            for (int j = 0; j < a.length-i-1; j++) {

                if(a[j] > a[j+1]) {

                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    flag = true;
                    ++num;
                }


                }

            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println("\n");
        System.out.println("交换了 "+ num +" 次");
    }

}
