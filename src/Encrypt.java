import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Encrypt {
    //BOILER
    //B
    public static String c1(char n) {
        String s = "";
        switch (n) {
            case 'A':
                s += "B";
                break;
            case 'B':
                s += "C";
                break;
            case 'C':
                s += "D";
                break;
            case 'D':
                s += "E";
                break;
            case 'E':
                s += "F";
                break;
            case 'F':
                s += "G";
                break;
            case 'G':
                s += "H";
                break;
            case 'H':
                s += "I";
                break;
            case 'I':
                s += "J";
                break;
            case 'J':
                s += "K";
                break;
            case 'K':
                s += "L";
                break;
            case 'L':
                s += "M";
                break;
            case 'M':
                s += "N";
                break;
            case 'N':
                s += "O";
                break;
            case 'O':
                s += "P";
                break;
            case 'P':
                s += "Q";
                break;
            case 'Q':
                s += "R";
                break;
            case 'R':
                s += "S";
                break;
            case 'S':
                s += "T";
                break;
            case 'T':
                s += "U";
                break;
            case 'U':
                s += "V";
                break;
            case 'V':
                s += "W";
                break;
            case 'W':
                s += "X";
                break;
            case 'x':
                s += "Y";
                break;
            case 'y':
                s += "Z";
                break;
            case 'z':
                s += "A";
                break;
            default:
                s += n;
        }
        return s;
    }

    //O
    public static String c2(char n) {
        String s = "";
        switch (n) {
            case 'A':
                s += "O";
                break;
            case 'B':
                s += "P";
                break;
            case 'C':
                s += "Q";
                break;
            case 'D':
                s += "R";
                break;
            case 'E':
                s += "S";
                break;
            case 'F':
                s += "T";
                break;
            case 'G':
                s += "U";
                break;
            case 'H':
                s += "V";
                break;
            case 'I':
                s += "W";
                break;
            case 'J':
                s += "X";
                break;
            case 'K':
                s += "Y";
                break;
            case 'L':
                s += "Z";
                break;
            case 'M':
                s += "A";
                break;
            case 'N':
                s += "B";
                break;
            case 'O':
                s += "C";
                break;
            case 'P':
                s += "D";
                break;
            case 'Q':
                s += "E";
                break;
            case 'R':
                s += "F";
                break;
            case 'S':
                s += "G";
                break;
            case 'T':
                s += "H";
                break;
            case 'U':
                s += "I";
                break;
            case 'V':
                s += "J";
                break;
            case 'W':
                s += "K";
                break;
            case 'x':
                s += "L";
                break;
            case 'y':
                s += "M";
                break;
            case 'z':
                s += "N";
                break;
            default:
                s += n;
        }
        return s;
    }

    //I
    public static String c3(char n) {
        String s = "";
        switch (n) {
            case 'A':
                s += "I";
                break;
            case 'B':
                s += "J";
                break;
            case 'C':
                s += "K";
                break;
            case 'D':
                s += "L";
                break;
            case 'E':
                s += "M";
                break;
            case 'F':
                s += "N";
                break;
            case 'G':
                s += "O";
                break;
            case 'H':
                s += "P";
                break;
            case 'I':
                s += "Q";
                break;
            case 'J':
                s += "R";
                break;
            case 'K':
                s += "S";
                break;
            case 'L':
                s += "T";
                break;
            case 'M':
                s += "U";
                break;
            case 'N':
                s += "V";
                break;
            case 'O':
                s += "W";
                break;
            case 'P':
                s += "X";
                break;
            case 'Q':
                s += "Y";
                break;
            case 'R':
                s += "Z";
                break;
            case 'S':
                s += "A";
                break;
            case 'T':
                s += "B";
                break;
            case 'U':
                s += "C";
                break;
            case 'V':
                s += "D";
                break;
            case 'W':
                s += "E";
                break;
            case 'x':
                s += "F";
                break;
            case 'y':
                s += "G";
                break;
            case 'z':
                s += "H";
                break;
            default:
                s += n;
        }
        return s;
    }

    //L
    public static String c4(char n) {
        String s = "";
        switch (n) {
            case 'A':
                s += "L";
                break;
            case 'B':
                s += "M";
                break;
            case 'C':
                s += "N";
                break;
            case 'D':
                s += "O";
                break;
            case 'E':
                s += "P";
                break;
            case 'F':
                s += "Q";
                break;
            case 'G':
                s += "R";
                break;
            case 'H':
                s += "S";
                break;
            case 'I':
                s += "T";
                break;
            case 'J':
                s += "U";
                break;
            case 'K':
                s += "V";
                break;
            case 'L':
                s += "W";
                break;
            case 'M':
                s += "X";
                break;
            case 'N':
                s += "Y";
                break;
            case 'O':
                s += "Z";
                break;
            case 'P':
                s += "A";
                break;
            case 'Q':
                s += "B";
                break;
            case 'R':
                s += "C";
                break;
            case 'S':
                s += "D";
                break;
            case 'T':
                s += "E";
                break;
            case 'U':
                s += "F";
                break;
            case 'V':
                s += "G";
                break;
            case 'W':
                s += "H";
                break;
            case 'x':
                s += "I";
                break;
            case 'y':
                s += "J";
                break;
            case 'z':
                s += "K";
                break;
            default:
                s += n;
        }
        return s;
    }

    //E
    public static String c5(char n) {
        String s = "";
        switch (n) {
            case 'A':
                s += "E";
                break;
            case 'B':
                s += "F";
                break;
            case 'C':
                s += "G";
                break;
            case 'D':
                s += "H";
                break;
            case 'E':
                s += "I";
                break;
            case 'F':
                s += "J";
                break;
            case 'G':
                s += "K";
                break;
            case 'H':
                s += "L";
                break;
            case 'I':
                s += "M";
                break;
            case 'J':
                s += "N";
                break;
            case 'K':
                s += "O";
                break;
            case 'L':
                s += "P";
                break;
            case 'M':
                s += "Q";
                break;
            case 'N':
                s += "R";
                break;
            case 'O':
                s += "S";
                break;
            case 'P':
                s += "T";
                break;
            case 'Q':
                s += "U";
                break;
            case 'R':
                s += "V";
                break;
            case 'S':
                s += "W";
                break;
            case 'T':
                s += "X";
                break;
            case 'U':
                s += "Y";
                break;
            case 'V':
                s += "Z";
                break;
            case 'W':
                s += "A";
                break;
            case 'x':
                s += "B";
                break;
            case 'y':
                s += "C";
                break;
            case 'z':
                s += "D";
                break;
            default:
                s += n;
        }
        return s;
    }

    //R
    public static String c6(char n) {
        String s = "";
        switch (n) {
            case 'A':
                s += "R";
                break;
            case 'B':
                s += "S";
                break;
            case 'C':
                s += "T";
                break;
            case 'D':
                s += "U";
                break;
            case 'E':
                s += "V";
                break;
            case 'F':
                s += "W";
                break;
            case 'G':
                s += "X";
                break;
            case 'H':
                s += "Y";
                break;
            case 'I':
                s += "Z";
                break;
            case 'J':
                s += "A";
                break;
            case 'K':
                s += "B";
                break;
            case 'L':
                s += "C";
                break;
            case 'M':
                s += "D";
                break;
            case 'N':
                s += "E";
                break;
            case 'O':
                s += "F";
                break;
            case 'P':
                s += "G";
                break;
            case 'Q':
                s += "H";
                break;
            case 'R':
                s += "I";
                break;
            case 'S':
                s += "J";
                break;
            case 'T':
                s += "K";
                break;
            case 'U':
                s += "L";
                break;
            case 'V':
                s += "M";
                break;
            case 'W':
                s += "N";
                break;
            case 'x':
                s += "O";
                break;
            case 'y':
                s += "P";
                break;
            case 'z':
                s += "Q";
                break;
            default:
                s += n;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            String str = JOptionPane.showInputDialog(null, "Enter a string", " Encrypt", JOptionPane.QUESTION_MESSAGE);
            if (str != null) {
                String str1 = "";
                String str2 = str.toUpperCase();
                for (int i = 0; i < str2.length(); i++) {
                    switch (i % 6) {
                        case 0:
                            str1 += c1((str2.charAt(i)));
                            break;
                        case 1:
                            str1 += c2(str2.charAt(i));
                            break;
                        case 2:
                            str1 += c3(str2.charAt(i));
                            break;
                        case 3:
                            str1 += c4(str2.charAt(i));
                            break;
                        case 4:
                            str1 += c5(str2.charAt(i));
                            break;
                        case 5:
                            str1 += c6(str2.charAt(i));
                            break;
                    }
                }
                JOptionPane.showMessageDialog(null, str1, "Encrypt",
                        JOptionPane.INFORMATION_MESSAGE);
                int a = JOptionPane.showConfirmDialog(null, "Do you want to continue?",
                        "Encrypt", JOptionPane.YES_NO_OPTION);
                if (a == 1) {
                    flag = false;
                } else {
                    continue;
                }


            } else{
               int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel",
                       "Encrypt",JOptionPane.YES_NO_OPTION);
               if (x == 0) {
                   flag = false;
               } else {
                   continue;
               }
            }
        }
        JOptionPane.showMessageDialog(null, "Thank you for encrypting", "Encrypt",
                JOptionPane.INFORMATION_MESSAGE, null);
        return;
    }
}
