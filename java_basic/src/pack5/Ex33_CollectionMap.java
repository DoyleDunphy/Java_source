package pack5;
//Map : 데이터를 Key 와 Value 로 짝을 이루어 관리하며, Key 값은 중복을 허용하지 않는다
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex33_CollectionMap {  // Map : Key 와 Value 로 구성
	// key 는 중복 불가 value 는 중복 허용
	public static void main(String[] args) {
		HashMap<String, String> mlist = new HashMap<String, String>();
		
		mlist.put("0","하나");
		mlist.put("1","둘");
		mlist.put("2","셋");
		mlist.put("3","셋");
//		mlist.put("3","넷"); err - "3"이 중복됨 (key)
		System.out.println("mlist 크기 : " + mlist.size());
		System.out.println(mlist.containsKey("2"));
		System.out.println(mlist.containsValue("kbs"));
		
		//출력방법1
		Set set = mlist.keySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			String k = (String)iter.next();
			System.out.println(k + " " + mlist.get(k));
		}
		System.out.println();
		//출력방법2
		for(String k:mlist.keySet()) {
			String value = mlist.get(k);
			System.out.println(k + " " + value);
		}
		
	}

}
