package array;

public class A {

    public static void main(String[] args) {


        int nums1[]= {1,2,3};
        int nums2[]= {1,2,3,4,5};
        nums2=nums1;

        nums1[1]=5;

        for (int x: nums2){
            System.out.print(x+ ":");
        }

    }
        /*
                What is the result?
                A. 1:2:3:4:5:
                B. 1:2:3:
                C. Compilation fails.
                D. An ArrayOutOfBoundsException is thrown at runtime

                Cevap: B
                Cozum:   nums2=nums1 komutu ile num1 num 2 ye atanir. Boylece num2 nin ici degisir.
                for dongusu calisinca num2 yi num1 icindeki degerlerle yazdirir.
                Burada artik ayni referansa sahip olan 2 array var. Yani birinde yapilan degisiklik digerini de etkileyecektir
         */

        /*
                Eğer iki dizinin eleman sayısı eşit değilse, bu durumda dizileri doğrudan birbirine eşitlemek mümkün değildir.
                Farklı eleman sayılarına sahip dizileri birbirine eşitlemek istiyorsanız, önce eleman sayılarını eşitlemeniz gerekebilir.
         */

        /*
            Eğer nums2 dizisini nums1 dizisine atadıktan sonra elemanları yazdırırsanız, çıktının "1:2:3:" olduğunu söylüyorsanız,
            bu durumun sebebi şu:

            Bu kod parçasında nums2 dizisini nums1 dizisine atadığınızda, nums2 artık nums1 ile aynı referansı paylaşıyor.
            Yani aslında nums2 ve nums1 aynı diziyi işaret ediyorlar. Dolayısıyla herhangi bir değişiklik, bir dizide yapıldığında diğeri de aynı değişikliği yansıtacaktır.

            Bu nedenle, nums2'yi nums1'e atadığınızda, nums2'deki değişiklikler nums1'i de etkiler. Bu durumda nums2 dizisini yazdırdığınızda aynı çıktıyı alırsınız.
         */

}
