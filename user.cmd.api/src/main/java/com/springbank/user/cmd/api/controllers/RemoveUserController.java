package com.springbank.user.cmd.api.controllers;


import com.springbank.user.cmd.api.commands.UpdateUserCommand;
import com.springbank.user.cmd.api.dto.BaseResponse;
import com.springbank.user.cmd.api.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/removeUser")
@RequiredArgsConstructor
@Validated
public class RemoveUserController {

    private final UserService userService;

    @DeleteMapping(path="/{id}")
    public ResponseEntity<BaseResponse> removeUser(@PathVariable(value = "id") String id) throws Exception {

        return ResponseEntity.ok().body(userService.removeUser(id));
    }

}
