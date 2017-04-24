package org.zerock.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.MassageVO;

@RestController //모든 데이터 return방식은 json과 xml이다.
@RequestMapping("/s2")
public class Sample2Controller {
	
	@GetMapping("doA")
	public  String doA(){ //resposebody 뷰로 결정되는 것이 아니라 컨텐츠 자체가 response용이다. jackdatabind가 포함되어있으면 디폴트가 json
		//무조건 json으로 바뀐다.(키,값)
		return "hello"; //값으로만 구성되어있기떄문에 text로 만들어준다.
	}
	
	@GetMapping("/doC/{cat}/{item}")
	public void doC(@PathVariable("cat") String cat, @PathVariable("item") String item){
		System.out.println("CAT: " + cat);
		System.out.println("item: " + item);
		
	}
	
	@PostMapping("/msg")
	public MassageVO doD(@RequestBody MassageVO vo){ //데이터 수집 (json으로 받고 json으로 보내고싶다.) //json형식으로 받으려고 requestbody
		System.out.println(vo);
		return vo; //자기 자신을 리턴받는 것이 일반적
	}
	
	
	
	@GetMapping("doB")
	public Map<String,String> doB(){
		
		Map<String,String>map = new HashMap<>();
		map.put("uid", "AAAA");//키,값을 설정해주면 json으로 인식해서 json형식으로 뿌려준다. -> ajax 데이터 주고받을 때 사용가능하다.
		map.put("upw", "BBBB");
		
		return map;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
