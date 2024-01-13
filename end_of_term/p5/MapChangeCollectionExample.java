package end_of_term.p5;
/*ʹ��EntrySet����hashmap*/
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapChangeCollectionExample {
    public static void main(String[] args) {
        // ʹ�÷���HashMap����
        HashMap<Integer, String> hm = new HashMap<>();
        // ������ݣ�key-value��ֵ����ʽ
        hm.put(1, "����");
        hm.put(2, "�Ϻ�");
        hm.put(3, "�人");
        hm.put(4, "����");
        hm.put(5, "�ɶ�");
        hm.put(null, null);
        //ʹ��entrySet()������ȡEntry��ֵ�Լ���
        Set<Entry<Integer, String>> set = hm.entrySet();
        System.out.println("����Entry��");
        for (Entry<Integer, String> entry : set) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("------------------------");
        //ʹ��keySet()������ȡ���м��ļ���
        Set<Integer> keySet = hm.keySet();
        System.out.println("����key��");
        for (Integer key : keySet) {
            System.out.println(key);
        }
        System.out.println("------------------------");
        //ʹ��values()������ȡ����ֵ�ļ���
        Collection<String> valueSet = hm.values();
        System.out.println("����value��");
        for (String value : valueSet) {
            System.out.println(value);
        }
    }
}

