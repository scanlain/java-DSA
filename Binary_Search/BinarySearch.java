public class BinarySearch{
    public static void main(String[] args){

        int[] arr = {1, 2, 6, 9, 19, 30, 99};
        int target = 90;

        int index = bS(arr, target);
        System.out.println("Index found : " + index);
    }

    static int bS(int[] arr, int target){
        int start = 0, end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}