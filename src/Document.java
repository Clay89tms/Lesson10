import java.util.Locale;

public class Document {
    String st = "";


    public Document() {
    }

    public Document(String st) {
        this.st = st;
    }

    public static void twoString(String st) {
        String[] stmas = st.split("-");
        System.out.println("2 первых блока по 4 цыфры: " + stmas[0] + " " + stmas[2]);
    }

    public static void stStar2x3(String st) {
        System.out.println(st.replaceAll("[a-zA-Z]{3}", "***"));
    }

    public static void stLetters(String st) {
        System.out.println(st.replaceAll("[0-9]", "-")
                .replaceAll("-----", "")
                .strip().replaceAll("-", "/")
                .replaceAll("//", "/")
                .toLowerCase());
    }

    public static void stBildLetters(String st) {
        StringBuilder stBL = new StringBuilder(st);
        stBL.replace(0, 5, "") //обрезка 5556-
                .replace(3, 9, "/") //замена -0289- на /
                .replace(7, 9, "/") //замена -1 на /
                .replace(9, 10, "/") //замена 2 на /
                .insert(0, "Letters: "); // вставили вначало текст Letters:
        String stN = new String(stBL);
        System.out.println(stN);
    }

    public static void stScreach(String st) {
        if (st.contains("abc") || st.contains("ABC")) {
            System.out.println("В строке присутствует последовательность abc(ABC)!");
        } else {
            System.out.println("Отсутствует последовательность abc(ABC)!");
        }
    }

    public static void stStart555(String st) {
        if (st.startsWith("555", 0)) {
            System.out.println("Строка начинается с 555!!!");
        } else {
            System.out.println("Строка НЕ начинается с 555...");
        }
    }

    public static void stLast1a2b(String st) {
        StringBuilder stN = new StringBuilder(st);
        stN.reverse();
        String stN1 = new String(stN);
        if (stN1.startsWith("b2a1", 0)) {
            System.out.println("Строка заканчивается на 1a2b!");
        } else {
            System.out.println("Строка НЕ заканчивается на 1a2b");
        }
    }

    public static void screachShortL(String st) {
        String[] masSL = st.split("-");
        for (int i = 0; i < masSL.length; i++) {
            masSL[i] = masSL[i].strip();
        }
        System.out.println(masSL.length);
        for (int i = 1; i < masSL.length; i++) {
            for (int j = 1; j < masSL.length - 1; j++) {
                if (masSL[j - 1].length() > masSL[i].length()) {
                    String n = masSL[i - 1]; // больше
                    masSL[i - 1] = masSL[i];
                    masSL[i] = n;
                }
            }
        }
        System.out.println("Самое короткое слово: " + masSL[0]);
        System.out.println("Самое Длинное слово: " + (masSL[masSL.length - 1]));
    }

    public static void dubleLetters(String st) {
        StringBuilder str = new StringBuilder(st);
        str.append(str);
        System.out.println(str);
        for (int i = 0; i<str.length()-1; i++){
//            str.append(a);
        }
        System.out.println(str);
    }

    public void stStar() {
        String[] stmas = st.split("-");
        for (int i = 0; i < stmas.length; i++) {
            String[] chMas = stmas[i].split("");
            stmas[i] = "";
            for (int j = 0; j < chMas.length; j++) {

                if (!(chMas[j].toUpperCase(Locale.ROOT)).equals(chMas[j].toLowerCase(Locale.ROOT))) {
                    stmas[i] += "*";
                } else {
                    stmas[i] += chMas[j];
                }
            }
        }
        System.out.print(String.join("-", stmas[0], stmas[1], stmas[2], stmas[3], stmas[4]));
    }
}

