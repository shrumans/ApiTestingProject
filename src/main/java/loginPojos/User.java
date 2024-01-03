package loginPojos;

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
"id",
"first_name",
"last_name",
"email",
"nda_signed",
"source",
"phone_number",
"signup_stage",
"utm_source",
"utm_campaign",
"utm_medium",
"pm_dashboard_token",
"user_type",
"origin",
"address_disabled",
"organisation",
"billing_entity",
"bant_answers",
"spec_call_nda_signed",
"enterprise_lead",
"profile_image",
"referral_code",
"price_multiplier",
"enable_referral_code",
"region",
"sub_region",
"message_preferences",
"user_profiles",
"authtoken",
"currency",
"roles",
"running_project_count",
"external_billing_accounts",
"vip",
"setting",
"company_id"
})
@Generated("jsonschema2pojo")
public class User {

@JsonProperty("id")
private Integer id;
@JsonProperty("first_name")
private String firstName;
@JsonProperty("last_name")
private String lastName;
@JsonProperty("email")
private String email;
@JsonProperty("nda_signed")
private Boolean ndaSigned;
@JsonProperty("source")
private String source;
@JsonProperty("phone_number")
private String phoneNumber;
@JsonProperty("signup_stage")
private Object signupStage;
@JsonProperty("utm_source")
private Object utmSource;
@JsonProperty("utm_campaign")
private Object utmCampaign;
@JsonProperty("utm_medium")
private Object utmMedium;
@JsonProperty("pm_dashboard_token")
private Object pmDashboardToken;
@JsonProperty("user_type")
private String userType;
@JsonProperty("origin")
private String origin;
@JsonProperty("address_disabled")
private Boolean addressDisabled;
@JsonProperty("organisation")
private Object organisation;
@JsonProperty("billing_entity")
private Object billingEntity;
@JsonProperty("bant_answers")
private Object bantAnswers;
@JsonProperty("spec_call_nda_signed")
private Object specCallNdaSigned;
@JsonProperty("enterprise_lead")
private Object enterpriseLead;
@JsonProperty("profile_image")
private Object profileImage;
@JsonProperty("referral_code")
private String referralCode;
@JsonProperty("price_multiplier")
private Double priceMultiplier;
@JsonProperty("enable_referral_code")
private Boolean enableReferralCode;
@JsonProperty("region")
private Object region;
@JsonProperty("sub_region")
private Object subRegion;
@JsonProperty("message_preferences")
private Object messagePreferences;
@JsonProperty("user_profiles")
private List<Object> userProfiles;
@JsonProperty("authtoken")
private String authtoken;
@JsonProperty("currency")
private Currency currency;
@JsonProperty("roles")
private String roles;
@JsonProperty("running_project_count")
private Integer runningProjectCount;
@JsonProperty("external_billing_accounts")
private ExternalBillingAccounts externalBillingAccounts;
@JsonProperty("vip")
private Boolean vip;
@JsonProperty("setting")
private Setting setting;
@JsonProperty("company_id")
private Object companyId;
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

@JsonProperty("first_name")
public String getFirstName() {
return firstName;
}

@JsonProperty("first_name")
public void setFirstName(String firstName) {
this.firstName = firstName;
}

@JsonProperty("last_name")
public String getLastName() {
return lastName;
}

@JsonProperty("last_name")
public void setLastName(String lastName) {
this.lastName = lastName;
}

@JsonProperty("email")
public String getEmail() {
return email;
}

@JsonProperty("email")
public void setEmail(String email) {
this.email = email;
}

@JsonProperty("nda_signed")
public Boolean getNdaSigned() {
return ndaSigned;
}

@JsonProperty("nda_signed")
public void setNdaSigned(Boolean ndaSigned) {
this.ndaSigned = ndaSigned;
}

@JsonProperty("source")
public String getSource() {
return source;
}

@JsonProperty("source")
public void setSource(String source) {
this.source = source;
}

@JsonProperty("phone_number")
public String getPhoneNumber() {
return phoneNumber;
}

@JsonProperty("phone_number")
public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
}

@JsonProperty("signup_stage")
public Object getSignupStage() {
return signupStage;
}

@JsonProperty("signup_stage")
public void setSignupStage(Object signupStage) {
this.signupStage = signupStage;
}

@JsonProperty("utm_source")
public Object getUtmSource() {
return utmSource;
}

@JsonProperty("utm_source")
public void setUtmSource(Object utmSource) {
this.utmSource = utmSource;
}

@JsonProperty("utm_campaign")
public Object getUtmCampaign() {
return utmCampaign;
}

@JsonProperty("utm_campaign")
public void setUtmCampaign(Object utmCampaign) {
this.utmCampaign = utmCampaign;
}

@JsonProperty("utm_medium")
public Object getUtmMedium() {
return utmMedium;
}

@JsonProperty("utm_medium")
public void setUtmMedium(Object utmMedium) {
this.utmMedium = utmMedium;
}

@JsonProperty("pm_dashboard_token")
public Object getPmDashboardToken() {
return pmDashboardToken;
}

@JsonProperty("pm_dashboard_token")
public void setPmDashboardToken(Object pmDashboardToken) {
this.pmDashboardToken = pmDashboardToken;
}

