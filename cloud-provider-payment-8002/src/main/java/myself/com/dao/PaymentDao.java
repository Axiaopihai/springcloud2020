package myself.com.dao;


import bean.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zxq
 * 2020/4/5
 */
@Mapper
public interface PaymentDao {

    Account queryEmpById(Integer id);

    void insertEmp(Account account);
}
