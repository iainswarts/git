import java.util.ArrayList;

public class Problem29 {

	static class Doubles {
		int base, index;

		public Doubles(int b, int i) {
			// TODO Auto-generated constructor stub
			index = i;
			base = b;
		}

		public int getIndex() {
			return index;
		}

		public int getBase() {
			return base;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		public void setBase(int base) {
			this.base = base;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof Doubles))
				return false;
			if (obj == this)
				return true;

			Doubles d = (Doubles) obj;

			if (d.base == this.base && d.index == this.index)
				return true;
			else
				return false;


		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Doubles> list = new ArrayList<Doubles>();

		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {

				// i to the power of j
				Doubles current = new Doubles(i,j);

				switch (current.base) {
				case 4:
					current.base = 2;
					current.index = j * 2;
					break;
				case 8:
					current.base = 2;
					current.index = j * 3;
					break;
				case 9:
					current.base = 3;
					current.index = j * 2;
					break;
				case 16:
					current.base = 2;
					current.index = j * 4;
					break;
				case 25:
					current.base = 5;
					current.index = j * 2;
					break;
				case 27:
					current.base = 3;
					current.index = j * 3;
					break;
				case 32:
					current.base = 2;
					current.index = j * 5;
					break;
				case 36:
					current.base = 6;
					current.index = j * 2;
					break;
				case 49:
					current.base = 7;
					current.index = j * 2;
					break;
				case 64:
					current.base = 2;
					current.index = j * 6;
					break;
				case 81:
					current.base = 3;
					current.index = j * 4;
					break;
				case 100:
					current.base = 10;
					current.index = j * 2;
					break;
				}

				if (!list.contains(current)) {
					list.add(current);
					System.out.println("added");
				}

				System.out.println(current.base + " " + current.index);
			}
		}
		System.out.println(list.size());

	}

}