@JsonProperty("user_type")
public String getUserType() {
return userType;
}

@JsonProperty("user_type")
public void setUserType(String userType) {
this.userType = userType;
}

@JsonProperty("origin")
public String getOrigin() {
return origin;
}

@JsonProperty("origin")
public void setOrigin(String origin) {
this.origin = origin;
}

@JsonProperty("address_disabled")
public Boolean getAddressDisabled() {
return addressDisabled;
}

@JsonProperty("address_disabled")
public void setAddressDisabled(Boolean addressDisabled) {
this.addressDisabled = addressDisabled;
}

@JsonProperty("organisation")
public Object getOrganisation() {
return organisation;
}

@JsonProperty("organisation")
public void setOrganisation(Object organisation) {
this.organisation = organisation;
}

@JsonProperty("billing_entity")
public Object getBillingEntity() {
return billingEntity;
}

@JsonProperty("billing_entity")
public void setBillingEntity(Object billingEntity) {
this.billingEntity = billingEntity;
}

@JsonProperty("bant_answers")
public Object getBantAnswers() {
return bantAnswers;
}

@JsonProperty("bant_answers")
public void setBantAnswers(Object bantAnswers) {
this.bantAnswers = bantAnswers;
}

@JsonProperty("spec_call_nda_signed")
public Object getSpecCallNdaSigned() {
return specCallNdaSigned;
}

@JsonProperty("spec_call_nda_signed")
public void setSpecCallNdaSigned(Object specCallNdaSigned) {
this.specCallNdaSigned = specCallNdaSigned;
}

@JsonProperty("enterprise_lead")
public Object getEnterpriseLead() {
return enterpriseLead;
}

@JsonProperty("enterprise_lead")
public void setEnterpriseLead(Object enterpriseLead) {
this.enterpriseLead = enterpriseLead;
}

@JsonProperty("profile_image")
public Object getProfileImage() {
return profileImage;
}

@JsonProperty("profile_image")
public void setProfileImage(Object profileImage) {
this.profileImage = profileImage;
}

@JsonProperty("referral_code")
public String getReferralCode() {
return referralCode;
}

@JsonProperty("referral_code")
public void setReferralCode(String referralCode) {
this.referralCode = referralCode;
}

@JsonProperty("price_multiplier")
public Double getPriceMultiplier() {
return priceMultiplier;
}

@JsonProperty("price_multiplier")
public void setPriceMultiplier(Double priceMultiplier) {
this.priceMultiplier = priceMultiplier;
}

@JsonProperty("enable_referral_code")
public Boolean getEnableReferralCode() {
return enableReferralCode;
}

@JsonProperty("enable_referral_code")
public void setEnableReferralCode(Boolean enableReferralCode) {
this.enableReferralCode = enableReferralCode;
}

@JsonProperty("region")
public Object getRegion() {
return region;
}

@JsonProperty("region")
public void setRegion(Object region) {
this.region = region;
}

@JsonProperty("sub_region")
public Object getSubRegion() {
return subRegion;
}

@JsonProperty("sub_region")
public void setSubRegion(Object subRegion) {
this.subRegion = subRegion;
}

@JsonProperty("message_preferences")
public Object getMessagePreferences() {
return messagePreferences;
}

@JsonProperty("message_preferences")
public void setMessagePreferences(Object messagePreferences) {
this.messagePreferences = messagePreferences;
}

@JsonProperty("user_profiles")
public List<Object> getUserProfiles() {
return userProfiles;
}

@JsonProperty("user_profiles")
public void setUserProfiles(List<Object> userProfiles) {
this.userProfiles = userProfiles;
}

@JsonProperty("authtoken")
public String getAuthtoken() {
return authtoken;
}

@JsonProperty("authtoken")
public void setAuthtoken(String authtoken) {
this.authtoken = authtoken;
}

@JsonProperty("currency")
public Currency getCurrency() {
return currency;
}

@JsonProperty("currency")
public void setCurrency(Currency currency) {
this.currency = currency;
}

@JsonProperty("roles")
public String getRoles() {
return roles;
}

@JsonProperty("roles")
public void setRoles(String roles) {
this.roles = roles;
}

@JsonProperty("running_project_count")
public Integer getRunningProjectCount() {
return runningProjectCount;
}

@JsonProperty("running_project_count")
public void setRunningProjectCount(Integer runningProjectCount) {
this.runningProjectCount = runningProjectCount;
}

@JsonProperty("external_billing_accounts")
public ExternalBillingAccounts getExternalBillingAccounts() {
return externalBillingAccounts;
}

@JsonProperty("external_billing_accounts")
public void setExternalBillingAccounts(ExternalBillingAccounts externalBillingAccounts) {
this.externalBillingAccounts = externalBillingAccounts;
}

@JsonProperty("vip")
public Boolean getVip() {
return vip;
}

@JsonProperty("vip")
public void setVip(Boolean vip) {
this.vip = vip;
}

@JsonProperty("setting")
public Setting getSetting() {
return setting;
}

@JsonProperty("setting")
public void setSetting(Setting setting) {
this.setting = setting;
}

@JsonProperty("company_id")
public Object getCompanyId() {
return companyId;
}

@JsonProperty("company_id")
public void setCompanyId(Object companyId) {
this.companyId = companyId;
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
