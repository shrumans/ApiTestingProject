package dashboardPojos;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"freemium_build_card",
"build_card_count"
})
@Generated("jsonschema2pojo")
public class DashboardApiResponsePojo {

@JsonProperty("freemium_build_card")
private List<Object> freemiumBuildCard;
@JsonProperty("build_card_count")
private BuildCardCount buildCardCount;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("freemium_build_card")
public List<Object> getFreemiumBuildCard() {
return freemiumBuildCard;
}

@JsonProperty("freemium_build_card")
public void setFreemiumBuildCard(List<Object> freemiumBuildCard) {
this.freemiumBuildCard = freemiumBuildCard;
}

@JsonProperty("build_card_count")
public BuildCardCount getBuildCardCount() {
return buildCardCount;
}

@JsonProperty("build_card_count")
public void setBuildCardCount(BuildCardCount buildCardCount) {
this.buildCardCount = buildCardCount;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}