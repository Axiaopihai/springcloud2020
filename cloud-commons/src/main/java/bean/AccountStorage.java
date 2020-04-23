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
public class AccountStorage {
    private Integer id;
    private String name;
    private Timestamp time;
    private String bigText;
}
