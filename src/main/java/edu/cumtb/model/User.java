package edu.cumtb.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by tbpwang@gmail.com
 * 2016/8/10.
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BaseModel {
    private Integer id;
    private String username;
    private String password;
//    private String date;
    private String role;
}
