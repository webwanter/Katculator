public class Translation {
    String x;
     String out = transform(x);

    static String transform (String x) {
        //Данный транслятор переводит римские цифры в арабские и наоборот, задаем римские числа от I до C как switch case
        if (x.matches("[A-Z]++")) {
            return switch (x) {
                case "I" -> "1";
                case "XXVI" -> "26";
                case "LI" -> "51";
                case "LXXVI" -> "76";
                case "II" -> "2";
                case "XXVII" -> "27";
                case "LII" -> "52";
                case "LXXVII" -> "77";
                case "III" -> "3";
                case "XXVIII" -> "28";
                case "LIII" -> "53";
                case "LXXVIII" -> "78";
                case "IV" -> "4";
                case "XXIX" -> "29";
                case "LIV" -> "54";
                case "LXXIX" -> "79";
                case "V" -> "5";
                case "XXX" -> "30";
                case "LV" -> "55";
                case "LXXX" -> "80";
                case "VI" -> "6";
                case "XXXI" -> "31";
                case "LVI" -> "56";
                case "LXXXI" -> "81";
                case "VII" -> "7";
                case "XXXII" -> "32";
                case "LVII" -> "57";
                case "LXXXII" -> "82";
                case "VIII" -> "8";
                case "XXXIII" -> "33";
                case "LVIII" -> "58";
                case "LXXXIII" -> "83";
                case "IX" -> "9";
                case "XXXIV" -> "34";
                case "LIX" -> "59";
                case "LXXXIV" -> "84";
                case "X" -> "10";
                case "XXXV" -> "35";
                case "LX" -> "60";
                case "LXXXV" -> "85";
                case "XI" -> "11";
                case "XXXVI" -> "36";
                case "LXI" -> "61";
                case "LXXXVI" -> "86";
                case "XII" -> "12";
                case "XXXVII" -> "37";
                case "LXII" -> "62";
                case "LXXXVII" -> "87";
                case "XIII" -> "13";
                case "XXXVIII" -> "38";
                case "LXIII" -> "63";
                case "LXXXVIII" -> "88";
                case "XIV" -> "14";
                case "XXXIX" -> "39";
                case "LXIV" -> "64";
                case "LXXXIX" -> "89";
                case "XV" -> "15";
                case "XL" -> "40";
                case "LXV" -> "65";
                case "XC" -> "90";
                case "XVI" -> "16";
                case "XLI" -> "41";
                case "LXVI" -> "66";
                case "XCI" -> "91";
                case "XVII" -> "17";
                case "XLII" -> "42";
                case "LXVII" -> "67";
                case "XCII" -> "92";
                case "XVIII" -> "18";
                case "XLIII" -> "43";
                case "LXVIII" -> "68";
                case "XCIII" -> "93";
                case "XIX" -> "19";
                case "XLIV" -> "44";
                case "LXIX" -> "69";
                case "XCIV" -> "94";
                case "XX" -> "20";
                case "XLV" -> "45";
                case "LXX" -> "70";
                case "XCV" -> "95";
                case "XXI" -> "21";
                case "XLVI" -> "46";
                case "LXXI" -> "71";
                case "XCVI" -> "96";
                case "XXII" -> "22";
                case "XLVII" -> "47";
                case "LXXII" -> "72";
                case "XCVII" -> "97";
                case "XXIII" -> "23";
                case "XLVIII" -> "48";
                case "LXXIII" -> "73";
                case "XCVIII" -> "98";
                case "XXIV" -> "24";
                case "XLIX" -> "49";
                case "LXXIV" -> "74";
                case "XCIX" -> "99";
                case "XXV" -> "25";
                case "L" -> "50";
                case "LXXV" -> "75";
                case "C" -> "100";
                default -> "Неверное значение операнда";
            };
        } else return switch (x) {
            // Задаем арабские цифры от 1 до 100
            case "1" ->  "I";
            case "26" ->  "XXVI";
            case "51" ->  "LI";
            case "76" ->  "LXXVI";
            case "2" ->  "II";
            case "27" ->  "XXVII";
            case "52" ->  "LII";
            case "77" ->  "LXXVII";
            case "3" ->  "III";
            case "28" ->  "XXVIII";
            case "53" ->  "LIII";
            case "78" ->  "LXXVIII";
            case "4" ->  "IV";
            case "29" ->  "XXIX";
            case "54" ->  "LIV";
            case "79" ->  "LXXIX";
            case "5" ->  "V";
            case "30" ->  "XXX";
            case "55" ->  "LV";
            case "80" ->  "LXXX";
            case "6" ->  "VI";
            case "31" ->  "XXXI";
            case "56" ->  "LVI";
            case "81" ->  "LXXXI";
            case "7" ->  "VII";
            case "32" ->  "XXXII";
            case "57" ->  "LVII";
            case "82" ->  "LXXXII";
            case "8" ->  "VIII";
            case "33" ->  "XXXIII";
            case "58" ->  "LVIII";
            case "83" ->  "LXXXIII";
            case "9" ->  "IX";
            case "34" ->  "XXXIV";
            case "59" ->  "LIX";
            case "84" ->  "LXXXIV";
            case "10" ->  "X";
            case "35" ->  "XXXV";
            case "60" ->  "LX";
            case "85" ->  "LXXXV";
            case "11" ->  "XI";
            case "36" ->  "XXXVI";
            case "61" ->  "LXI";
            case "86" ->  "LXXXVI";
            case "12" ->  "XII";
            case "37" ->  "XXXVII";
            case "62" ->  "LXII";
            case "87" ->  "LXXXVII";
            case "13" ->  "XIII";
            case "38" ->  "XXXVIII";
            case "63" ->  "LXIII";
            case "88" ->  "LXXXVIII";
            case "14" ->  "XIV";
            case "39" ->  "XXXIX";
            case "64" ->  "LXIV";
            case "89" ->  "LXXXIX";
            case "15" ->  "XV";
            case "40" ->  "XL";
            case "65" ->  "LXV";
            case "90" ->  "XC";
            case "16" ->  "XVI";
            case "41" ->  "XLI";
            case "66" ->  "LXVI";
            case "91" ->  "XCI";
            case "17" ->  "XVII";
            case "42" ->  "XLII";
            case "67" ->  "LXVII";
            case "92" ->  "XCII";
            case "18" ->  "XVIII";
            case "43" ->  "XLIII";
            case "68" ->  "LXVIII";
            case "93" ->  "XCIII";
            case "19" ->  "XIX";
            case "44" ->  "XLIV";
            case "69" ->  "LXIX";
            case "94" ->  "XCIV";
            case "20" ->  "XX";
            case "45" ->  "XLV";
            case "70" ->  "LXX";
            case "95" ->  "XCV";
            case "21" ->  "XXI";
            case "46" ->  "XLVI";
            case "71" ->  "LXXI";
            case "96" ->  "XCVI";
            case "22" ->  "XXII";
            case "47" ->  "XLVII";
            case "72" ->  "LXXII";
            case "97" ->  "XCVII";
            case "23" ->  "XXIII";
            case "48" ->  "XLVIII";
            case "73" ->  "LXXIII";
            case "98" ->  "XCVIII";
            case "24" ->  "XXIV";
            case "49" ->  "XLIX";
            case "74" ->  "LXXIV";
            case "99" ->  "XCIX";
            case "25" ->  "XXV";
            case "50" ->  "L";
            case "75" ->  "LXXV";
            case "100" ->  "C";
            default -> "Неверное значение операнда";
        };
    }
}

