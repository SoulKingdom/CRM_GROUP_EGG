package net.wanho.vo.customer;

public class LinkManVo {
  private String name;
  private String sex;
  private String position;
  private String nickName;
  
  
public LinkManVo() {
	super();
	// TODO Auto-generated constructor stub
}


public LinkManVo(String name, String sex, String position, String nickName) {
	super();
	this.name = name;
	this.sex = sex;
	this.position = position;
	this.nickName = nickName;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getSex() {
	return sex;
}


public void setSex(String sex) {
	this.sex = sex;
}


public String getPosition() {
	return position;
}


public void setPosition(String position) {
	this.position = position;
}


public String getNickName() {
	return nickName;
}


public void setNickName(String nickName) {
	this.nickName = nickName;
}
  
  
}
