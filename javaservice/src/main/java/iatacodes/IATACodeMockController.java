package iatacodes;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/v1")
public class IATACodeMockController {

	//checkacode?code=01234567
	@RequestMapping(value = "/v1/checkacode", method=RequestMethod.GET)
    public @ResponseBody Agency[] detailsForAgency(@RequestParam(value="code", required=false, defaultValue="01234567")String code) {
        
		ArrayList<Agency> list = new ArrayList<>();
		String[] codes = code.split(",");
		for (String string : codes) {
			list.add(new Agency(string, "201605110616","Valid","SAMPLE AGENCY","6-10-2005","PASSENGER","Branch Office","33 MAIN STREET","MONTREAL","H0H 1H2","Quebec","Canada","1 514 874 0202"));
		}
		return list.toArray(new Agency[list.size()]);
    }

}
