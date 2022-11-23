import com.example.tipnit.model.parse.UserInfo;
import com.example.tipnit.model.serializable.SerializableUserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

public class LocationController{
    private UserInfoService userService;

    public LocationController(UserInfoService userService) {
        this.userInfoService = userService;
    }

    //get all
    @GetMapping("/") //sets the path to this method
    public ArrayList<results> getUsers() {
        ArrayList<results> userC = new ArrayList<>();

        //Convert the Parse Product object to a POJO Product object that can be serialized by Spring
        ArrayList<UserInfo> list = userService.retrieveUserInfo();
        for(UserInfo u : list)
        {
            UserInfo.add(u.getUserInfo());
        }
        return;
    }

    //get only one based on object id
    @GetMapping("/find/{id}")
    public SerializableUserInfo getUserInfoById(@PathVariable String id){
        return userInfoService.getUserInfoById(id).getSerializable();
    }
}
