package org.cap10ficheros;

public class BBOBOBOBOBOBO {
    public static void main(String[] args) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String password = "";
        int length = 8;
        for (int i = 0; i < length; i++) {
            password += characters.charAt((int)(Math.random() * characters.length()));
        }
//        System.out.println("Generated password: " + password);
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Generated password: " + generatePassword(8));
//        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Generated password: " + generatePasswordPlus(8, 4));
        }

    }

    public static String generatePassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String password = "";
        for (int i = 0; i < length; i++) {
            password += characters.charAt((int) (Math.random() * characters.length()));
        }
        return password;
    }
    public static String generatePasswordPlus(int length, int num) {
        StringBuilder password = new StringBuilder();
        String numbers = "0123456789";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialChars = "!@#$%^&*()_+[]{}|;:,.<>?";
        String[] charBlocks = new String[64];

        for (int i = 0; i < 64; i++) {
            String aux = "";
            for (int f = 0; f < 4; f++) {
                if ((int) (Math.random() * 4) == 1) {
                    aux += numbers.charAt((int) (Math.random() * numbers.length()));
                } else if ((int) (Math.random() * 4) == 2) {
                    aux += lowerCase.charAt((int) (Math.random() * lowerCase.length()));
                } else if ((int) (Math.random() * 4) == 3) {
                    aux += upperCase.charAt((int) (Math.random() * upperCase.length()));
                } else {
                    aux += specialChars.charAt((int) (Math.random() * specialChars.length()));
                }
            }
            charBlocks[i] = aux;
        }

        String aux = "";

        for (int i = 0; i < num; i++) {
            if (aux.length() < length - 3) {
                aux += charBlocks[(int) (Math.random() * 64)];
            } else {
                if ((int) (Math.random() * 5) == 1) {
                    aux += numbers.charAt((int) (Math.random() * numbers.length()));
                } else if ((int) (Math.random() * 5) == 2) {
                    aux += lowerCase.charAt((int) (Math.random() * lowerCase.length()));
                } else if ((int) (Math.random() * 5) == 3) {
                    aux += upperCase.charAt((int) (Math.random() * upperCase.length()));
                } else {
                    aux += specialChars.charAt((int) (Math.random() * specialChars.length()));

                }
            }
        }
        return aux;
    }

}
