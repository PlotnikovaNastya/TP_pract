package com.company;
import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
public class block5_z8 {
    public static void task8() throws NoSuchAlgorithmException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        System.out.println("Безопасный хеш " + sha256(str));
    }

    public static String sha256(String base) throws NoSuchAlgorithmException {//необходимо для работы хэш-функции
            MessageDigest digest = MessageDigest.getInstance("SHA-256");//криптографическая хеш-функция
            byte[]hash = digest.digest(base.getBytes(StandardCharsets.UTF_8));//экземляр для расчета
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);//перевод строки в инт в базу 16
                if(hex.length() == 1) hexString.append('0');//добавление начального 0 в байт
                hexString.append(hex);
            }
            return hexString.toString();
    }
}
