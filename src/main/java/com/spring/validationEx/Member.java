/**
 * @FILE Name
 * Member.java
 * 
 * @AUTHOR     : Rony Kwak
 * @CREATE DATE: 2019-10-10
 * @GIT USER   : dewytear
 * @GIT EMAIL  : youngjinkwak@gmail.com
 * @Description: 
 */
package com.spring.validationEx;


/**
 * @CLASS Name
 *  Member
 * 
 * @AUTHOR     : Rony Kwak
 * @CREATE DATE: 2019-10-10
 * @PROJECT    : Java-Spring4-Ex03
 * @PACKAGE    : com.spring.validationEx
 * @Description: 
 * =============================
 * @Change History
 * v1.0: 
 * v1.1: 
 * =============================
 **/
public class Member {
	private String name;
	private String id;
	private int memNo;
	
	//[region] getter setter
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the memNo
	 */
	public int getMemNo() {
		return memNo;
	}
	/**
	 * @param memNo the memNo to set
	 */
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}

	//[end]
	
}
