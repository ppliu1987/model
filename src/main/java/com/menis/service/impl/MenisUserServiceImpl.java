package com.menis.service.impl;

import com.menis.dao.IMenisUserMapper;
import com.menis.service.IMenisUserService;
import com.menis.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
public class MenisUserServiceImpl implements IMenisUserService {
    @Autowired
    IMenisUserMapper userMapper;


    @Override
    public UserVo getUserByMblNo(String mblNo) {
        return userMapper.getUserByMblNo(mblNo);
    }

    @Transactional
    @Override
    public void update(UserVo user) {
        userMapper.update(user);
        System.out.println("已更新");
        testTransaction();
    }

    public void testTransaction(){
        System.out.println(1/0);
    }
}