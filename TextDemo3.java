public class TextDemo3 {
    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
//

    //实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值
//    public static void printArr(int[] arr){
//        for(int x: arr){
//            System.out.print(x + " ");
//        }
//    }
//    public static void main(String[] args){
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        printArr(arr);
//    }

    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
//    public static void transform(int[] arr){
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = arr[i] * 2;
//        }
//    }
//    public static void main(String[] args){
//        int[] arr = new int[]{1, 4, 3, 6};
//        transform(arr);
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//    }

    //实现一个方法 sum, 以数组为参数, 求数组所有元素之和
//    public static int sum(int[] arr){
//        int sum = 0;
//        for(int i = 0; i < arr.length; i++){
//            sum += arr[i];
//        }
//        return sum;
//    }
//    public static void main(String[] args){
//        int[] arr = new int[]{2, 4, 6, 2, 3, 9};
//        System.out.println(sum(arr));
//    }


//实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
//    public static double avg(int[] arr){
//        double sum = 0.0;
//        int len = arr.length;
//        for(int i = 0; i < len;i++){
//            sum += arr[i];
//        }
//        return sum / len;
//    }
//    public static void main(String[] args){
//        int[] arr = {1, 3, 5, 3, 2, 6};
//        System.out.println(avg(arr));
//    }
}
