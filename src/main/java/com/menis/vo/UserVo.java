package com.menis.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserVo extends BaseVo implements Serializable {
    public static final Long SerialVersionUID = 1L;

    public String mblNo;//手机号
    public String passwd;//密码
    public String idCard;//身份证号
    public String bankCardNo;//银行卡号

    public String id = super.id;
    public String buildTime = super.buildTime;
    public String tmstmp = super.tmstmp;
    public String isDel = super.isDel;
    public String status = super.status;

}