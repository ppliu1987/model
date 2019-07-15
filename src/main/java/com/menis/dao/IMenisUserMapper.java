package com.menis.dao;

import com.menis.vo.UserVo;
import org.springframework.stereotype.Repository;

@Repository("userMapper")
public interface IMenisUserMapper {
    public UserVo getUserByMblNo(String mblNo);
}