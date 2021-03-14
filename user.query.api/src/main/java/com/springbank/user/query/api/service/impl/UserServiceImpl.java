package com.springbank.user.query.api.service.impl;

import com.springbank.user.query.api.dto.UserLookupResponse;
import com.springbank.user.query.api.exception.ProcessingUserException;
import com.springbank.user.query.api.handlers.UserQueryHandler;
import com.springbank.user.query.api.queries.FindAllUsersQuery;
import com.springbank.user.query.api.queries.FindUserByIdQuery;
import com.springbank.user.query.api.queries.SearchUsersQuery;
import com.springbank.user.query.api.service.UserService;
import lombok.RequiredArgsConstructor;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final QueryGateway queryGateway;

    @Override
    public UserLookupResponse getAllUsers() throws Exception {
        try{
            return queryGateway.query(new FindAllUsersQuery(),
                    ResponseTypes.instanceOf(UserLookupResponse.class))
                     .join();
        }catch(Throwable ex){
            throw new ProcessingUserException(ex.getMessage());
        }
    }

    @Override
    public UserLookupResponse getUserById(String id) throws Exception {
        try{
            return queryGateway.query(new FindUserByIdQuery(id),
                    ResponseTypes.instanceOf(UserLookupResponse.class))
                    .join();
        }catch(Throwable ex){
            throw new ProcessingUserException(ex.getMessage());
        }
    }

    @Override
    public UserLookupResponse searchUserByFilter(String filter) throws Exception {
        try{
            return queryGateway.query(new SearchUsersQuery(filter),
                    ResponseTypes.instanceOf(UserLookupResponse.class))
                    .join();
        }catch(Throwable ex){
            throw new ProcessingUserException(ex.getMessage());
        }
    }
}
