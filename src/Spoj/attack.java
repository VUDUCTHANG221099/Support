package Spoj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;

public class attack {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		InputStream input = new FileInputStream("data/input.txt");
		System.setIn(input);//Đọc file
		Scanner sc = new Scanner(System.in);
		ArrayList<Long> country = new ArrayList<Long>();//Khởi tạo mảng
		int testCase = sc.nextInt();
		for (int i = 0; i < testCase; i++) {
			long countries = sc.nextLong();

			for (int j = 0; j < countries; j++) {
				long number = sc.nextLong();
				country.add(number);
			}

			long max = 0;
			for (int j = 0; j < countries; j++) {
				long sum = 0;
				long country_j = country.get(j);
				for (int l = j + 1; l < countries; l++) {

					if (country_j / 2 < country.get(l)) {
						long equal = min(country_j, country.get(l));
						sum += equal;
						country_j -= equal;
					} else {
						sum += country.get(l);
						country_j += country.get(l);
					}
				}
				if (sum > max) {
					max = sum;
				}
				country_j = country.get(j);
				sum = 0;

				for (int r = j - 1; r >= 0; r--) {
					if (country_j / 2 < country.get(r)) {
						long equal = min(country_j, country.get(r));
						sum += equal;
						country_j -= equal;
					} else {
						sum += country.get(r);
						country_j += country.get(r);
					}
				}
				if (sum > max) {
					max = sum;
				}
			}
			System.out.println("#" + (i + 1) + " " + max);

		}

	}
	static long min(long x, long y) {
		return x>y?y:x;
	}

}
