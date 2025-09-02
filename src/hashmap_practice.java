import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class hashmap_practice {

	public static void main(String[] args) {
		HashMap<String, Integer> students = new HashMap<String, Integer>();

		//データを追加する
		students.put("Alice", 85);
		students.put("Bob", 92);
		students.put("Carol", 78);
		//データを表示する
		System.out.println(students.get("Alice"));
		System.out.println(students.get("Bob"));
		System.out.println(students.get("Carol"));

		HashMap<String, Integer> cart = new HashMap<String, Integer>();

		cart.put("apple", 3);
		cart.put("banana", 2);
		cart.put("orange", 5);

		System.out.println(cart.get("banana"));
		cart.remove("orange");

		HashMap<String, Integer> fruitsCount = new HashMap<String, Integer>();

		//中身をいれたリストを作成
		ArrayList<String> fruits = new ArrayList<String>(
				Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple")
			);

		for (String fruit : fruits){
			if(fruitsCount.containsKey(fruit)) {
				int preCount =  fruitsCount.get(fruit);
				fruitsCount.put(fruit, preCount + 1);
			} else {
				fruitsCount.put(fruit, 1);
			}
		}
		System.out.println("フルーツのカウント：" + fruitsCount);
	}
}
