public class Task1A {
	public static void main(String[] args) {
		int n = 1000;
		int[] a = new int[1024];//ふるい
		
		//初期化
		for (int i = 2; i < n; i++){ 
			a[i] = 1;
		}
		
		//素数以外の数をはじいていく
		for (int i = 2; i < n; i++){
			if (a[i] == 1){
				for(int j = i * 2; j < n; j += i){
					a[j] = 0;
				}
				System.out.print(i + " ");
			}
		}
		
	}
}
