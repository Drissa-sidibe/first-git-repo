package saraya.com;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equals("Drissa")&& password.equals("code");
	}
}
