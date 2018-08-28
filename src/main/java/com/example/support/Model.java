package com.example.support;

import java.io.Serializable;
/**
 * java类简单作用描述
 *
 * @ProjectName: machine-scada
 * @Package: com.example.support
 * @Author: zhangshuai
 * @CreateDate: 2018/8/24 16:33
 * @UpdateDate: 2018/8/24 16:33
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */

public interface Model<K extends Serializable> {


    K getId();


    void setId(K id);

}

