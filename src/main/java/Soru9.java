import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Soru9 {

    public static void main(String[] args) {

        String date= LocalDate
                .parse("2014-05-04")
                .format(DateTimeFormatter.ISO_DATE);

//                ISO_DATE, ISO 8601 standardına uygun bir tarih biçimidir.
//                ISO 8601, tarih ve saat değerlerini temsil etmek için bir uluslararası standarttır.
//                Bu standart, yıl, ay, gün, saat, dakika ve saniye gibi bileşenleri içeren bir tarih ve saat formatı sunar.
//                Bu format sayesinde tarihler dünya genelinde anlaşılabilir ve karşılaştırılabilir hale gelir.
//                DateTimeFormatter.ISO_DATE, tarihi "yyyy-MM-dd" biçiminde temsil eder:

        System.out.println(date);
    }
    /*
            What is the result?
            A. May 04,2014T00:00:00:000
            B. 2014-05-04T00:00:00:000
            C. 5/4/14T00:00:00:000
            D.An exception is thrown at runtime.

            Cozum
            Cevap 2014-05-04T00:00:00:000 dir.

     */
}
