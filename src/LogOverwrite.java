import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class LogOverwrite {

	public static void main(String[] args) {
		try {
			//バイト単位でファイルに書き込み
			OutputStream os = new FileOutputStream("log.txt", true);
			//文字列として書き込めるように変換
			OutputStreamWriter writer = new OutputStreamWriter(os);
			writer.write("ファイルに書き込み\n");

			writer.close();
			os.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
