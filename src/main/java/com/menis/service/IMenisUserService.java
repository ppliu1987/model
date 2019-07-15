package com.menis.service;

import com.menis.vo.UserVo;

public interface IMenisUserService {
    public UserVo getUserByMblNo(String mblNo);
}