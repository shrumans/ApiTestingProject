package registerRequestPojos;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class User {

@SerializedName("first_name")
@Expose
private String firstName;
@SerializedName("last_name")
@Expose
private String lastName;
@SerializedName("email")
@Expose
private String email;
@SerializedName("password")
@Expose
private String password;
@SerializedName("phone_number")
@Expose
private String phoneNumber;
@SerializedName("user_type")
@Expose
private String userType;
@SerializedName("currency_id")
@Expose
private Integer currencyId;

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getPassword() {
return password;
}

public void setPassword(String password) {
this.password = password;
}

public String getPhoneNumber() {
return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
}

public String getUserType() {
return userType;
}

public void setUserType(String userType) {
this.userType = userType;
}

public Integer getCurrencyId() {
return currencyId;
}

public void setCurrencyId(Integer currencyId) {
this.currencyId = currencyId;
}

}