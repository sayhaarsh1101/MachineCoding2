package Service;

import java.util.ArrayList;
import java.util.List;

import models.UserDo;
import models.UserEntity;

public class UserService {

    public static List<UserEntity> userDetails = new ArrayList<>();

    public UserDo addUser(UserDo userDo) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(userDo.getUserId());
        userEntity.setFirstName(userDo.getFirstName());
        userEntity.setEmail(userDo.gettEmail());
        userDetails.add(userEntity);
        return userDo;
    }

    public UserDo getUserDetails(String userId){
        UserDo userDo = new UserDo();
        for(UserEntity userEntity : userDetails){
            if(userEntity.getUserId() == userId){
                userDo = mapUserDetailToUserDo(userEntity);
            }
        }
        return userDo;
    }

    public UserDo mapUserDetailToUserDo(UserEntity userEntity){
        UserDo userDo = new UserDo();
        userDo.setUserId(userEntity.getUserId());
        userDo.setFirstName(userEntity.getFirstName());
        userDo.setEmail(userEntity.gettEmail());

        return userDo;
    }
    
}
