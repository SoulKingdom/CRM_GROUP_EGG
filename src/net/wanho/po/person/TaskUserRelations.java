package net.wanho.po.person;
/**
 * 任务指定相关人员
 * @author Administrator
 *
 */
public class TaskUserRelations {
	/**关系编码*/
	private Integer relationId;
	/**任务编码*/
	private Integer taskId;
	/**任务指定员工*/
	private Integer employeeId;
	public TaskUserRelations() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaskUserRelations(Integer relationId, Integer taskId, Integer employeeId) {
		super();
		this.relationId = relationId;
		this.taskId = taskId;
		this.employeeId = employeeId;
	}
	public Integer getRelationId() {
		return relationId;
	}
	public void setRelationId(Integer relationId) {
		this.relationId = relationId;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "TaskUserRelations [relationId=" + relationId + ", taskId=" + taskId + ", employeeId=" + employeeId
				+ "]";
	}
	
	
}
