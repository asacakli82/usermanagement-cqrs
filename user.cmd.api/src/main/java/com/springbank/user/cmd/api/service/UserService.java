package com.springbank.user.cmd.api.service;

import com.springbank.user.cmd.api.commands.RegisterUserCommand;
import com.springbank.user.cmd.api.commands.RemoveUserCommand;
import com.springbank.user.cmd.api.commands.UpdateUserCommand;
import com.springbank.user.cmd.api.dto.RegisterUserResponse;
import com.springbank.user.cmd.api.dto.RemoveUserResponse;
import com.springbank.user.cmd.api.dto.UpdateUserResponse;
import com.springbank.user.cmd.api.exception.ProcessingRegisterUserException;

import java.util.concurrent.CompletableFuture;

public interface UserService {

    CompletableFuture<RegisterUserResponse> registerUser(RegisterUserCommand registerUserCommand) throws Exception;
    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserCommand updateUserCommand) throws Exception;
    CompletableFuture<RemoveUserResponse> removeUser(RemoveUserCommand removeUserCommand) throws Exception;

}
