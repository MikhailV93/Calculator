public class Result_with_numbers_roman {
    String Result_of_operations(int a, int b, String text){
        First_number_roman i = new First_number_roman();
        char t = text.charAt(i.Number_of_first_space_roman(text) + 1);
        int y = 0;
        if (t == '+') {
            y = a + b;
        }
        if (t == '-') {
            y = a - b;
        }
        if (t == '*') {
            y = a * b;
        }
        if (t == '/') {
            y = a / b;
        }
        switch (y){
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            case 10: return "X";
            case 11: return "XI";
            case 12: return "XII";
            case 13: return "XIII";
            case 14: return "XIV";
            case 15: return "XV";
            case 16: return "XVI";
            case 17: return "XVII";
            case 18: return "XVIII";
            case 19: return "XIX";
            case 20: return "XX";
            case 21: return "XXI";
            case 24: return "XXIV";
            case 25: return "XXV";
            case 27: return "XXVII";
            case 28: return "XXVIII";
            case 30: return "XXX";
            case 32: return "XXXII";
            case 35: return "XXXV";
            case 36: return "XXXVI";
            case 40: return "XL";
            case 42: return "XLII";
            case 45: return "XLV";
            case 48: return "XLVIII";
            case 50: return "L";
            case 54: return "LIV";
            case 56: return "LVI";
            case 60: return "LX";
            case 64: return "LXIV";
            case 70: return "LXX";
            case 72: return "LXXII";
            case 80: return "LXXX";
            case 81: return "LXXXI";
            case 90: return "XC";
            case 100: return "C";
        }
        return "";
    }

}

