package Zad3jason;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class Ingridients{

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("amount")
    public Float amount;
    @JsonProperty("unit")
    public String unit;
    @JsonProperty("unitLong")
    public String unitLong;
    @JsonProperty("unitShort")
    public String unitShort;
    @JsonProperty("aisle")
    public String aisle;
    @JsonProperty("name")
    public String name;
    @JsonProperty("extendedName")
    public String extendedName;
    @JsonProperty("original")
    public String original;
    @JsonProperty("originalString")
    public String originalString;
    @JsonProperty("originalName")
    public String originalName;
    @JsonProperty("metaInformation")
    public List<String> metaInformation = null;
    @JsonProperty("meta")
    public List<String> meta = null;
    @JsonProperty("image")
    public String image;

}