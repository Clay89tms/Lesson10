import javax.xml.parsers.DocumentBuilder;

public class Main {
    public static void main(String[] args) {
        //ЗАДАНИЕ №1
        System.out.println("1) Основное задание");
        String number = "5556-ABc-0289-ddA-1a2b";
        Document.twoString(number);
        Document.stStar2x3(number);
        Document.stLetters(number);
        Document.stBildLetters(number);
        Document.stScreach(number);
        Document.stStart555(number);
        Document.stLast1a2b(number);
        //ЗАДАНИЕ №2
        System.out.println("2) Дополнительное задание");
        String numberRundom = "12диннадцать -5один-7четере-6Шесть-4два";
        Document.screachShortL(numberRundom);
        //ЗАДАНИЕ №3
        System.out.println("3) Дополнительное задание");
        String numberRundom1 = "hellow World";
        Document.dubleLetters(numberRundom1);

    }
}