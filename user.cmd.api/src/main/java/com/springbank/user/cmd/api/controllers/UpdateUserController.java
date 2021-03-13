package com.springbank.user.cmd.api.controllers;


import com.springbank.user.cmd.api.commands.RegisterUserCommand;
import com.springbank.user.cmd.api.commands.UpdateUserCommand;
import com.springbank.user.cmd.api.dto.BaseResponse;
import com.springbank.user.cmd.api.dto.RegisterUserResponse;
import com.springbank.user.cmd.api.dto.UpdateUserResponse;
import com.springbank.user.cmd.api.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/updateUser")
@RequiredArgsConstructor
@Validated
public class UpdateUserController {

    private final UserService userService;

    @PutMapping(path="/{id}")
    public ResponseEntity<BaseResponse> updateUser(@PathVariable(value = "id") String id, @Valid @RequestBody UpdateUserCommand updateUserCommand) throws Exception {

        return ResponseEntity.ok().body(userService.updateUser(id,updateUserCommand));
    }

}
