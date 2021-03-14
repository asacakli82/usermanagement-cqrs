package com.springbank.user.cmd.api.dto;

import com.springbank.user.core.rest.dto.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserResponse extends BaseResponse {
    private String id;

    public RegisterUserResponse(String id,String message) {
        super(message);
        this.id = id;
    }

}
