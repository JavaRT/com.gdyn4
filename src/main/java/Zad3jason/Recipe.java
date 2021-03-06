package Zad3jason;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString(of = {"id", "title"})
public class Recipe {
    @JsonProperty("id")
    public Integer id;
    @JsonProperty("title")
    public String title;
    @JsonProperty("image")
    public String image;
    @JsonProperty("imageType")
    public String imageType;
    @JsonProperty("usedIngredientCount")
    public Integer usedIngredientCount;
    @JsonProperty("missedIngredientCount")
    public Integer missedIngredientCount;
    @JsonProperty("missedIngredients")
    public List<Ingridients> missedIngredients = null;
    @JsonProperty("usedIngredients")
    public List<Ingridients> usedIngredients = null;
    @JsonProperty("unusedIngredients")
    public List<Ingridients> unusedIngredients = null;
    @JsonProperty("likes")
    public Integer likes;

}