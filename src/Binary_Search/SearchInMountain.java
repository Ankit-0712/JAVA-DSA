package Binary_Search;

public class SearchInMountain {
    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int result = search(arr, target);
        System.out.println("Element " + target + " found at index: " + result);
    }

    static int search(int[] arr, int target) {
        int peak = peakOfArray(arr);
        int firstTry = orderAgnosticBs(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBs(arr, target, peak + 1, arr.length - 1);
    }

    static int peakOfArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {  // Fixed the condition
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBs(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
