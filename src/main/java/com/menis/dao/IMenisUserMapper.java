package com.menis.dao;

import com.menis.vo.UserVo;
import org.springframework.stereotype.Repository;

@Repository("menisUserMapper")
public interface IMenisUserMapper {
    UserVo getUserByMblNo(String mblNo);
    void update(UserVo user);
}