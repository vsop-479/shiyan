package shiyan.test.algorithm.quicksort;

/**
 * Created by Administrator on 2017/3/1.
 */
public class QuickSort {
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void quickSort(int[] a, int i, int j){
        if(i >= j){
            return;
        }
        int p = oneSort(a, i, j);
        quickSort(a, i, p - 1);
        quickSort(a, p + 1, j);
    }
    public static int oneSort(int[] a, int i, int j){
        int s = a[i];
        while(i != j){
            while(s <= a[j] && j > i){
                j--;
            }
            swap(a, i, j);
            while(s >= a[i] && i < j){
                i++;
            }
            swap(a, i, j);
        }
        return i;
    }

    public static void main(String[] args){
        int[] a = new int[]{9, 3, 2, 6, 2, 7, 3, 8, 9, 5, 12, 34, 11};
        quickSort(a, 0, a.length - 1);
        print(a);
    }

    public static void print(int[] array){
        StringBuilder stb = new StringBuilder();
        for(int a : array){
            stb.append(a + ", ");
        }
        String substring = stb.substring(0, stb.lastIndexOf(","));
        System.out.println(substring);
    }
}
