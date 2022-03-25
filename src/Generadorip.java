
public class Generadorip {

	public static int generarNumero(int min, int max) {
		return (int) (Math.random() * (max - min) + min);
	}

	public static String generarIp() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= 3; i++) {
			sb.append(generarNumero(0, 254));
			sb.append(".");
		}
		sb.append(generarNumero(0, 254));
		return sb.toString();
	}
}
