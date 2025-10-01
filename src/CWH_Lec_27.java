public class CWH_Lec_27 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8,9};
//        String[] arr2 = {"Luff" , "Brook", "Sanja" ,"Zero"};
//        float [] arr3 = {20.5f, 30.5f,19.6f, 34.98f};


        System.out.println("The length of array : " + arr1.length);

        System.out.println("The element of array " + arr1[arr1.length-1]);

        System.out.println("Printing array with for loop ");

        for(int i = 0 ; i<arr1.length;i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.println(" ");
        System.out.println("Printing array with for_each_sloop ");

        for (int j : arr1) {
            System.out.print(j + " ");
        }

    }
}
