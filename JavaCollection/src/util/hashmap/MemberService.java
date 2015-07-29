package util.hashmap;

public interface MemberService {
	/*회원가입 URL*/
	public void join(String userid,String password,String name, int age,String address);
	/*로그인 URL*/
	public String login(String userid2, String password2);
}
