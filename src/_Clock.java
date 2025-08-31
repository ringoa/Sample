
public class _Clock {

	public static void main(String[] args) {
		System.out.println(getSeconds(6, 50, 30));
	}

	public static int getSeconds( int hour, int minute, int second) {
		int elapsedSconds = hour * 60 * 60 + minute * 60 + second;
		return elapsedSconds;
	}

}
