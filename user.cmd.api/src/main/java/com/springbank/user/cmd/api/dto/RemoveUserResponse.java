package com.springbank.user.cmd.api.dto;


import com.springbank.user.core.rest.dto.BaseResponse;

public class RemoveUserResponse extends BaseResponse {
    private String id;

    public RemoveUserResponse(String message) {
        super(message);
    }

}
