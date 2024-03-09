package atm_2;
import java.util.Scanner;

public class hesap {
	
	private double ToplamBakiye = 5000;
	private double cekilenMiktar;
	private double yatirilanMiktar;
	private String cevap;
	
	public hesap() {}
	
	public void BakiyeGoruntule() {
		System.out.println("Hesaptaki anlık toplam bakiyeniz: " + ToplamBakiye);
	}
	
	public void ParaYatir() {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		System.out.println("Hesabiniza yatirmak istediğiniz tutari girin: ");
		yatirilanMiktar = input.nextDouble();
		System.out.println("Yatirmak istediğiniz tutar : " + yatirilanMiktar + " Onay veriyor musunuz?");
		System.out.println("evet için 'e' hayir için 'h'");
		cevap = input1.nextLine();
		if (cevap.equals("e")) {
			ToplamBakiye += yatirilanMiktar;
			System.out.println("İşleminiz Tamamlandı.....");
			System.out.println("Hesaptaki anlık toplam bakiyeniz: " + ToplamBakiye);
		}
		if (cevap.equals("h")) {
			System.out.println("İşleminiz iptal ediliyor.....");
			System.out.println("Hesaptaki anlık toplam bakiyeniz: " + ToplamBakiye);
		}
	}
	
	public void ParaCek() {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		System.out.println("Hesabinizdan cekmek istediginiz tutari girin: ");
		cekilenMiktar = input.nextDouble();
		if (ToplamBakiye >= cekilenMiktar) {
			System.out.println("Cekmek istediğiniz tutar : " + cekilenMiktar + " Onay veriyor musunuz?");
			System.out.println("evet için 'e' hayir için 'h'");
			cevap = input1.nextLine();
			if (cevap.equals("e")) {
				ToplamBakiye -= cekilenMiktar;
				System.out.println("İşleminiz Tamamlandı.....");
				System.out.println("Hesaptaki anlık toplam bakiyeniz: " + ToplamBakiye);
			}
			if (cevap.equals("h")) {
				System.out.println("İşleminiz iptal ediliyor.....");
				System.out.println("Hesaptaki anlık toplam bakiyeniz: " + ToplamBakiye);
			}
		} else {
			System.out.println("Hesabinizda talep ettiginiz miktar bulunmamaktadir...\nİşlem basarisiz");
			System.out.println("Hesaptaki anlık toplam bakiyeniz: " + ToplamBakiye);
		}
	}
}
