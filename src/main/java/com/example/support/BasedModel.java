package com.example.support;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * Date:2016.2.13
 * 实体类的基本类
 * @author zhs
 *
 */
@MappedSuperclass
public abstract class BasedModel implements Model<String>, Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 9107664668612908477L;
    private String id ;
    private Date createTime = new Date();

    @Id
    @Column(name = "ID",length = 100)
    @GeneratedValue(generator = "ai-uuid")
    @GenericGenerator(name = "ai-uuid", strategy = "uuid")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "create_time", nullable = true)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }



}
