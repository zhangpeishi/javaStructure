package LinearTable;

import javax.lang.model.util.ElementScanner6;
import java.util.Arrays;

/**
 * @author zhangpeishi
 *
 * int 类型变长数组的实现（OOP思想）
 *
 */
public class variableArray {

    private int [] elements;

    public variableArray(){

        elements = new int[0];
    }
    public variableArray(int [] elements){

        this.elements = elements;
    }


    //1.加入一个元素就是 创建一个新的数组 容量比前一个数组多一个 再在末尾插入数据

    public void add(int element){

        int[] newarr = new int[elements.length+1];

        for (int i = 0; i < elements.length; i++) {

            newarr[i] = elements[i];
        }
        newarr[elements.length] = element;

        elements = newarr;

    }

    //2.删除一个元素，在末尾删除还是在中间删除

    public void del(int index){
        if(index < 0 || index >= elements.length){
            throw new RuntimeException("下标越界");
        }

        int[] newarr = new int[elements.length-1];

        for (int i = 0; i < elements.length-1; i++) {

            if(i < index){

                newarr[i] = elements[i];

            }else{

                newarr[i] = elements[i+1];
            }
        }
        //elments指向新数组
        elements = newarr;

    }
    //3.获取数组当前容量的方法
    public int size(){
        return elements.length;
    }
    //4.根据下标返回元素的方法
    public int get(int index){

        if(index < 0 || index >= elements.length){

            throw new RuntimeException("index不合法");
        }
        return elements[index];
    }
    //5.在数组任意位置插入元素的方法
    public void insert(int index ,int element){

        if(index < 0 || index > elements.length){

            throw new RuntimeException("index不合法");
        }
        //新建一个新数组容量加一

        int [] newarr = new int[elements.length+1];

        for (int i = 0; i < elements.length; i++) {

            //分两种情况，在末尾插入直接复制前边的元素，若在中间插入，插入位置之后的的元素后移
            if(index > i) {

                newarr[i] = elements[i];

            }else{

                newarr[i+1] = elements[i];
            }

        }

        //最后在index位置插入元素
        newarr[index] = element;
        //elments指向新数组
        elements = newarr;
    }
    //6.set方法改变数组中元素的值

    public void set(int index , int element){
        if(index < 0 || index > elements.length){

            throw new RuntimeException("index不合法");
        }

        elements[index] = element;
    }

    //7.遍历数组元素
    public void traverse(){

        for (int i = 0; i < elements.length; i++) {

            System.out.print(elements[i]+ " ");


        }


    }


}
