import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {

	public static void main(String[] args) {
		try {
			BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("名前を入力してください");
			String str = key.readLine();
			System.out.println("入力された名前：" + str);
		} catch (IOException e){
			e.printStackTrace();
		}
	}

}
