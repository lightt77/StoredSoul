package com.storedsoul.dao;

import com.storedsoul.dao.mappers.UserMapper;
import com.storedsoul.models.User;
import com.storedsoul.utilities.Constants;
import com.storedsoul.utilities.StoredProcedures;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Logger;

@Repository
public class UserDao extends DAO<User>
{
    private final static Logger LOG = Logger.getLogger(UserDao.class.getName());

    public CompletableFuture<List<User>> findAllAsync()
    {
        return CompletableFuture.supplyAsync(() ->
            mapToUserList(executeStoredProc(StoredProcedures.GET_ALL_USERS.getValue(), new HashMap<>(), new UserMapper())));
    }

    public void add(User user)
    {
        executeStoredProc(StoredProcedures.ADD_USER.getValue(), new HashMap<String, Object>()
        {
            {
                put("email_id", user.getEmailId());
                put("password", user.getPassword());
                put("image_path", user.getImagePath());
            }
        }, new UserMapper());
    }

    private List<User> mapToUserList(Map<String, Object> resultSetMap)
    {
        List<User> result = new ArrayList<>();
        result.addAll(resultSetMap.get(Constants.DEFAULT_RESULT_SET_KEY_FOR_STORED_PROCS) != null ?
                (List<User>) resultSetMap.get(Constants.DEFAULT_RESULT_SET_KEY_FOR_STORED_PROCS) : new ArrayList<>());
        return result;
    }
}
