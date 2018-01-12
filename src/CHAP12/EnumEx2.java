package CHAP12;

enum Transportation {
	BUS(100) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	},
	TRAIN(150) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	},
	SHIP(100) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	},
	PLANE(300) {
		int fare(int distance) {
			return distance * BASIC_FARE;
		}
	};

	protected final int BASIC_FARE;

	Transportation(int basicFare) {
		BASIC_FARE = basicFare;
	}

	public int getBasicFare() {
		return BASIC_FARE;
	}

	abstract int fare(int distance);
}

public class EnumEx2 {

	public static void main(String[] args) {
		System.out.println(Transportation.BUS.fare(100));
		System.out.println(Transportation.TRAIN.fare(100));
		System.out.println(Transportation.SHIP.fare(100));

	}

}
