package net.wanho.page;

import java.util.ArrayList;
import java.util.List;

public class PageBean<T> {
	private int pageNo;    //页码
	private int totalPages ;   //总页数
	private int pageSize ;    // 分页跨度
	private int totalRecords ; // 总记录数
	private boolean isHavePrePage ;  // 是否有上一页
	private boolean isHaveNextPage ; // 是否有下一页
	private T cond;
	private List<T> pageDatas = new ArrayList<T>();

	
	public T getCond() {
		return cond;
	}

	public void setCond(T cond) {
		this.cond = cond;
	}

	public int getpageNo() {
	return pageNo;
	}

	public void setpageNo(int pageNo) {
	this.pageNo = pageNo;
	}

	public int getPageSize() {
	return pageSize;
	}

	public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
	}

	public int getTotalRecords() {
	return totalRecords;
	}


	public List<T> getPageDatas() {
	return pageDatas;
	}

	public void setPageDatas(List<T> pageDatas) {
	this.pageDatas = pageDatas;
	}

	public int getTotalPages() {
	return totalPages;
	}
	
	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
		this.totalPages = (this.totalRecords+this.pageSize-1)/this.pageSize;
	}

	public void setHavePrePage(boolean isHavePrePage) {
		this.isHavePrePage = isHavePrePage;
	}

	public void setHaveNextPage(boolean isHaveNextPage) {
		this.isHaveNextPage = isHaveNextPage;
	}

	public boolean getIsHavePrePage() {
	return isHavePrePage;
	}

	public boolean getIsHaveNextPage() {
	return isHaveNextPage;
	}

	public PageBean(int pageNo, int pageSize, int totalRecords) {
		super();
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		if(totalRecords < 0){
			throw new RuntimeException("鎬昏褰曟暟涓嶈兘灏忎簬0!");
			}
			//璁剧疆鎬昏褰曟暟
			this.totalRecords = totalRecords;
			//璁＄畻鎬婚〉鏁�
			this.totalPages = this.totalRecords/this.pageSize;
			if(this.totalRecords%this.pageSize!=0){
			this.totalPages++;
			}
			//璁＄畻鏄惁鏈変笂涓�椤�
			if(this.pageNo>1){
			this.isHavePrePage = true;
			}else{
				this.isHavePrePage = false;
			}
			//璁＄畻鏄惁鏈変笅涓�椤�
			if(this.pageNo<this.totalPages){
			this.isHaveNextPage = true;
			}else{
			this.isHaveNextPage = false;
			}
	}

	public PageBean() {
		super();
	}
	
	
}
