public class OrderAgnosticBS {
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 6, 8, 9, 10};
        int target = 10;

        int index = bS(arr, target);
        System.out.println("Index : " + index);

    }

    static int bS(int[] arr, int target){
        int start = 0, end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else{
                if(isAsc){
                    if(target > arr[mid]){
                        start = mid + 1;
                    }
                    else{
                        end = mid - 1;
                    }
                }
                else{
                    if(target > arr[mid]){
                        end = mid - 1;
                    }
                    else{
                        start = mid + 1;
                    }
                }
            }
        }
        return -1;
    }
}
