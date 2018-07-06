package com.duyun.huishou.housekeeper.po;

import lombok.Data;

@Data
public class NewsEntity {


    //没有重新构造img 函数
    // 重写构造方法
    public NewsEntity(Integer id,String title,String content,Integer isTop,Long insertTime,Long lastUpdateTime){
        setId(id);
        setContent(content);
        setTitle(title);
        setIsTop(isTop);
        setLastUpdateTime(lastUpdateTime);
        setInsertTime(insertTime);
    }

    //没有重新构造img 函数
    public NewsEntity(Integer id,String title,String content,Integer isTop,Long lastUpdateTime){
        setId(id);
        setContent(content);
        setTitle(title);
        setIsTop(isTop);
        setLastUpdateTime(lastUpdateTime);
    }


    private Integer id;

    private String title;

    private String content;
    private String img;

    private Integer isTop;

    private Long insertTime;

    private Long lastUpdateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getIsTop() {
        return isTop;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public Long getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Long insertTime) {
        this.insertTime = insertTime;
    }

    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}