package de.persosim.simulator.perso;

import de.persosim.simulator.crypto.CryptoUtil;
import de.persosim.simulator.utils.HexString;

/**
 * @author slutters
 *
 */
public class DefaultPersoTestPkiTemplate10Bdr extends DefaultPersoTestPkiTemplate {
	
	@Override
	public void setPersoDataContainer() {
		persoDataContainer = new PersonalizationDataDefaultContainer();
		persoDataContainer.setDg4PlainData("GHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGHGH");
		persoDataContainer.setDg5PlainData("CDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCDCD");
		persoDataContainer.setDg6PlainData("STSTSTSTSTSTSTSTSTSTSTSTSTSTSTSTSTSTSTSTSTSTSTSTSTSTSTSTSTST");
		persoDataContainer.setDg7PlainData("ABABABABABABABABABABABABABABABABABABABAB");
		persoDataContainer.setDg8PlainData("18990502");
		persoDataContainer.setDg9PlainData("IJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJIJ");
		persoDataContainer.setDg11PlainData("M");
		persoDataContainer.setDg13PlainData("EFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFEFE");
		persoDataContainer.setDg17StreetPlainData("OPOPOPOPOPOPOPOPOPOPOPOPOPOPOPOPOPOPOPOPOPOPOPOPOP");
		persoDataContainer.setDg17CityPlainData("MNMNMNMNMNMNMNMNMNMNMNMNMNMNMNMNMNMNMNMNMNMN");
		persoDataContainer.setDg17CountryPlainData("D");
		persoDataContainer.setDg17ZipPlainData("12345");
		persoDataContainer.setDg18PlainData("02761100000000");
		persoDataContainer.setDocumentNumber("000000010");
		persoDataContainer.setMrzLine3Of3("CDCDCDCDCDCDCD<<GHGHGHGHGHGHGH");
		
		// unprivileged CA key
		persoDataContainer.addCaKeyPair(CryptoUtil.reconstructKeyPair(13,
				HexString.toByteArray("0467DBFBD14C3291267FEFF537062570B96BE2274D7747D734BBDB5BFEAAD0976C3E47B929F42B1FCD583F80FB469225E29FE00AC6C95C24E956CB8E7031C19AC2"),
				HexString.toByteArray("8910074CF4749A916E5864654C768D57F57B6361F70A226DD1AEBED390BB066D")),
				41);
		
		// privileged CA key
		persoDataContainer.addCaKeyPair(CryptoUtil.reconstructKeyPair(13,
				HexString.toByteArray("048C656C86F0B0004E5EA6F52406AA52BC21C9381AC9A5DDD537F84DB57A87C68E47295D1972527CEE286F896827DFC063EE75B216FB14F81CF55D0477FF9180B3"),
				HexString.toByteArray("8BBDA6A3F8EFE7BEB68C28434A3B5E36D866A6C6E4F8A162DECB02D778A21A90")),
				45);
	}

}
