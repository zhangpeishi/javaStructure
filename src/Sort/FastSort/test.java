package Sort.FastSort;

public class test {

    public static void main(String[] args) {

        int[] a = {5,3,7,8,4,0,9};

        fastsort fs = new fastsort(a);

        fs.fast(0,a.length);

    }

}
