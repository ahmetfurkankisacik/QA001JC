package day25_collections.ornek;

public class InternetTarayicisi {
    String webSitesi;
    String url;

    @Override
    public String toString() {
        return "InternetTarayicisi{" +
                "webSitesi='" + webSitesi + '\'' +
                ", url='" + url + '\'' +
                '}';
    }


    public InternetTarayicisi(String webSitesi, String url) {
        this.webSitesi = webSitesi;
        this.url = url;
    }
}
