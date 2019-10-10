/**
 * @FILE Name
 * MemberValidator.java
 * 
 * @AUTHOR     : Rony Kwak
 * @CREATE DATE: 2019-10-10
 * @GIT USER   : dewytear
 * @GIT EMAIL  : youngjinkwak@gmail.com
 * @Description: 
 * =============================
 * @Change History
 * v1.0: 
 * v1.1: 
 * =============================
 */
package com.spring.validationEx;



import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @CLASS Name
 *  MemberValidator
 * 
 * @AUTHOR     : Rony Kwak
 * @CREATE DATE: 2019-10-10
 * @PROJECT    : Java-Spring4-Ex03
 * @PACKAGE    : com.spring.validationEx
 * @GIT USER   : dewytear
 * @GIT EMAIL  : youngjinkwak@gmail.com
 * @Description: 
 * =============================
 * @Change History
 * v1.0: 
 * v1.1: 
 * =============================
 */
public class MemberValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return Member.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("------------- validate() 호출 -------------");
		Member member = (Member)target;
		
		String memName = member.getName();
		if(memName == null || memName.trim().isEmpty()) {
			System.out.println("회원 이름을 입력하세요.");
			errors.rejectValue("name", "입력시 오류 발생");
		}//if()
		
		// 1) 
//		String memId = member.getId();
//		if(memId == null || memId.trim().isEmpty()) {
//			System.out.println("회원 ID를 입력하세요.");
//			errors.rejectValue("id", "입력시 오류 발생");
//		}//if()
		
		// 2) ValidationUtils 이용
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "입력시 오류 발생");

		int memNo = member.getMemNo();
		if(memNo == 0) {
			System.out.println("주민번호를 입력하세요.");
			errors.rejectValue("memNo", "입력시 오류 발생");
		}//if()
	}
	
}
