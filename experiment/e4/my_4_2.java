/*
请定义一个名为Card的扑克牌类，该类有两个private访问权限的字符串变量face和suit：
face描述一张牌的牌面值（如："Ace", "Deuce", "Three","Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"）；
suit描述一张牌的花色（如："Hearts", "Diamonds", "Clubs", "Spades"）。
定义Card类中的public访问权限的构造方法，为类中的变量赋值；
定义protected访问权限的方法getFace()，得到扑克牌的牌面值;
定义protected访问权限的方法getSuit()，得到扑克牌的花色;
定义方法toString()，返回表示扑克牌的花色和牌面值字符串（如“Ace of Hearts”、“Ten of Clubs”等）。
*/
package experiment;

class Card {
    private String face, suit;//面值，花色

    public Card() {
        face = "null";
        suit = "null";
    }

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    protected String getFace() {
        return face;
    }

    protected String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return face+" of "+suit;
    }
}

public class my_4_2 {
    public static void main(String[] args) {
        Card c1=new Card();
        Card c2=new Card("Ace","Hearts");
        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }
}
