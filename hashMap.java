import java.util.HashMap;
import java.util.Map;

class hashMap{
    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();
        map.put("kunal",20);
        map.put("maity",21);
        map.put("kiran",23);   

        System.out.println(map.get("kunal"));
        
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }
    }
}