import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		
		String userName,password;
		
		System.out.print("Kullanici adiniz: ");
		userName = scanner.nextLine();
		
		System.out.print("Parolaniz: ");
		password = scanner.nextLine();
		
		if(userName.equals("patika") && password.equals("1234")) {
			System.out.println("Basarli giriş hoşgeldiniz.");
		}
		else {
			System.out.print("Kullanici adı veya parola hatali. Parolanizi değiştirmek ister misiniz ?");
			String response = scanner.nextLine();
			
			if(response.equals("evet")) {
				
				System.out.print("Yeni şifre:");
				String newPassword = scanner.nextLine();
				System.out.print("Yeni şifrenizi tekrar giriniz:");
				String newPassword2 = scanner.nextLine();
				
				if(newPassword.equals(newPassword2)) {
					System.out.println("Şifreniz güncellendi.");
				}
				else {
					System.out.println("Girdiğiniz şifreler farkli.");
				}
			}
			else {
				System.out.println("Mevcut sifrenizle yeniden giris yapmayı deneyin.");
			}
		}
		
	}
	}


