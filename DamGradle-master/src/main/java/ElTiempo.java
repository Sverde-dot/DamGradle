import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;
import java.sql.SQLOutput;

public class ElTiempo {

public static void main(String[] args) throws IOException {

    Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get();
    Elements elementoTemperatura = doc.getElementsByClass("today_nowcard-temp");
    String temperatura = elementoTemperatura.text();
    Elements elementoTiempo = doc.getElementsByClass("today_nowcard-phrase");
    String tiempo = elementoTiempo.text();
    System.out.println(temperatura+" "+tiempo+". Datos extraídos de "+doc.title());

}

}
