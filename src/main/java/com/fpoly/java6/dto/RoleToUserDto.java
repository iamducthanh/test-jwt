package com.fpoly.java6.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author GMO_ThanhND
 * @version 1.0
 * @since 11/14/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleToUserDto {
    private String username;
    private String roleName;
}
