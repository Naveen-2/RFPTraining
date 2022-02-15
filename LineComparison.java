
public class LineComparison {

	public static void main(String[] args) {

		double p1 = 2.0, p2 = 5.0;
		double q1 = 2.0, q2 = 6.0;
		double p3 = 2.0, p4 = 3.0;
		double q3 = 2.0, q4 = 4.0;
		double p5 = 3.0, q5 = 9.0;
		double p6 = 4.0, q6 = 12.0;

		System.out.println("Welcome to Line Comparsion Computation Program on Main Branch");
		double line1 = Math.sqrt(Math.pow((p2 - p1),2) + Math.pow((q2 - q1),2));
		double line2 = Math.sqrt(Math.pow((p4 - p3),2) + Math.pow((q4 - q3),2));
		double line3 = Math.sqrt(Math.pow((p6 - p5),2) + Math.pow((q6 - q5),2));
		System.out.println("Length of first line   = " + line1);
		System.out.println("Length of second line   = " + line2);
		System.out.println("Length of third line   = " + line3);

		Double length1 = Double.valueOf(line1);
		Double length2 = Double.valueOf(line2);
		Double length3 = Double.valueOf(line3);

		if (length1.equals(length2)) {
			System.out.println("Lines 1 and 2 are Equal");
		} else {
			System.out.println("Lines 1 and 2 are NOT Equal");
		}

		if (length2.equals(length3)) {
			System.out.println("Line 2 and 3 are Equal");
		} else {
			System.out.println("Line 2 and 3 are NOT Equal");
		}

		if (length1.compareTo(length3) == 0) {
			System.out.println("Line 1 and 3 are of the same length");
		} else if (length1.compareTo(length3) > 0) {
			System.out.println("Length of Line 1 is greater than Line 3");
		} else {
			System.out.println("Length of Line 1 is less than Line 3");
		}
	}
}
