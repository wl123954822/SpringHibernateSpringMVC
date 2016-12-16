package com.panxiang.common.base;

import java.io.Serializable;

import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

import com.panxiang.common.utils.IdWorker;

public class IdGenerator implements IdentifierGenerator {  
  
	//生成自定义id
    public Serializable generate(SessionImplementor session, Object obj) {  
        return IdWorker.getId();
    }  
}  