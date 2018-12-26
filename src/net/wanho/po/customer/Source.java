package net.wanho.po.customer;
/**
 * 客户来源
 * @author Administrator
 *
 */
public class Source {
	/**来源编码*/
	private Integer sourceId;
	/**来源名称*/
	private String sourceName;
	public Source() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Source(Integer sourceId, String sourceName) {
		super();
		this.sourceId = sourceId;
		this.sourceName = sourceName;
	}
	public Integer getSourceId() {
		return sourceId;
	}
	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}
	public String getSourceName() {
		return sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	@Override
	public String toString() {
		return "Source [sourceId=" + sourceId + ", sourceName=" + sourceName + "]";
	}
	
	
}
