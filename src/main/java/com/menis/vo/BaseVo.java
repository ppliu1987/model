package com.menis.vo;

import com.menis.util.StringUtil;
import lombok.Data;

import java.io.Serializable;

@Data
public class BaseVo implements Serializable {
    private static final Long SerialVersionUID = 1L;

    String id;
    String buildTime;//yyyyMMddHHmmss
    String tmstmp;//yyyyMMddHHmmss
    String isDel;//删除标记
    String status;//状态
    String extInfo;//扩展信息

    public void init(){
        this.id = createId();
        this.buildTime = StringUtil.getTmstmp(14);
        this.tmstmp = StringUtil.getTmstmp(14);
        this.status = "0";
        this.isDel = "0";
    }
    protected void update(){
        this.tmstmp = StringUtil.getTmstmp(14);
    }
    protected void del(){
        this.isDel = "1";
    }
    //产生随机ID
    private String createId(){
        String tmstmp = StringUtil.getTmstmp(14);
        String random = StringUtil.getRandom(8);
        StringBuffer buf = new StringBuffer(tmstmp);
//        String id = buf.append(random).toString();
        return id;
    }
}
