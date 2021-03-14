package com.springbank.user.cmd.api.service;

import com.springbank.user.cmd.api.commands.RegisterUserCommand;
import com.springbank.user.cmd.api.commands.UpdateUserCommand;
import com.springbank.user.core.rest.dto.BaseResponse;
import com.springbank.user.cmd.api.dto.RegisterUserResponse;

public interface UserService {

    RegisterUserResponse registerUser(RegisterUserCommand registerUserCommand) throws Exception;
    BaseResponse updateUser(String id, UpdateUserCommand updateUserCommand) throws Exception;
    BaseResponse removeUser(String id) throws Exception;

}
