public class Soru2 {
    public static void main(String[] args) {

        int ans;

        try {
            int num=10;
            int div=0;
            ans= num/div; // Burada hata olunca alttaki satir calismadi ve ilk catch blogundaki kodlar calismaya basladi
            System.out.println("Answer "+ ans);
        }catch (ArithmeticException ae){
            ans=0;
            System.out.println("Answer "+ ans);
        }catch (Exception e){
            System.out.println("Invalid calculation");
        }
        // System.out.println("Answer "+ ans);

        int c;
        do {
            c=1;
        }while (c!=0);
    }
}
