import javax.swing.JOptionPane;

public class LoginApp {

	public static void main(String[] args) {
		
		// 올바른 패스는 변수 password 1111
		String password = "1111";
		String inputPassword = JOptionPane.showInputDialog("Please input total : ");
		
		// 입력한 패스워드가 1111이라면 
		// if(password == inputPassword) {  X
		// if(inputPassword.equals(password)) {  O
		if(password.equals(inputPassword)) {
			// 화면에 주인님 안녕하세요를 출력해
			System.out.println("주인님 안녕하세요.");
		} else {
		// 아니라면
			// 뉘슈를 출력해
			System.out.println("뉘슈?????");
			
		}
		// 좋은 하루 되세요.

	}

}
