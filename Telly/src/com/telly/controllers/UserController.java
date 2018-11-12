
@Controller
public class UserController {


	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}
	
	@RequestMapping("/loggedout")
	public String showLogout() {
		return "loggedout";
	}

}



