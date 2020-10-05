package parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Base64;


public class Parser {
    private static String sourseUrl;
    private static String username = "livetv",
                    password = "eY88E7jc";
    private static String login = username + ":" + password;
    private static String base64login = new String(Base64.getUrlEncoder().encode(login.getBytes()));

    public static void main(String[] args) throws IOException {

        // 0.5 seconds
        Document doc = Jsoup
                .connect("http://www.vsetv.com/export/livetv/epg/export.xml")
                .header("Authorization", "Basic " + base64login)
                .get();

        Elements channels = doc.getElementsByTag("channel");

        for (int i = 0; i < channels.size(); i++) {
            Element channel = channels.get(i);

            String channelId = channel.id();
        }

//        String xml = doc.outerHtml();
//        System.out.println("Title: " + title);
    }
}
