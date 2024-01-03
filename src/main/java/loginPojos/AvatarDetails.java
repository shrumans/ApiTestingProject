package loginPojos;

import java.util.LinkedHashMap;
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
"color_codes",
"initials"
})
@Generated("jsonschema2pojo")
public class AvatarDetails {

@JsonProperty("color_codes")
private ColorCodes colorCodes;
@JsonProperty("initials")
private String initials;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("color_codes")
public ColorCodes getColorCodes() {
return colorCodes;
}

@JsonProperty("color_codes")
public void setColorCodes(ColorCodes colorCodes) {
this.colorCodes = colorCodes;
}

@JsonProperty("initials")
public String getInitials() {
return initials;
}

@JsonProperty("initials")
public void setInitials(String initials) {
this.initials = initials;
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