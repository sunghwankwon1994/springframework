package com.mycompany.springframework.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mycompany.springframework.dao.mybatis.Ch13AccountDao;
import com.mycompany.springframework.dto.Ch15Account;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class Ch15Service {

  @Autowired
  private Ch13AccountDao accountDao;

  public List<Ch15Account> getAccountList() {
    List<Ch15Account> accountList = accountDao.selectAll();
    return accountList;
  }
  //Spring annotaion 트렌젝션을 사용해야함
  // 출금은 작동하지만 입금이 안되거나 반대의 상황일 때 작동을 중지
  @Transactional
  public void transfer(int fromAno, int toAno, int amount) {
    // 출금 자금
    // 사용자 정의 예외 정의 하는 것도 좋음
    Ch15Account fromAccount = accountDao.selectByAno(fromAno);
    if (fromAccount == null) {
      throw new RuntimeException("출금 계좌 없음");
    }
    fromAccount.setBalance(fromAccount.getBalance() - amount);
    // db 업데이트를 위해서
    accountDao.updateBalance(fromAccount);
    

    // 입금 자금
    Ch15Account toAccount = accountDao.selectByAno(toAno);
    if (toAccount == null) {
      throw new RuntimeException("입금 계좌 없음");
    }
    toAccount.setBalance(toAccount.getBalance() + amount);
    // db 업데이트를 위해서
    accountDao.updateBalance(toAccount);
    
  }
}
