package atm_2;
import java.util.Scanner;

public class Login {
	
	private String sifre="2345";
	

	public Login() {}
	
	public void GirisYap()
	{
		Scanner input=new Scanner(System.in);
		System.out.println(" Sifrenizi Giriniz ");
		String Girilen_sifre=input.nextLine();
		if(Girilen_sifre.equals(sifre))
		{
			System.out.println(" Kullanici Girisi Basarili ");
		}
		else
		{
			while(sifre!=Girilen_sifre)
			{
				System.out.println(" bilgiler hatali tekrar deneyiniz ");
				System.out.println(" Sifrenizi Giriniz ");
				Girilen_sifre=input.nextLine();
				if(Girilen_sifre.equals(sifre))
				{
					System.out.println(" Kullanici Girisi Basarili ");
					break;
				}
				
			}
		}
		
	}
	
	

}
