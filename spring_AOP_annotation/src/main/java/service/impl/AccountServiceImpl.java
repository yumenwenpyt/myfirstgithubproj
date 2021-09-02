package service.impl;

import org.springframework.stereotype.Service;
import service.AccountService;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Override
    public void save() {
        System.out.println("保存了用户");
    }

    @Override
    public void update(Integer integer) {
        System.out.println("更新了用户");
    }

    @Override
    public int delete() {
        System.out.println("删除了用户");
        return 0;
    }
}
