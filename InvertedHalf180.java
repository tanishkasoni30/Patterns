//     *
//    **
//   ***
//  ****
// *****

// public class InvertedHalf180 {
// 	public static void main(String [] args){
		
// 		for(int i = 0 ; i<=5 ; i++){
// 			for (int j = 1; j<=5; j++){
// 				if(j>5-i){

// 					System.out.print("*");
// 				}
// 				else{

// 					System.out.print(" ");
// 				}
// 			}
// 			System.out.println();


// 		}

// 	}

// }
public class InvertedHalf180 {
	public static void main(String [] args){
		
		for(int i = 1 ; i<=5 ; i++){
			for (int j = 1; j<=5-i; j++){
				System.out.print(" ");
			}

			for(int j =1; j<=i ; j++){
				System.out.print("*");
			}
			System.out.println();


		}

	}

}
