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
"id",
"name",
"code",
"exchange_rate",
"multiplier",
"symbol",
"country_code",
"default_store_promo_code",
"specing_price",
"icon_image_file_url",
"instant_spec_price",
"tax",
"custom_prototype_price",
"post_upfront_price",
"tax_type"
})
@Generated("jsonschema2pojo")
public class Attributes {

@JsonProperty("id")
private Integer id;
@JsonProperty("name")
private String name;
@JsonProperty("code")
private String code;
@JsonProperty("exchange_rate")
private Double exchangeRate;
@JsonProperty("multiplier")
private Double multiplier;
@JsonProperty("symbol")
private String symbol;
@JsonProperty("country_code")
private String countryCode;
@JsonProperty("default_store_promo_code")
private String defaultStorePromoCode;
@JsonProperty("specing_price")
private Double specingPrice;
@JsonProperty("icon_image_file_url")
private String iconImageFileUrl;
@JsonProperty("instant_spec_price")
private Double instantSpecPrice;
@JsonProperty("tax")
private Integer tax;
@JsonProperty("custom_prototype_price")
private Double customPrototypePrice;
@JsonProperty("post_upfront_price")
private Double postUpfrontPrice;
@JsonProperty("tax_type")
private String taxType;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("code")
public String getCode() {
return code;
}

@JsonProperty("code")
public void setCode(String code) {
this.code = code;
}

@JsonProperty("exchange_rate")
public Double getExchangeRate() {
return exchangeRate;
}

@JsonProperty("exchange_rate")
public void setExchangeRate(Double exchangeRate) {
this.exchangeRate = exchangeRate;
}

@JsonProperty("multiplier")
public Double getMultiplier() {
return multiplier;
}

@JsonProperty("multiplier")
public void setMultiplier(Double multiplier) {
this.multiplier = multiplier;
}

@JsonProperty("symbol")
public String getSymbol() {
return symbol;
}

@JsonProperty("symbol")
public void setSymbol(String symbol) {
this.symbol = symbol;
}

@JsonProperty("country_code")
public String getCountryCode() {
return countryCode;
}

@JsonProperty("country_code")
public void setCountryCode(String countryCode) {
this.countryCode = countryCode;
}

@JsonProperty("default_store_promo_code")
public String getDefaultStorePromoCode() {
return defaultStorePromoCode;
}

@JsonProperty("default_store_promo_code")
public void setDefaultStorePromoCode(String defaultStorePromoCode) {
this.defaultStorePromoCode = defaultStorePromoCode;
}

@JsonProperty("specing_price")
public Double getSpecingPrice() {
return specingPrice;
}

@JsonProperty("specing_price")
public void setSpecingPrice(Double specingPrice) {
this.specingPrice = specingPrice;
}

@JsonProperty("icon_image_file_url")
public String getIconImageFileUrl() {
return iconImageFileUrl;
}

@JsonProperty("icon_image_file_url")
public void setIconImageFileUrl(String iconImageFileUrl) {
this.iconImageFileUrl = iconImageFileUrl;
}

@JsonProperty("instant_spec_price")
public Double getInstantSpecPrice() {
return instantSpecPrice;
}

@JsonProperty("instant_spec_price")
public void setInstantSpecPrice(Double instantSpecPrice) {
this.instantSpecPrice = instantSpecPrice;
}

@JsonProperty("tax")
public Integer getTax() {
return tax;
}

@JsonProperty("tax")
public void setTax(Integer tax) {
this.tax = tax;
}

@JsonProperty("custom_prototype_price")
public Double getCustomPrototypePrice() {
return customPrototypePrice;
}

@JsonProperty("custom_prototype_price")
public void setCustomPrototypePrice(Double customPrototypePrice) {
this.customPrototypePrice = customPrototypePrice;
}

@JsonProperty("post_upfront_price")
public Double getPostUpfrontPrice() {
return postUpfrontPrice;
}

@JsonProperty("post_upfront_price")
public void setPostUpfrontPrice(Double postUpfrontPrice) {
this.postUpfrontPrice = postUpfrontPrice;
}

@JsonProperty("tax_type")
public String getTaxType() {
return taxType;
}

@JsonProperty("tax_type")
public void setTaxType(String taxType) {
this.taxType = taxType;
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
