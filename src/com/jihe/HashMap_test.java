package com.jihe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_test {
	public static void main(String[] args) {
		Map hm=new HashMap();
		hm.put("1", "Jack");
		hm.put("2", "Rose");
		hm.put("3", "Luck");
		hm.put("1", "Jack");
		System.out.println(hm);
		
		if(hm.containsKey("1")) {
			System.out.println("双列集合hm包含键1");
			System.out.println("双列集合hm包含键1的值是"+hm.get("1"));
		}
		System.out.println("键对象集合是"+hm.keySet());
		System.out.println("值对象集合是"+hm.values());
		hm.replace("1", "Mary");
		System.out.println(hm);
		hm.remove("1");
		System.out.println(hm);
		Set jianji=hm.keySet();
		Iterator diedai=jianji.iterator();
		while (diedai.hasNext()) {
			Object object=(Object) diedai.next();
			Object key=(Object) diedai.next();
			Object value=hm.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println("遍历键值对输出");
		Set jianzhidui=hm.entrySet();
		Iterator diedai2=jianzhidui.iterator();
		while (diedai2.hasNext()) {
			Map.Entry key_value=(Map.Entry) diedai2.next();
			Object key=key_value.getKey();
			Object value=key_value.getKey();
			System.out.println(key+":"+value);
		}
		System.out.println("foreach遍历集合输出");
		hm.forEach((key,value)->System.out.println(key+":"+value));
		System.out.println("foreach遍历值输出");
		Collection zhiji=hm.values();
		zhiji .forEach(zhi->System.out.println(zhi));
	}
}
