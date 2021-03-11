package com.springbank.user.cmd.api.service.impl;

import com.springbank.user.cmd.api.commands.RegisterUserCommand;
import com.springbank.user.cmd.api.commands.RemoveUserCommand;
import com.springbank.user.cmd.api.commands.UpdateUserCommand;
import com.springbank.user.cmd.api.dto.RegisterUserResponse;
import com.springbank.user.cmd.api.dto.RemoveUserResponse;
import com.springbank.user.cmd.api.dto.UpdateUserResponse;
import com.springbank.user.cmd.api.exception.ProcessingRegisterUserException;
import com.springbank.user.cmd.api.service.UserService;
import lombok.RequiredArgsConstructor;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final CommandGateway commandGateway;

    @Override
    public CompletableFuture<RegisterUserResponse> registerUser(RegisterUserCommand registerUserCommand) throws Exception {

        try{
            registerUserCommand.setId(UUID.randomUUID().toString());
            return commandGateway.send(registerUserCommand);
        }catch(Throwable ex){
            throw new ProcessingRegisterUserException(ex.getMessage());
        }
    }

    @Override
    public CompletableFuture<UpdateUserResponse> updateUser(UpdateUserCommand updateUserCommand) throws Exception {
        return null;
    }

    @Override
    public CompletableFuture<RemoveUserResponse> removeUser(RemoveUserCommand removeUserCommand) throws Exception {
        return null;
    }

}
