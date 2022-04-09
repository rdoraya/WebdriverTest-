package MavenDemo;

import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Hex;
import org.testng.Assert;
import org.testng.annotations.Test;

import de.taimos.totp.TOTP;

public class TotpTest {
	@Test
	  public void opt_test() {
		String secretKey = "o3pkjiovi6aaodpg6iy5er7uart7mk3m";
		    String code = getTOTPCode(secretKey);
		    System.out.println(code);
	}

	public static String getTOTPCode(String secretKey) {
	    Base32 base32 = new Base32();
	    byte[] bytes = base32.decode(secretKey.toUpperCase());
	    String hexKey = Hex.encodeHexString(bytes);
	    return TOTP.getOTP(hexKey);
	}

}
