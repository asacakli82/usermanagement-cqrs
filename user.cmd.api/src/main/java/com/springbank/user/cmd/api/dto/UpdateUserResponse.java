package com.springbank.user.cmd.api.dto;


import com.springbank.user.core.rest.dto.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserResponse extends BaseResponse {
    private String id;

    public UpdateUserResponse(String id,String message) {
        super(message);
        this.id = id;
    }

}