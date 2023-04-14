package listing.main.qwerty.src.block5;

class BubbleSort {
    static void sort(int nums[]) {
        int t;
        for (int a=1; a<nums.length; a++) {
            for (int b = nums.length - 1; b>=a; b--) {
                if (nums[b-1] > nums[b]){
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }
    }
}
public class BubbleSortDemo {
    public static void  main (String[] args) {
        int nums[] = {99, -10, 23, 123972, 14, -745, 69, 35, -9};
        System.out.println("Исходный порядок массива:");
        for (int i = 0; i <nums.length; i++)
        System.out.println(nums[i] + "");

        System.out.println();
        BubbleSort.sort(nums);

        System.out.println("Новый порядок:");
        for (int i = 0; i <nums.length; i++)
            System.out.println(nums[i] + "");

        System.out.println();
    }

}