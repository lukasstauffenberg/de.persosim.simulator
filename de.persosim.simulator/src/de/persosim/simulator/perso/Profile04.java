package de.persosim.simulator.perso;

import de.persosim.simulator.crypto.CryptoUtil;
import de.persosim.simulator.utils.HexString;

/**
 * @author slutters
 *
 */
public class Profile04 extends AbstractProfile {
	
	@Override
	public void setPersoDataContainer() {
		persoDataContainer = PersonalizationDataContainer.getDefaultContainer();
		persoDataContainer.setDg3PlainData("20161031");
		persoDataContainer.setDg4PlainData("---");
		persoDataContainer.setDg5PlainData("ĆOSIĆ");
		persoDataContainer.setDg8PlainData("199409  ");
		persoDataContainer.setDg9PlainData("PRIŠTINA");
		persoDataContainer.setDg17StreetPlainData("F4 14-15");
		persoDataContainer.setDg17CityPlainData("MANNHEIM");
		persoDataContainer.setDg17CountryPlainData("D");
		persoDataContainer.setDg17ZipPlainData("68159");
		persoDataContainer.setDg18PlainData("02760802220000");
		
		String documentNumber = "000000004";
		String sex = "M";
		String mrzLine3 = "COSIC<<<<<<<<<<<<<<<<<<<<<<<<<";
		String mrz = persoDataContainer.createMrzFromDgs(documentNumber, sex, mrzLine3);
		
		persoDataContainer.setMrz(mrz);
		persoDataContainer.setEpassDg1PlainData(mrz);
		
		// unprivileged CA key
		persoDataContainer.addCaKeyPair(CryptoUtil.reconstructKeyPair(13,
				HexString.toByteArray("0419D4B7447788B0E1993DB35500999627E739A4E5E35F02D8FB07D6122E76567F17758D7A3AA6943EF23E5E2909B3E8B31BFAA4544C2CBF1FB487F31FF239C8F8"),
				HexString.toByteArray("A07EB62E891DAA84643E0AFCC1AF006891B669B8F51E379477DBEAB8C987A610")),
				41, false);
		
		// privileged CA key
		persoDataContainer.addCaKeyPair(CryptoUtil.reconstructKeyPair(13,
				HexString.toByteArray("0472E84F60AD1D8F7431DF4F4E49EBCEC897D5FE39381267802A28233F8959F2C1A0459DB30BE8CDC5AB443A61C4FFBC79943C5F0D32ABBFD2E66D756639576060"),
				HexString.toByteArray("7B443FADB6E2A735914EC308979CAF5F0EC3A019615CB12D161DD7816D72D7B0")),
				45, true);

		// individual RI key
		persoDataContainer.addRiKeyPair(CryptoUtil.reconstructKeyPair(13,
				HexString.toByteArray("04257131EA63835D50735F45037D3251BC3A47BD2234216898792170CC4ACFCD3057A563C300CC99C10E901CF79DCAB626FF20C30C3C09E70450576CAE09025266"),
				HexString.toByteArray("5B2170BC81163855041D17AB2EE3C167716DA70EC48BD83DD55BBA46E75C02EF")),
				1);

		// individual RI key (Pseudonym)
		persoDataContainer.addRiKeyPair(CryptoUtil.reconstructKeyPair(13,
				HexString.toByteArray("0448B6B44C1C43DD1EEC3C67D9F5D97386C806D36ED3489BED9266B6A87A50738C7829FB12B01AD2520C3BD291CAA83BF2A9F7055BA6F8BF26F03489E8677F1CDD"),
				HexString.toByteArray("11F99A043EBD4FAA63D01DBD6A805BE31AAFDA720F03427B09AF318D71542460")),
				2);
	}

}
