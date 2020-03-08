package json.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    private final static HttpClient HTTP_CLIENT =
            HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .build();

    public static void main(String[] args) {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://api.nbp.pl/api/cenyzlota/last/100/?format=json"))
                .build();
        try {
            HttpResponse<String> resp = HTTP_CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = resp.body(); // w formacie json
            ObjectMapper mapper = new ObjectMapper();
            List<CenyZlota> notowana = mapper.readValue(
                    responseBody,
                    new TypeReference<List<CenyZlota>>() {
                    }
            );
            notowana.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}