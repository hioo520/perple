package damo.util.method.methodType;


import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UtilMD5 {
	public  String MD5(String plainText) {
		byte[] secretBytes = null;
		try {
			secretBytes = MessageDigest.getInstance("md5").digest(
					plainText.getBytes());
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("MD5");
		}
		String md5code = new BigInteger(1, secretBytes).toString(16);
		for (int i = 0; i < 32 - md5code.length(); i++) {
			md5code = "0" + md5code;
		}
		return md5code;
	}

	public static void main(String[] args) {
		System.out.println(new UtilMD5().MD5("123"));
	}

}
