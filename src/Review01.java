
public class Review01 {

	public static void main(String[] args) {
		int value = 100;
		int tax = tax(value);
		int valuePlusTax = value + tax;
		System.out.println(value + "円の商品の税込価格は" + valuePlusTax + "円(消費税は" + tax + "円)です");
	}

	public static int tax(int value) {
		double taxRate = 0.1;
		int tax = (int)Math.floor(value * taxRate);
		return tax;
	}
}
