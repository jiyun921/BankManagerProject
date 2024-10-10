package domain.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserInfo {
    private String username;
    private String password;
    private String birth;
    private String id;
    private String phoneNum;
    private String accountNum;

    public UserInfo(String id, String username, String password, String phoneNum, String birth, String accountNum) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phoneNum = phoneNum;
        this.birth = birth;
        this.accountNum = accountNum;
    }
}
