package net.wanho.service.baseservice;

public interface BaseServicesI<T,K> {
	/**
	 * 插入信息
	 * @param info 封裝用戶信息
	 * @return 插入数量
	 */
	public int add(T info);
	/**
	 * 删除信息
	 * @param id 用户id
	 * @return 删除数据数量
	 */
	public int remove(K id);
	/**
	 * 更新数据
	 * @param info 封装数据信息
	 * @return 返回更新数量
	 */
	public int modify(T info);
	/**
	 * 查询用户
	 * @param id 主键
	 * @return 返回 查询用户 不存在返回null
	 */
	public T queryById(K id);
}
