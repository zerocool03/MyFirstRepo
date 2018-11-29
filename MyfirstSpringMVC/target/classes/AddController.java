
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {

	@RequestMapping("/add")
	public HttpServletResponse add(HttpServletRequest request) {

		int a = Integer.parseInt(request.getParameter("t1"));

		int b = Integer.parseInt(request.getParameter("t2"));

	}

}
