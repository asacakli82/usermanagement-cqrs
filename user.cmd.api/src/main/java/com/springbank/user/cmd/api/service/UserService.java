package com.springbank.user.cmd.api.service;

import com.springbank.user.cmd.api.commands.RegisterUserCommand;
import com.springbank.user.cmd.api.dto.RegisterUserResponse;
import com.springbank.user.cmd.api.exception.ProcessingRegisterUserException;

import java.util.concurrent.CompletableFuture;

public interface UserService {

    CompletableFuture<RegisterUserResponse> registerUser(RegisterUserCommand registerUserCommand) throws Exception;

}
