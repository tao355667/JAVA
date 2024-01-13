package end_of_term.p5;
/*使用EntrySet遍历hashmap*/
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapChangeCollectionExample {
    public static void main(String[] args) {
        // 使用泛型HashMap集合
        HashMap<Integer, String> hm = new HashMap<>();
        // 添加数据，key-value键值对形式
        hm.put(1, "北京");
        hm.put(2, "上海");
        hm.put(3, "武汉");
        hm.put(4, "重庆");
        hm.put(5, "成都");
        hm.put(null, null);
        //使用entrySet()方法获取Entry键值对集合
        Set<Entry<Integer, String>> set = hm.entrySet();
        System.out.println("所有Entry：");
        for (Entry<Integer, String> entry : set) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("------------------------");
        //使用keySet()方法获取所有键的集合
        Set<Integer> keySet = hm.keySet();
        System.out.println("所有key：");
        for (Integer key : keySet) {
            System.out.println(key);
        }
        System.out.println("------------------------");
        //使用values()方法获取所有值的集合
        Collection<String> valueSet = hm.values();
        System.out.println("所有value：");
        for (String value : valueSet) {
            System.out.println(value);
        }
    }
}

