public class Problem31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1p, 2p, 5p, 10p, 20p, 50p, �1 (100p) and �2 (200p).
		int count = 0;
		for (int p100 = 0; p100 <= 2; p100++) {
			for (int p50 = 0; p50 <= 4; p50++) {
				for (int p20 = 0; p20 <= 10; p20++) {
					for (int p10 = 0; p10 <= 20; p10++) {
						for (int p5 = 0; p5 <= 40; p5++) {
							for (int p2 = 0; p2 <= 100; p2++) {
								
									int total = p2*2+p5*5+p10*10+p20*20+p50*50+p100*100;
									if(total <= 200)
										count++;
									System.out.println(p100 + "," + p50 + "," + p20 + "," + p10);
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}