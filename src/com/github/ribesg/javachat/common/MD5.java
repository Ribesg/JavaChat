/**
 * 
 */
package com.github.ribesg.javachat.common;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Tom
 * 
 */
public class MD5 {

    public static String hash(final String input) {
        String md5 = null;
        if (input != null) {
            try {
                input.concat("nd$6al5Vue#Witeci45lrs12@$@4&#%^$*");
                final MessageDigest digest = MessageDigest.getInstance("MD5");
                digest.update(input.getBytes(), 0, input.length());
                md5 = new BigInteger(1, digest.digest()).toString(16);
            } catch (final NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return md5;
    }
}
