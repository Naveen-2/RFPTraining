
public class LineComparison {

	public static void main(String[] args) {

		double p1 = 2.0, p2 = 5.0;
		double q1 = 2.0, q2 = 6.0;
		double p3 = 2.0, p4 = 3.0;
		double q3 = 2.0, q4 = 4.0;

		System.out.println("Welcome to Line Comparsion Computation Program on Main Branch");
		double line1 = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
		double line2 = Math.sqrt((p4 - p3) * (p4 - p3) + (q4 - q3) * (q4 - q3));
		System.out.println("Length of first line   = " + line1);
		System.out.println("Length of second line   = " + line2);

		Double length1 = Double.valueOf(line1);
		Double length2 = Double.valueOf(line2);

		if (length1.equals(length2)) {
			System.out.println("Lines 1 and 2 are Equal");
		} else {
			System.out.println("Lines 1 and 2 are NOT Equal");
		}

		if (length1.compareTo(length2) == 0) {
			System.out.println("Line 1 and 2 are of the same length");
		} else if (length1.compareTo(length2) > 0) {
			System.out.println("Length of Line 1 is greater than Line 2");
		} else {
			System.out.println("Length of Line 1 is less than Line 2");
		}
	}
}
