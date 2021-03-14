package com.springbank.user.query.api.dto;

import com.springbank.user.core.models.User;
import com.springbank.user.core.rest.dto.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserLookupResponse extends BaseResponse {

    private List<User> user;

}
