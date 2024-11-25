package com.contact.contact.services;

import com.contact.contact.models.Request;
import com.contact.contact.models.Response;
import com.contact.contact.models.User;

public interface UserService {

    Response saveUser(User user);

    Response signIn(Request request);

    Response userValidator(String code);

    Response getNewCode(String email);

    Response changePassword(String newPassword, String email);

    Response updateUserEmail(User user);

    Response deleteUser(int uid);

    Response updateUser(User user);
    
    User getUser(int user_id);

}