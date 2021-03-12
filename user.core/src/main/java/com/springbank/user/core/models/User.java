package com.springbank.user.core.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "users")
public class User {
    @Id
    private String id;
    @NotEmpty(message="Firstname is mandatory")
    private String firstname;
    @NotEmpty(message="Lastname is mandatory")
    private String lastname;
    @Email(message="Please provide a valid email adress")
    private String emailAddress;
    @NotNull(message="Please provide a valid credentials")
    @Valid
    private Account account;
}



