package com.menis.vo;

import com.menis.util.StringUtil;
import lombok.Data;

import java.io.Serializable;

@Data
public class BaseVo implements Serializable {
    private static final Long SerialVersionUID = 1L;

    protected String id = createId();
    protected String buildTime = StringUtil.getTmstmp(14);//yyyyMMddHHmmss
    protected String tmstmp = StringUtil.getTmstmp(14);//yyyyMMddHHmmss
    protected String isDel = "0";//删除标记 0-未删除,1-已删除
    protected String status = "0";//状态0-初始状态
    protected String extInfo;//扩展信息

    protected void init(){
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
        String newId = buf.append(random).toString();
        return newId;
    }

    public static void main(String[] args) {
        BaseVo bs = new BaseVo();
        bs.init();
        System.out.println(bs.getId());
        System.out.println(bs.id);
        System.out.println(StringUtil.getTmstmp(14));
    }
}
