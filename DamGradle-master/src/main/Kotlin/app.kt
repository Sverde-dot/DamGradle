object ElTiempo {
    @kotlin.jvm.Throws(IOException::class)
    @kotlin.jvm.JvmStatic
    fun main(args: Array<String>) {
        val doc: org.jsoup.nodes.Document = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get()
        val elementoTemperatura: org.jsoup.select.Elements = doc.getElementsByClass("today_nowcard-temp")
        val temperatura: String = elementoTemperatura.text()
        val elementoTiempo: org.jsoup.select.Elements = doc.getElementsByClass("today_nowcard-phrase")
        val tiempo: String = elementoTiempo.text()
        println(temperatura + " " + tiempo + ". Datos extraídos de " + doc.title())
    }
}