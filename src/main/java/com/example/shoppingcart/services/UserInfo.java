package com.example.shoppingcart.services;
import com.example.shoppingcart.model.parse.UserInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.parse4j.ParseQuery;
import org.parse4j.ParseException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserInfoService {
    protected final Log logger = LogFactory.getLog(this.getClass());

    public ArrayList<UserInfo> retrieveUserInfo()
    {
        final ArrayList<UserInfo> userInfo = new ArrayList<>();

        ParseQuery<UserInfo> query = ParseQuery.getQuery(UserInfo.class);
        try {
            List<UserInfo> list = query.find();
            for (UserInfo u : list) {
                userInfo.add(u);
            }

        }
        catch(Exception e)
        {
            logger.error("Error occurred", e);
        }

        return userInfo;
    }
}