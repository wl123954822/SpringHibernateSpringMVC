package com.panxiang.common.base;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T>
{
	// 根据ID加载实体
	public T get(Class<T> entityClazz , Serializable id);
	// 保存实体
	public Serializable save(T entity);
	// 更新实体
	public void update(T entity);
	// 删除实体
	public void delete(T entity);
	// 根据ID删除实体
	public void delete(Class<T> entityClazz ,String content, Serializable id);
	// 获取所有实体
	public List<T> findAll(Class<T> entityClazz);
	// 获取实体总数
	public long findCount(Class<T> entityClazz);
}
