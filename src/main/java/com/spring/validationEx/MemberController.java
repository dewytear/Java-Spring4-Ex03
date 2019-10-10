/**
 * @FILE Name
 * MemberController.java
 * 
 * @AUTHOR     : Rony Kwak
 * @CREATE DATE: 2019-10-10
 * @GIT USER   : dewytear
 * @GIT EMAIL  : youngjinkwak@gmail.com
 * @Description: 
 */
package com.spring.validationEx;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @CLASS Name
 *  MemberController
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
 */
@Controller
public class MemberController {

	@RequestMapping("/memberForm")
	public String memberForm() {
		return "member/memInput";
	}//memberForm()
	
	@RequestMapping("/inputOK")
	public String inputOK(@ModelAttribute("member") @Valid Member member, BindingResult result) {
		String viewName = "memberOK";
		
		// 1) Validator 생성
//		MemberValidator mVaildator = new MemberValidator();
//		mVaildator.validate(member, result);
		
		// 2) @Valid , @InitBinder 사용
		if(result.hasErrors()) {
//			return "redirect:memberForm";
			viewName = "member/memInput";
		}

//		return "redirect:inputOK";
		return viewName;
	}//inputOK()
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new MemberValidator());
	}
}
