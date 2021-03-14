package com.springbank.user.query.api.service;

import com.springbank.user.query.api.dto.UserLookupResponse;
import com.springbank.user.query.api.exception.ProcessingUserException;
import com.springbank.user.query.api.queries.FindAllUsersQuery;
import com.springbank.user.query.api.queries.FindUserByIdQuery;
import com.springbank.user.query.api.queries.SearchUsersQuery;

public interface UserService {

    UserLookupResponse getAllUsers() throws Exception;
    UserLookupResponse getUserById(String id) throws Exception;
    UserLookupResponse searchUserByFilter(String filter) throws Exception;



}
