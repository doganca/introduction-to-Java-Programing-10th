package Chapter4;

public class Soru03 {
	public static void main(String[] args) {
		final double DUNYA_YARICAP = 6_371.01;

		double kharkivLatitude = 49.98081;
		double kharkivLongitude = 36.25272;

		double kievLatitude = 50.45466;
		double kievLongitude = 30.5238;

		double odesaLatitude = 46.482526;
		double odesaLongitude = 30.723309500000028;

		double doneksLatitude = 48.015883;
		double donekstLongitude = 37.802850000000035;

		kharkivLatitude = Math.toRadians(kharkivLatitude);
		kharkivLongitude = Math.toRadians(kharkivLongitude);

		kievLatitude = Math.toRadians(kievLatitude);
		kievLongitude = Math.toRadians(kievLongitude);

		odesaLatitude = Math.toRadians(odesaLatitude);
		odesaLongitude = Math.toRadians(odesaLongitude);

		doneksLatitude = Math.toRadians(doneksLatitude);
		donekstLongitude = Math.toRadians(donekstLongitude);

		double kievOdesaArasindakiMesafe = (DUNYA_YARICAP * Math.acos(Math.sin(kievLatitude) * Math.sin(kievLongitude)
				+ Math.cos(kievLatitude) * Math.cos(kievLongitude) * Math.cos(odesaLatitude - odesaLongitude)));

		double kievDonekstArasindakiMesafe = (DUNYA_YARICAP * Math.acos(Math.sin(kievLatitude) * Math.sin(kievLongitude)
				+ Math.cos(kievLatitude) * Math.cos(kievLongitude) * Math.cos(doneksLatitude - donekstLongitude)));

		double odesaDonekstArasindakiMesafe = (DUNYA_YARICAP
				* Math.acos(Math.sin(odesaLatitude) * Math.sin(odesaLongitude) + Math.cos(odesaLatitude)
						* Math.cos(odesaLongitude) * Math.cos(doneksLatitude - donekstLongitude)));

		double kievKharkivArasindakiMesafe = (DUNYA_YARICAP * Math.acos(Math.sin(kievLatitude) * Math.sin(kievLongitude)
				+ Math.cos(kievLatitude) * Math.cos(kievLongitude) * Math.cos(kharkivLatitude - kharkivLongitude)));

		double kharkivDonekstArasindakiMesafe = (DUNYA_YARICAP
				* Math.acos(Math.sin(kharkivLatitude) * Math.sin(kharkivLongitude) + Math.cos(kharkivLatitude)
						* Math.cos(kharkivLongitude) * Math.cos(doneksLatitude - donekstLongitude)));

		double s1 = (kievOdesaArasindakiMesafe + odesaDonekstArasindakiMesafe + kievDonekstArasindakiMesafe) / 2;
		double kievOdesaDonekstAlan = Math.sqrt((s1 * (s1 - kievOdesaArasindakiMesafe) * (s1 - odesaDonekstArasindakiMesafe) * (s1 - kievDonekstArasindakiMesafe)));
		
		double s2 = (kievKharkivArasindakiMesafe + kharkivDonekstArasindakiMesafe + kievDonekstArasindakiMesafe) / 2;
		double kievKharkivDonekstAlan = Math.sqrt(s2 * (s2 - kievKharkivArasindakiMesafe) * (s2 - kharkivDonekstArasindakiMesafe) * (s2 - kievDonekstArasindakiMesafe));
		
		double toplamAlan = kievOdesaDonekstAlan + kievKharkivDonekstAlan;
		
		System.out.printf("kiev, kharkiv , donekst, odesa arasindaki toplam alan : %7.3f km dir " , toplamAlan );
		
	}

}
