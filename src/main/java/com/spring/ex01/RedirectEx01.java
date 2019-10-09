package com.spring.ex01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectEx01 {

	/**
	 * redirect: 키를 이용한 페이지 이동
	 **/
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "loginId";
	}
	
	@RequestMapping("/memConf")
	public String memberRedirect(HttpServletRequest req, Model model) {
		String id = req.getParameter("id");
		
		if(id.equals("test")) {
			return "redirect:memberOK";
		}
		return "redirect:memberFail";
	}//memberRedirect()
	
	@RequestMapping("/memberOK")
	public String memberOK() {
		return "member/memberOK";
	}

	@RequestMapping("/memberFail")
	public String memberFail() {
		return "member/memberFail";
	}
	
	// 풀네임을 사용할 수 있으나 좋은 방법이 아니다.
	// joinURL.jsp 파일을 webapp 루트 폴더에 넣고 사용!
	@RequestMapping("/joinURL")
	public String joinUrl() {
		return "redirect:http://localhost:9090/ex01/joinURL.jsp";
	}
}
