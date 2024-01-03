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
"background",
"chat_handle"
})
@Generated("jsonschema2pojo")
public class ColorCodes {

@JsonProperty("background")
private String background;
@JsonProperty("chat_handle")
private String chatHandle;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("background")
public String getBackground() {
return background;
}

@JsonProperty("background")
public void setBackground(String background) {
this.background = background;
}

@JsonProperty("chat_handle")
public String getChatHandle() {
return chatHandle;
}

@JsonProperty("chat_handle")
public void setChatHandle(String chatHandle) {
this.chatHandle = chatHandle;
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