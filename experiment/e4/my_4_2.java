/*
�붨��һ����ΪCard���˿����࣬����������private����Ȩ�޵��ַ�������face��suit��
face����һ���Ƶ�����ֵ���磺"Ace", "Deuce", "Three","Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"����
suit����һ���ƵĻ�ɫ���磺"Hearts", "Diamonds", "Clubs", "Spades"����
����Card���е�public����Ȩ�޵Ĺ��췽����Ϊ���еı�����ֵ��
����protected����Ȩ�޵ķ���getFace()���õ��˿��Ƶ�����ֵ;
����protected����Ȩ�޵ķ���getSuit()���õ��˿��ƵĻ�ɫ;
���巽��toString()�����ر�ʾ�˿��ƵĻ�ɫ������ֵ�ַ������硰Ace of Hearts������Ten of Clubs���ȣ���
*/
package experiment;

class Card {
    private String face, suit;//��ֵ����ɫ

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
