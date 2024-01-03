package dashboardPojos;

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
"project_completed",
"completed",
"incomplete",
"running",
"invited",
"archived",
"prototype",
"custom_prototype",
"tailor_made_prototype",
"freemium"
})
@Generated("jsonschema2pojo")
public class BuildCardCount {

@JsonProperty("project_completed")
private Integer projectCompleted;
@JsonProperty("completed")
private Integer completed;
@JsonProperty("incomplete")
private Integer incomplete;
@JsonProperty("running")
private Integer running;
@JsonProperty("invited")
private Integer invited;
@JsonProperty("archived")
private Integer archived;
@JsonProperty("prototype")
private Integer prototype;
@JsonProperty("custom_prototype")
private Integer customPrototype;
@JsonProperty("tailor_made_prototype")
private Integer tailorMadePrototype;
@JsonProperty("freemium")
private Integer freemium;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("project_completed")
public Integer getProjectCompleted() {
return projectCompleted;
}

@JsonProperty("project_completed")
public void setProjectCompleted(Integer projectCompleted) {
this.projectCompleted = projectCompleted;
}

@JsonProperty("completed")
public Integer getCompleted() {
return completed;
}

@JsonProperty("completed")
public void setCompleted(Integer completed) {
this.completed = completed;
}

@JsonProperty("incomplete")
public Integer getIncomplete() {
return incomplete;
}

@JsonProperty("incomplete")
public void setIncomplete(Integer incomplete) {
this.incomplete = incomplete;
}

@JsonProperty("running")
public Integer getRunning() {
return running;
}

@JsonProperty("running")
public void setRunning(Integer running) {
this.running = running;
}

@JsonProperty("invited")
public Integer getInvited() {
return invited;
}

@JsonProperty("invited")
public void setInvited(Integer invited) {
this.invited = invited;
}

@JsonProperty("archived")
public Integer getArchived() {
return archived;
}

@JsonProperty("archived")
public void setArchived(Integer archived) {
this.archived = archived;
}

@JsonProperty("prototype")
public Integer getPrototype() {
return prototype;
}

@JsonProperty("prototype")
public void setPrototype(Integer prototype) {
this.prototype = prototype;
}

@JsonProperty("custom_prototype")
public Integer getCustomPrototype() {
return customPrototype;
}

@JsonProperty("custom_prototype")
public void setCustomPrototype(Integer customPrototype) {
this.customPrototype = customPrototype;
}

@JsonProperty("tailor_made_prototype")
public Integer getTailorMadePrototype() {
return tailorMadePrototype;
}

@JsonProperty("tailor_made_prototype")
public void setTailorMadePrototype(Integer tailorMadePrototype) {
this.tailorMadePrototype = tailorMadePrototype;
}

@JsonProperty("freemium")
public Integer getFreemium() {
return freemium;
}

@JsonProperty("freemium")
public void setFreemium(Integer freemium) {
this.freemium = freemium;
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