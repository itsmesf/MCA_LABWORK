package LMS;

import java.util.Scanner;

public class CaesarCipherEncrypt {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );
        System.out.print("Enter the key: " );
        int key = input.nextInt ();
        input.nextLine ();

        System.out.print("Enter text to be encrypted using Caesar Cipher: " );
        String PlainText = input.nextLine ( );

        System.out.println("Forward Ciphered Text: " + ForwardCaesarCipherNew( key, PlainText ));
        System.out.println("Forward Ciphered Text: " + ForwardCaesarCipher( key, PlainText ));
        System.out.println("Backward Ciphered Text: " + BackwardCaesarCipher( key, PlainText ));
    }

    private static String BackwardCaesarCipher(int key, String PlainText) {
        String CipherText = "";

        for (int i = 0; i < PlainText.length ( ); i++) {
            char Char = PlainText.charAt ( i );

            if ((Char>='A' && Char<='Z') || Char>='a' && Char<='z') {
                int charAscii = Char;
                charAscii -= key;
                if ((charAscii < 65) || (charAscii > 90 && charAscii < 97)) {
                    charAscii += 26;
                }
                CipherText+=(char) charAscii;
            } else{
                CipherText += Char;
            }
        }

        return CipherText;

    }

    private static StringBuffer ForwardCaesarCipher(int key, String PlainText) {
        StringBuffer CipherText = new StringBuffer (  );

        for (int i = 0; i < PlainText.length ( ); i++) {
            char Char = PlainText.charAt ( i );

            if ((Char>='A' && Char<='Z') || Char>='a' && Char<='z') {
                int charAscii = Char;
                charAscii += key;
                if ((charAscii >122 ) || (charAscii > 90 && charAscii < 97)) {
                    charAscii -= 26;
                }
                CipherText.append ( (char)charAscii);
            } else{
                CipherText.append ( Char );
            }
        }

        return CipherText;

    }

    private static StringBuffer ForwardCaesarCipherNew(int key, String PlainText){
        StringBuffer CipherText = new StringBuffer (  );

        for (int i = 0; i < PlainText.length ( ); i++) {
            char Char = PlainText.charAt ( i );

            if (Character.isLetter ( Char )) {
                int charAscii = Char;
                charAscii += key;

                if(Character.isUpperCase ( Char )){
                    if(charAscii>90){
                        charAscii-=26;
                    }
                }
                else if(Character.isLowerCase ( Char )) {
                    if ((charAscii > 122)) {
                        charAscii -= 26;
                    }
                }

                CipherText.append ( (char) charAscii);

            } else{
                CipherText.append ( Char );
            }
        }

        return CipherText;
    }
}
