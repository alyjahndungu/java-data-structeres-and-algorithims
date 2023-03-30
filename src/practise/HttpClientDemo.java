package practise;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.stream.Collectors;

public class HttpClientDemo {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest getRequest = HttpRequest.newBuilder().uri(new URI("https://jsonmock.hackerrank.com/api/countries?name=kenya")).build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String>  response = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            String responseBody = response.body();
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                TopLevelData topLevelData = objectMapper.readValue(responseBody, TopLevelData.class);
                System.out.println(topLevelData);
            }catch (Exception e){
                e.printStackTrace();
            }
            // process the response body
//            System.out.println(responseBody);
        } else {
            System.out.println("Request failed with status code " + response.statusCode());
        }
    }
}

class TopLevelData {
    private int page;
    private int per_page;
    private int total;
    private int total_pages;
    private List<Nations> data;

    public TopLevelData() {
    }

    public TopLevelData(int page, int per_page, int total, int total_pages, List<Nations> data) {
        this.page = page;
        this.per_page = per_page;
        this.total = total;
        this.total_pages = total_pages;

        this.data = data;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public List<Nations> getData() {
        return data;
    }

    public void setData(List<Nations> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TopLevelData{" +
                "page=" + page +
                ", per_page=" + per_page +
                ", total=" + total +
                ", total_pages=" + total_pages +
                ", data=" + data +
                '}';
    }
}
class Translations{
    private String de;
    private String es;
    private String fr;
    private String it;
    private String ja;
    private String nl;
    private String hr;

    public Translations() {
    }

    public Translations(String de, String es, String fr, String it, String ja, String nl, String hr) {
        this.de = de;
        this.es = es;
        this.fr = fr;
        this.it = it;
        this.ja = ja;
        this.nl = nl;
        this.hr = hr;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getIt() {
        return it;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public String getJa() {
        return ja;
    }

    public void setJa(String ja) {
        this.ja = ja;
    }

    public String getNl() {
        return nl;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }
}