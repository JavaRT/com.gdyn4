package Zad1jason;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import zad1structure.Osoba;

import java.io.File;
import java.io.IOException;

public class AppMain {
    public static void main(String[] args) {
        Osoba pawel = new Osoba("pawel", "sgfsfg", 12);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String result = objectMapper.writeValueAsString(pawel);
            System.out.println(result);
            objectMapper.writeValue(new File("person.json"), pawel);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
