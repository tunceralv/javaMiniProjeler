package atm_2;
import java.util.Scanner;

public class ATM {

	private int secilenislem;
	
	public ATM() {}
	
	public void islemSec()
	{
	  Login giris=new Login();
	  hesap hsp=new hesap();
	  
	  giris.GirisYap();
	  while(secilenislem!=4)
	  {
	  System.out.println("islem seciniz: ");
      System.out.println("1)Bakiye Goruntule\n"
      		           + "2)Para Yatir\n"
      		           + "3)Para Cek\n"
      		           + "4)Kart iade");
	  Scanner input=new Scanner(System.in);
	  secilenislem=input.nextInt();
	  if(secilenislem==1)
	  {
		  hsp.BakiyeGoruntule();
	  }
	  if(secilenislem==2)
	  {
		  hsp.ParaYatir();
	  }
	  if(secilenislem==3)
	  {
		  hsp.ParaCek();
	  }
	  if(secilenislem==4)
	  {
		  System.out.println("Kart iade ediliyor");
		  System.out.println("Lütfen Kartinizi Alin...!!");
		  System.exit(0);
	  }
	  }
	 
	}

	public static void main(String[] args) 
	{
	   
		ATM atm=new ATM();
		atm.islemSec();
	  /*Login girisYap=new Login();
	  hesap islem=new hesap();
	  girisYap.GirisYap();*/

	}

}
