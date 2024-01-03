package registerRequestPojos;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class RegisterapiRequestPayload {

@SerializedName("user")
@Expose
private User user;

public User getUser() {
return user;
}

public void setUser(User user) {
this.user = user;
}

}
