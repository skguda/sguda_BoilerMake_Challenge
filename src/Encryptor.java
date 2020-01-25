import javax.swing.*;
import java.util.Scanner;

public class Encryptor {
    //code = BOILERS
    public static String caesar(String n) {
        String ind = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String m = n.toUpperCase();
        String s = "";
        for (int k = 0; k < ind.length(); k++) {
            for (int j = 0; j < m.length(); j++) {
                switch (j % 7) {
                    //B
                    case 0:
                        if (m.charAt(j) == 'Z') {
                            s += "A";
                        } else if (m.charAt(j) == ind.charAt(k)) {
                            s += ind.charAt(k + 1);
                        }
                        break;
                    case 1:
                        //O
                        switch (m.charAt(j)) {
                            case 'A':
                                s += 'C';
                                break;
                            case 'B':
                                s += 'D';
                                break;
                            case 'C':
                                s += 'E';
                                break;
                            case 'D':
                                s += 'F';
                                break;
                            case 'E':
                                s += 'G';
                                break;
                            case 'F':
                                s += 'H';
                                break;
                            case 'G':
                                s += 'I';
                                break;
                            case 'H':
                                s += 'J';
                                break;
                            case 'I':
                                s += 'K';
                                break;
                            case 'J':
                                s += 'L';
                                break;
                            case 'K':
                                s += 'M';
                                break;
                            case 'L':
                                s += 'N';
                                break;
                            case 'M':
                                s += 'O';
                                break;
                            case 'N':
                                s += 'P';
                                break;
                            case 'O':
                                s += 'Q';
                                break;
                            case 'P':
                                s += 'R';
                                break;
                            case 'Q':
                                s += 'S';
                                break;
                            case 'R':
                                s += 'T';
                                break;
                            case 'S':
                                s += 'U';
                                break;
                            case 'T':
                                s += 'V';
                                break;
                            case 'U':
                                s += 'W';
                                break;
                            case 'V':
                                s += 'X';
                                break;
                            case 'W':
                                s += 'Y';
                                break;
                            case 'X':
                                s += 'Z';
                                break;
                            case 'Y':
                                s += 'A';
                                break;
                            case 'Z':
                                s += 'B';
                                break;
                        }
                        break;
//ABCDEFGHIJKLMNOPQR  STUVWXYZ
                    case 2:
                        //I
                        if (m.charAt(j) == 'S') {
                            s += "A";
                        } else if (m.charAt(j) == 'T') {
                            s += "B";
                        } else if (m.charAt(j) == 'U') {
                            s += "C";
                        } else if (m.charAt(j) == 'V') {
                            s += "D";
                        } else if (m.charAt(j) == 'W') {
                            s += "E";
                        } else if (m.charAt(j) == 'X') {
                            s += "F";
                        } else if (m.charAt(j) == 'Y') {
                            s += "G";
                        } else if (m.charAt(j) == 'Z') {
                            s += "H";
                        } else if (m.charAt(j) == ind.charAt(k)) {
                            s += ind.charAt(k + 8);
                        }
                        break;
//ABCDEFGHIJKLMNO PQRSTUVWXYZ +11 shift
                    case 3:
                        //L
                        if (m.charAt(j) == 'P') {
                            s += "A";
                        } else if (m.charAt(j) == 'Q') {
                            s += "B";
                        } else if (m.charAt(j) == 'R') {
                            s += "C";
                        } else if (m.charAt(j) == 'S') {
                            s += "D";
                        } else if (m.charAt(j) == 'T') {
                            s += "E";
                        } else if (m.charAt(j) == 'U') {
                            s += "F";
                        } else if (m.charAt(j) == 'V') {
                            s += "G";
                        } else if (m.charAt(j) == 'W') {
                            s += "H";
                        } else if (m.charAt(j) == 'X') {
                            s += "I";
                        } else if (m.charAt(j) == 'Y') {
                            s += "J";
                        } else if (m.charAt(j) == 'Z') {
                            s += "K";
                        } else if (m.charAt(j) == ind.charAt(k)) {
                            s += ind.charAt(k + 11);
                        }
                        break;
//ABCDEFGHIJKLMNOPQRSTUV WXYZ
                    case 4:
                        //E
                        if (m.charAt(j) == 'W') {
                            s += "A";
                        } else if (m.charAt(j) == 'X') {
                            s += "B";
                        } else if (m.charAt(j) == 'Y') {
                            s += "C";
                        } else if (m.charAt(j) == 'Z') {
                            s += "D";
                        } else if (m.charAt(j) == ind.charAt(k)) {
                            s += ind.charAt(k + 4);
                        }
                        break;
//ABCDEFGH IJKLMNOPQR STUVWXYZ
                    case 5:
                        //R
                        if (m.charAt(j) == 'A') {
                            s += "R";
                        } else if (m.charAt(j) == 'B') {
                            s += "S";
                        } else if (m.charAt(j) == 'C') {
                            s += "T";
                        } else if (m.charAt(j) == 'D') {
                            s += "U";
                        } else if (m.charAt(j) == 'E') {
                            s += "V";
                        } else if (m.charAt(j) == 'F') {
                            s += "W";
                        } else if (m.charAt(j) == 'G') {
                            s += "X";
                        } else if (m.charAt(j) == 'H') {
                            s += "Y";
                        } else if (m.charAt(j) == 'I') {
                            s += "Z";
                        } else if (m.charAt(j) == ind.charAt(k)) {
                            s += ind.charAt(k - 9);
                        }
                        break;
                    case 6:
                        //S
                        if (m.charAt(j) == 'A') {
                            s += "S";
                        } else if (m.charAt(j) == 'B') {
                            s += "T";
                        } else if (m.charAt(j) == 'C') {
                            s += "U";
                        } else if (m.charAt(j) == 'D') {
                            s += "V";
                        } else if (m.charAt(j) == 'E') {
                            s += "W";
                        } else if (m.charAt(j) == 'F') {
                            s += "X";
                        } else if (m.charAt(j) == 'G') {
                            s += "Y";
                        } else if (m.charAt(j) == 'H') {
                            s += "Z";
                        } else if (m.charAt(j) == ind.charAt(k)) {
                            s += ind.charAt(k - 8);
                        }
                        break;
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = scan.nextLine();
        System.out.println();
        System.out.println();
        System.out.println(caesar(str));
    }
}
