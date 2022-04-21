package com.xjt.service.impl;

import com.xjt.mapper.UserMapper;
import com.xjt.model.User;
import com.xjt.service.IUserService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jianyao
 * @Description TODO
 * @Date 2022/2/18 17:22
 */
public class BuyStockServiceImpl implements IUserService {

    private UserMapper userMapper;

    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = NullPointerException.class)
    @Override
    public User findByid(int id) {
        return null;
    }


//    @Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)
//    @Override
//    public void addAccount(String accountname, double money) {
//        accountDao.addAccount(accountname,money);
//
//    }
//
//    @Transactional(isolation= Isolation.DEFAULT,propagation= Propagation.REQUIRED,rollbackFor=BuyStockException.class)
//    @Override
//    public void buyStock(String accountname, double money, String stockname, int amount) throws BuyStockException {
//        boolean isBuy = true;
//        accountDao.updateAccount(accountname, money, isBuy);
//        if(isBuy==true){
//            throw new BuyStockException("购买股票发生异常");
//        }
//        stockDao.updateStock(stockname, amount, isBuy);
//    }

}
