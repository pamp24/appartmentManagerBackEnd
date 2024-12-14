package com.appartmentManager.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String role;
    private Boolean active;
}
