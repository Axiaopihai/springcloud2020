package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zxq
 * 2020/4/17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountAccount {
    private Integer id;
    private String usern;
    private String password;
}
