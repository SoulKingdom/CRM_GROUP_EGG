package net.wanho.dao.baseDao;

import java.util.List;

import net.wanho.vo.customer.CustomerVo;

/**
 * 基础CRUD包
 * 
 * @author Administrator
 *
 */
public interface BaseDaoI<T, K> {
	/**
	 * 插入信息
	 * @param info 封裝用戶信息
	 * @return 插入数量
	 */
	public int insert(T info);
	/**
	 * 删除信息
	 * @param id 用户id
	 * @return 删除数据数量
	 */
	public int delete(K id);
	/**
	 * 更新数据
	 * @param info 封装数据信息
	 * @return 返回更新数量
	 */
	public int update(T info);
	/**
	 * 查询用户
	 * @param id 主键
	 * @return 返回 查询用户 不存在返回null
	 */
	public T selectById(K id);

	/**
	 * 符合条件的 查询数量
	 * @param info 条件封装类
	 * @return 返回符合条件的数量
	 */
	public int selectCondCount(T info);

	/**
	 * 查询符合条件的信息
	 * 
	 * @param pageNo
	 *            当前页
	 * @param pageSize
	 *            分页跨度
	 * @param user
	 *            符合条件
	 * @return 返回符合条件的用户
	 */
	List<T> selectCond(int pageNo, int pageSize, T info);

}
