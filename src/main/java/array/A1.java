package array;

import java.util.Arrays;

public class A1 {

    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[5];
          /*
                    arr2[0]=1;
                    arr2[1]=2;
                    arr2[2]=3;
                    elemanlari bu sekilde atar isem  arr2[3]=0 ve arr2[4]=0 oluyor
           */
        arr2 = arr1;
        // arr2[3]=4; burada bu hatayi aldim "Index 3 out of bounds for length 3"
        // Cünkü arr2 dizisini arr1 dizisine atadığınızda, arr2 artık arr1 ile aynı referansı paylaşır ve arr2 dizisi aslında arr1 dizisinin bellek adresini işaret eder.
        // Bu nedenle, arr1'deki değişiklikler arr2'yi de etkiler ve tersi.
        // ama yukaridaki gibi olunca arr2[] 3 elemanli sonuc veriyor
        arr1[0]=5; // dikkat edilirse arr1[] degistirdim ama arr2[] de degisti. Normalde bu satir soruda yoktu.
        System.out.println(Arrays.toString(arr2));
        for (int w : arr2) {
            System.out.print(w + " ");
        }

        int[] arr3 = new int[3];
        arr3 = arr2;
        for (int w : arr3) {
            System.out.print(w + " ");
        }
    }

        /*
                What is the result?
                A.1 2 3 0 0 1 2 3 0 0
                B.1 2 3 null null 1 2 3 null null
                C.An Exception is thrown at run time.
                D.1  2 3 1 2 3

                Cevap: D
                Cozum: arr2=arr1; komutu ile arr2, arr1'e esitlenir. print de 1 2 3 olur.
                arr3=arr2; komutu ile arr3 arr2'ye esitlenir. print de 1 2 3 olur.
         */
}
