package lr8.task3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class NewsParserEdit {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
            Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > tr > td:nth-child(1)");
            BufferedWriter writer = new BufferedWriter(new FileWriter("news.txt"));
            for (int i = 3; i < 20; i += 2) {
                List<Node> nodes = newsParent.get(0).childNodes();
                String theme = ((Element) nodes.get(i)).getElementsByClass("blocktitle").get(0).childNodes().get(0).toString();
                String date = ((Element) nodes.get(i)).getElementsByClass("blockdate").get(0).childNodes().get(0).toString();
                System.out.println("Тема: " + theme);
                System.out.println("Дата: " + date + "\n");
                writer.write("Тема: " + theme + "\n");
                writer.write("Дата: " + date + "\n\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при получении HTML-кода страницы: " + e.getMessage());
            System.out.println("Попытка переподключения...");
            try {
                Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
                Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > tr > td:nth-child(1)");
                BufferedWriter writer = new BufferedWriter(new FileWriter("news.txt"));
                for (int i = 3; i < 20; i += 2) {
                    List<Node> nodes = newsParent.get(0).childNodes();
                    String theme = ((Element) nodes.get(i)).getElementsByClass("blocktitle").get(0).childNodes().get(0).toString();
                    String date = ((Element) nodes.get(i)).getElementsByClass("blockdate").get(0).childNodes().get(0).toString();
                    System.out.println("Тема: " + theme);
                    System.out.println("Дата: " + date + "\n");
                    writer.write("Тема: " + theme + "\n");
                    writer.write("Дата: " + date + "\n\n");
                }
                writer.close();
            } catch (IOException e1) {
                System.out.println("Ошибка при повторном подключении к сайту: " + e1.getMessage());
                e1.printStackTrace();
            }
        }
    }
}
