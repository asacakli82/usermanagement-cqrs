package com.springbank.user.cmd.api.service;

import com.springbank.user.cmd.api.commands.RegisterUserCommand;
import com.springbank.user.cmd.api.commands.RemoveUserCommand;
import com.springbank.user.cmd.api.commands.UpdateUserCommand;
import com.springbank.user.cmd.api.dto.BaseResponse;
import com.springbank.user.cmd.api.dto.RegisterUserResponse;
import com.springbank.user.cmd.api.dto.RemoveUserResponse;
import com.springbank.user.cmd.api.dto.UpdateUserResponse;
import com.springbank.user.cmd.api.exception.ProcessingRegisterUserException;

import java.util.concurrent.CompletableFuture;

public interface UserService {

    RegisterUserResponse registerUser(RegisterUserCommand registerUserCommand) throws Exception;
    BaseResponse updateUser(String id, UpdateUserCommand updateUserCommand) throws Exception;
    RemoveUserResponse removeUser(RemoveUserCommand removeUserCommand) throws Exception;

}
