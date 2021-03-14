package com.springbank.user.query.api.controllers;

import com.springbank.user.query.api.dto.UserLookupResponse;
import com.springbank.user.query.api.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping(path = "/api/v1/userLookup")
@RequiredArgsConstructor
public class UserLookupController {

    private final UserService userService;

    @GetMapping(path = "/")
    public ResponseEntity<UserLookupResponse> getAllUsers() throws Exception {

        var response = userService.getAllUsers();

        if(Objects.isNull(response)||Objects.isNull(response.getUser())){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok().body(response);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<UserLookupResponse> getUserById(@PathVariable(value = "id") String id) throws Exception {

        var response = userService.getUserById(id);

        if(Objects.isNull(response)||Objects.isNull(response.getUser())){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok().body(response);
    }

    @GetMapping(path = "/byFilter/{filter}")
    public ResponseEntity<UserLookupResponse> searchUserByFilter(@PathVariable(value = "filter") String filter) throws Exception {

        var response = userService.searchUserByFilter(filter);

        if(Objects.isNull(response)||Objects.isNull(response.getUser())){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok().body(response);
    }


}
