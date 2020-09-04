
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class ReadingKeyContent {
	
	public static PrivateKey getPrivateKey(String filename)
			  throws Exception {

			    byte[] keyBytes = Files.readAllBytes(Paths.get(filename));

			    PKCS8EncodedKeySpec spec =
			      new PKCS8EncodedKeySpec(keyBytes);
			    KeyFactory kf = KeyFactory.getInstance("RSA");
			    return kf.generatePrivate(spec);
			  }
	
	public static PublicKey getPublicKey(String filename)
		    throws Exception {

		    byte[] keyBytes = Files.readAllBytes(Paths.get(filename));

		    X509EncodedKeySpec spec =
		      new X509EncodedKeySpec(keyBytes);
		    KeyFactory kf = KeyFactory.getInstance("RSA");
		    return kf.generatePublic(spec);
		  }
    
    
	public static void main(String[] args) throws Exception {
		
        PrivateKey privKey =getPrivateKey("D:\\KeyFile\\private_key.der");
        PublicKey pubKey =getPublicKey("D:\\KeyFile\\public_key.der");

        System.out.println("private key : "+privKey);
        System.out.println("public key : "+pubKey);
    }
}
