package com.springbank.user.cmd.api.controllers;


import com.springbank.user.cmd.api.commands.RegisterUserCommand;
import com.springbank.user.cmd.api.dto.RegisterUserResponse;
import com.springbank.user.cmd.api.service.UserService;
import lombok.RequiredArgsConstructor;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/v1/registerUser")
@RequiredArgsConstructor
public class RegisterUserController {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<CompletableFuture<RegisterUserResponse>> registerUser(@RequestBody RegisterUserCommand registerUserCommand) throws Exception {

        return ResponseEntity.ok().body(userService.registerUser(registerUserCommand));
    }

}
