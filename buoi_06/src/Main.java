import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[] {2, 4, 6, 8, 10};

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.printf("arr[%d] = %d\n", i, arr[i]);
        // }
        // for (int n : arr) {
        //     System.out.println(n);
        // }

        // int i = 0;
        // while (true) {
        //     if (i < 0) {
        //         break;
        //     }

        //     System.out.println("Hello world " + i);

        //     i++;
        // }
        // System.out.println(i);

        // int i = 0;
        // do {
        //     System.out.println("Hello world " + i);

        //     i++;
        // } while(i < 0);
        // System.out.println(i);

        // int i = 0;
        // while(i < 0) {
        //     System.out.println("Hello world " + i);

        //     i++;
        // };
        // System.out.println(i);

        // for(int i = 1; i <= 5; i++) {  // Loop i
		// 	if(i == 3) {
		// 		continue;
		// 	}
		// 	System.out.println("i = " + i);
		// }

        // for(int i = 1; i <= 5; i++) {  // Loop i
		// 	for(int j = 1; j <= 3; j++) {  // Loop j
		// 		if(i == 3 && j == 2) {
		// 			continue;
		// 		}
		// 		System.out.println("i = " + i + ", j = " + j);
		// 	}
		// }

        // for(int i = 1; i <= 5; i++) {  // Loop i
		// 	if(i == 3) {
		// 		break;
		// 	}
		// 	System.out.println("i = " + i);
		// }

        // for(int i = 1; i <= 5; i++) {  // Loop i
		// 	for(int j = 1; j <= 3; j++) {  // Loop j
		// 		if(i == 3 && j == 2) {
		// 			break;
		// 		}
		// 		System.out.println("i = " + i + ", j = " + j);
		// 	}
		// }

        // for(int i = 1; i <= 5; i++) {  // Loop i
        //     boolean flag = false;

		// 	for(int j = 1; j <= 3; j++) {  // Loop j
		// 		if(i == 3 && j == 2) {
        //             flag = true;
		// 			break;
		// 		}
		// 		System.out.println("i = " + i + ", j = " + j);
		// 	}

        //     if (flag) {
        //         // continue;
        //         break;
        //     }
		// }

        // Loop_i:
		// for(int i = 1; i <= 5; i++) {  // Loop i
		// 	for(int j = 1; j <= 3; j++) {  // Loop j
		// 		if(i == 3 && j == 2) {
		// 			// continue Loop_i;
        //             break Loop_i;
        //         }
		// 		System.out.println("i = " + i + ", j = " + j);
		// 	}
		// }

        // int a = 10;
        // int b = -10;
        // BLOCK:
		// {  // Pure statement block
		// 	System.out.println("1");

        //     System.out.println("2");

		// 	if (a >= 0) {
		// 		break BLOCK;
		// 	}

        //     System.out.println("3");

        //     if (b >= 0) {
		// 		break BLOCK;
		// 	}

        //     System.out.println("4");
		// }
		// System.out.println("End");

        // int a = 10;
        // int b = -10;

        // System.out.println("1");

        // System.out.println("2");

        // if (a < 0) {
        //     System.out.println("3");

        //     if (b < 0) {
        //         System.out.println("4");
        //     }
        // }

		// System.out.println("End");

        // int a = 10;
        // int b = -10;

        // myFunction(a, b);

		// System.out.println("End");

        // String correctUsername = "tanthanh";
		// String correctPassword = "12345678";
		// boolean isEnterUsernameRunning = true;
		// boolean isEnterPasswordRunning = true;
		
		// Scanner sc = new Scanner(System.in);
		
		// while(isEnterUsernameRunning) {
		// 	System.out.print("Enter username: ");
		// 	String username = sc.nextLine();
		// 	if(username.equals(correctUsername)) {
		// 		isEnterUsernameRunning = false;
		// 		while(isEnterPasswordRunning) {
		// 			System.out.print("Enter password: ");
		// 			String password = sc.nextLine();
		// 			if(password.equals(correctPassword)) {
		// 				isEnterPasswordRunning = false;
		// 				System.out.println("Login success!");
		// 			} else {
		// 				System.out.println("Invalid password!");
		// 			}
		// 		}
		// 	} else {
		// 		System.out.println("Invalid username!");
		// 	}
		// }
		
		// sc.close();

        String correctUsername = "tanthanh";
		String correctPassword = "12345678";
		boolean isEnterUsernameRunning = true;
		boolean isEnterPasswordRunning = true;
		int countIfWrongPassword = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(isEnterUsernameRunning) {
			System.out.print("Enter username: ");
			String username = sc.nextLine();
			if(username.equals(correctUsername)) {
				isEnterUsernameRunning = false;
				while(isEnterPasswordRunning) {
					if(countIfWrongPassword < 3) {
						System.out.print("Enter password: ");
						String password = sc.nextLine();
						if(password.equals(correctPassword)) {
							isEnterPasswordRunning = false;
							System.out.println("Login success!");
						} else {
							System.out.println("Invalid password!");
							countIfWrongPassword++;
						}
					} else {
						isEnterPasswordRunning = false;
						System.out.println("You have entered the wrong password too many times!");
					}
				}
			} else {
				System.out.println("Invalid username!");
			}
		}
		
		sc.close();

    }

    public static void myFunction(int a, int b) {
        System.out.println("1");

        System.out.println("2");

        if (a >= 0) {
            return;
        }

        System.out.println("3");

        if (b >= 0) {
            return;
        }

        System.out.println("4");
    }
    
}
