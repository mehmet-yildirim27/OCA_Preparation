import java.time.LocalDateTime;
import java.time.ZoneId;

public class Soru5 {
    public static void main(String[] args) {
        ZoneId zone1= ZoneId.of("Europe/Berlin");
        ZoneId zone2= ZoneId.of("Europe/Dublin");
        ZoneId zone3 = ZoneId.of("Asia/Tokyo");

//        ----- now1= -----.now(zone1);
//        ----- now2= -----.now(zone2);
//        ----- now3= -----.now(zone3);

        LocalDateTime now1= LocalDateTime.now(zone1);
        LocalDateTime now2= LocalDateTime.now(zone2);
        LocalDateTime now3= LocalDateTime.now(zone3);

        System.out.println("Berlin Time: "+ now1);
        System.out.println("Dublin Time: "+ now2);
        System.out.println("Tokyo Time: "+ now3);
    }
}
        /*
                What class, interested in the above empty spaces, will return the current local time for Berlin and Dublin?
                a)DateTime
                b)LocalDateTime
                c)LocalTime
                d)DateTimes
                e)LocalDate

                Cozum
                LocalDateTime dir. Hem tarih hem de saati verir.
                DateTime diye bir class yoktur.
                DateTimes diye de bir class yoktur.
                LocalTime saat verir.
                LocalDate ise tarihi verir.
         */