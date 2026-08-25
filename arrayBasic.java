package arraybasic;

import java.util.*;

public class arrayBasic {
    public static void copyArray(int arr[]) {
        int brr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }
        for (int j = 0; j < brr.length; j++) {
            System.out.print(brr[j]);
        }

    }

    public static void sumArray(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    public static void reverseArray(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);

        }
    }

    public static void countOccurrences(int arr[]) {
        int target = 3;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans++;

            }
        }
        System.out.println("total occurences of target" + " " + ans);

    }

    public static void targetIndex(int arr[]) {
        int target = 6;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("target found at index " + " " + i);
                return;
            }
        }
        System.out.println("not found");

    }

    public static void isShorted2(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("not shorted");
                return;
            }
        }
        System.out.println("it is shorted");

    }

    public static void isShortest(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    System.out.println("array is not shorted");
                    return;
                }
            }
        }

        System.out.println("it is sorted");
    }

    public static void secondMax(int arr[]) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i]; // isne gand mar li thi huaa h nahi tha mere se to
            } else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }
        System.out.println("second max =" + " " + second);

    }

    public static void minimumNumber(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);

        }
        System.out.println("your min element is " + " " + min);
    }

    public static void largestNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);

        }
        System.out.println("your max element is " + " " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("element to index " + " " + i);
            arr[i] = sc.nextInt();
        }
        // largestNumber(arr);
        // minimumNumber(arr);
        // secondMax(arr);
        // isShortest(arr);
        // isShorted2(arr);
        // targetIndex(arr);
        // countOccurrences(arr);
        // reverseArray(arr);
        // sumArray(arr);
        // copyArray(arr);
    }
}
