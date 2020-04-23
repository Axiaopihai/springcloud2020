package bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author zxq
 * 2020/4/17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountOrder {

    private Integer id;

    private String userName;

    private Timestamp time;

}
