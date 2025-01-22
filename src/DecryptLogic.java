import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class DecryptLogic {

    public static void main(String[] args) {
        int[] asciiValues = {48,-126,2,119,2,1,0,48,13,6,9,42,-122,72,-122,-9,13,1,1,1,5,0,4,-126,2,97,48,-126,2,93,2,1,0,2,-127,-127,0,-91,-91,97,-53,50,-22,-20,-41,-101,90,123,68,48,71,84,74,-120,73,-21,35,14,-16,-73,-56,126,-26,96,104,-97,-123,40,-112,116,86,65,-5,26,-25,104,6,-77,-79,115,-26,97,-27,-49,-126,14,51,51,-54,89,21,-52,-73,84,-114,-17,63,86,63,48,1,-123,115,-24,-60,-5,104,28,-72,-53,127,-65,105,-51,50,-14,-80,-117,-42,-128,-111,86,-91,39,110,-22,-48,-3,80,-2,-121,2,5,-47,-109,94,58,92,75,-67,66,12,95,89,-111,58,-102,-11,-105,-36,107,-30,98,-7,-72,118,14,-16,-113,-23,12,-26,-13,-101,-15,2,3,1,0,1,2,-127,-127,0,-112,87,112,-60,52,118,106,51,-26,-8,13,121,-7,-25,-18,23,-108,115,117,38,115,-102,103,75,-102,-24,-3,17,-82,15,-58,-83,57,-13,0,67,-29,-55,-55,-24,45,37,112,-83,76,-103,-119,28,-9,106,-66,-78,-112,-74,98,81,78,-87,-50,-23,14,42,-71,-108,-14,68,-47,-84,45,-122,112,43,38,94,-72,-86,-108,103,-12,-7,-115,49,30,-32,-99,-77,-65,-80,-86,-55,19,-103,65,56,48,105,76,-88,26,-36,83,-98,-42,-13,30,-84,96,-21,-120,58,-63,-106,104,96,24,-28,49,43,67,-15,-43,99,-45,16,-95,-7,-9,17,2,65,0,-38,-127,-48,11,0,81,-112,114,-23,118,1,84,-50,-67,-61,-51,71,-15,62,11,-44,-42,-123,114,31,61,-39,41,-102,108,-54,-63,95,76,-42,-26,126,62,99,-69,105,39,77,36,119,-21,-49,-46,-75,-11,78,75,-62,16,-9,-111,53,66,-69,45,-56,98,-82,-29,2,65,0,-62,17,-107,101,85,27,-117,7,84,22,-97,9,-88,37,15,-64,-67,10,-4,121,-71,77,65,58,-13,95,-90,-101,-30,121,34,-116,-21,31,-84,-88,107,39,-119,8,-68,-72,15,47,-59,-81,-79,-4,30,33,-53,-102,-124,52,49,116,116,-109,13,-45,-79,86,78,27,2,64,113,14,91,-117,101,-91,-50,28,118,-55,20,-43,65,-121,20,41,65,-63,3,126,113,-88,113,49,100,18,-57,42,-20,120,-65,-53,-97,-72,-115,52,-125,59,90,-76,-36,42,118,-110,-104,-19,-51,0,-44,30,-47,93,7,83,106,20,-102,-65,37,68,1,-5,117,75,2,64,2,-1,-20,-108,61,101,-120,-105,-101,104,34,27,47,27,43,-116,42,31,-30,89,43,81,19,98,10,-30,-2,-101,72,59,-31,25,-42,-124,-115,-47,-88,-98,90,-46,-28,-65,-33,-108,56,117,7,-58,66,-36,-8,-35,-79,-113,112,-8,64,-39,9,12,-83,-96,12,-29,2,65,0,-99,-90,-38,-33,-59,-59,22,-56,-112,-13,-62,-35,20,-104,-33,-84,105,-31,-104,-107,-110,-107,-36,-66,-123,-52,110,-109,-11,43,-60,62,79,83,-64,95,18,-101,2,-71,21,-90,-128,111,-106,69,-61,111,95,113,125,-98,99,51,81,1,46,36,-71,96,-17,-84,50,-51};
        StringBuilder stringBuilder = new StringBuilder();
        for (int ascii : asciiValues) {
            stringBuilder.append((char) ascii);
        }

        String result = stringBuilder.toString();
        System.out.println("Converted String: " + result);

    }



//    public static void main(String[] args) {
//        String hexString = "30 82 02 78 02 01 00 30 0d 06 09 2a 86 48 86 f7 0d 01 01 01 05 00 04 82 02 62 30 82 02 5e 02 01 00 02 81 81 00 ec 39 4c 57 5c 29 d2 91 6b 85 ae e4 fc 6e e6 cf 84 59 b2 a9 0a e5 bc 42 7a bb e2 fd 97 ee 49 55 55 37 48 3d 69 2b ab 4a 3d 0d df 0d 7c 54 3f 5b bb 2b 97 3f d4 c6 8e 06 cb 04 a5 f8 fb 82 50 9d 85 a5 e3 95 65 d1 3d e7 61 a5 68 cf 52 6b 03 b2 45 3b b0 f6 1d 7e d9 43 e2 d0 a4 0b 5b 6a 75 ff 00 4f 29 b4 5c 3b fa ad 2a d2 2b e4 79 ed f2 85 f1 30 fb 63 c5 a1 31 c1 05 97 b9 0d ce 92 a2 65 02 03 01 00 01 02 81 81 00 8c 58 8a 93 c8 ad 0c 6e db 9c 04 4a 05 f4 79 eb 46 ed e7 e8 e9 11 8f 25 4c 38 3e e7 7e 11 d3 be 00 30 25 1a 5f 56 d3 a0 fa df 37 eb 92 37 97 a1 0f 76 19 99 91 f8 19 bf cd 74 c8 8b 42 1a ad 7b 95 04 63 a8 63 37 87 4d a2 f5 4c 67 69 0d b2 0a 25 70 28 56 28 c6 0e 37 8a 2b 22 e6 3b 7d 71 4f ed 6f 4a 9c 7e 66 45 3d 53 b6 ec 80 c1 b0 0e 18 07 fb f1 3d a1 7a cf 74 18 88 83 14 65 b0 73 61 02 41 00 f9 48 f0 6e 23 f8 7f e4 eb eb 20 b0 a2 f7 bd 4b 17 c4 d6 a2 b2 16 fa 11 9c ea d8 38 7a 98 b5 d1 fc 4d 15 d1 8a 27 69 dd da 2c 87 fb 62 b8 68 1a 11 1c 99 d2 19 00 d2 62 58 f1 a9 72 a1 3c 70 29 02 41 00 f2 96 4a 45 18 19 03 67 9c 3a cb a2 ce d8 09 e2 3d 78 c2 d0 04 33 6e 92 f3 a9 c3 0e a5 7d bd 7b fe 2e 74 ee 2b 24 a1 4d 47 cb b9 e9 60 f2 26 b7 13 94 60 59 54 ae 18 2c 3a 05 5d 36 fc 85 37 dd 02 41 00 de e2 1c 36 1d eb 3d 4e 8c b0 f9 d5 74 a0 54 9b 23 71 57 06 b8 7c 5a b2 0c be dc fc 02 81 2f 6f c4 49 97 cc 75 dd af 86 30 5f c8 65 37 6a f1 88 fc eb b9 8c 63 d6 9c 44 5a 8a 17 9a ea 16 83 a1 02 41 00 bb 86 de a7 06 f7 df 1f eb 2f b0 57 8d 1a 88 99 71 f7 b6 71 63 ad f6 9e 76 ea 16 b5 6d cd 03 fb a4 04 79 b3 db 7a 17 8f 4c 1e fa fa a4 4c cd 0c dd 7f e7 f3 66 78 a6 8b 19 d7 27 b5 e8 03 7b a9 02 40 07 89 48 38 c0 7c b3 ff f2 b5 1a 06 2d 67 11 a6 ba 84 89 66 05 f7 e7 5c 4e b5 1b 0a 51 c1 a9 3e 62 70 9b c3 24 dd 5a 70 ce 0b b3 f9 77 c6 73 82 98 76 31 70 a2 88 ea c1 ba 2b 12 5a 30 e4 cb 27\n";
//        byte[] byteArray = hexStringToByteArray(hexString);
//
//        try (InputStream inStream = new ByteArrayInputStream(byteArray)) {
//            CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
//            X509Certificate cert = (X509Certificate) certFactory.generateCertificate(inStream);
//
//            // Print certificate details
//            System.out.println("Subject: " + cert.getSubjectDN());
//            System.out.println("Issuer: " + cert.getIssuerDN());
//            System.out.println("Serial Number: " + cert.getSerialNumber());
//            System.out.println("Valid From: " + cert.getNotBefore());
//            System.out.println("Valid Until: " + cert.getNotAfter());
//            System.out.println("Public Key: " + cert.getPublicKey());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static byte[] hexStringToByteArray(String s) {
//        int len = s.length();
//        byte[] data = new byte[len / 2];
//        for (int i = 0; i < len; i += 2) {
//            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
//                    + Character.digit(s.charAt(i+1), 16));
//        }
//        return data;
//    }

}
