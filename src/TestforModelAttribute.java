import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.tracing.dtrace.ModuleAttributes;

@Controller
public class TestforModelAttribute {
	@RequestMapping(value="/loginname")
	public void loginname(@RequestParam ("loginname") String loginname) throws Exception {
		System.out.println(loginname);
	}

}
