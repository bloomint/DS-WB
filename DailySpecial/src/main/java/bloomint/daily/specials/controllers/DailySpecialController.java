package bloomint.daily.specials.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller public class DailySpecialController {

	@RequestMapping(value = "/Home")
	public String home()
	{
		return "showMessage";
	}
}
