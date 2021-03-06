package my.examples.javaexam;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
/**
 * Created by cjswo9207u@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */
public class CollectionTest03 {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        map.put("001", "둘리");
        map.put("002", "도우너");
        map.put("003", "또치");

        System.out.println(map.get("002"));
        System.out.println(map.get("004"));

        //모든 Key들을 출력하시오.

        for(String i : map.keySet()){
            System.out.println(i);
            System.out.println(map.get(i));
        }

        Set<String> keys = map.keySet();
        Iterator<String> keyIter = keys.iterator();
        while(keyIter.hasNext()){
            String key = keyIter.next();
            System.out.println(key + " : " + map.get(key));
        }
    }
}
