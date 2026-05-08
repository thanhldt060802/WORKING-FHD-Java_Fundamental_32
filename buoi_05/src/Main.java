import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
		
		// System.out.print("Enter n: ");
		// int n = sc.nextInt();
		// if(n < 0) {
		// 	System.out.println("n is negative!");
		// } else if(n % 2 == 0) {
		// 	System.out.println("n is even number");
		// } else {
		// 	System.out.println("n is odd number");
		// }
        // if (n < 0) {
        //     System.out.println("n is negative!");
        // } else {
        //     if (n % 2 == 0) {
        //         System.out.println("n is even number");
        //     } else {
        //         System.out.println("n is odd number");
        //     }
        // }

        // if (n < 0) {
        //     System.out.println("n is negative!");
        // }
        // System.out.println("Hello world!");

        // System.out.print("Enter n: ");
		// int n = sc.nextInt();
		// switch(n) {
		// 	case 1:
		// 		System.out.println("Start game");
		// 		break;
		// 	case 2: {
		// 		System.out.println("Pause game");
		// 		break;
		// 	}
		// 	case 3: {
		// 		System.out.println("Resume game");
		// 		break;
		// 	}
		// 	case 4: {
		// 		System.out.println("Exit game");
		// 		break;
		// 	}
		// 	default: {
		// 		System.out.println("Invalid n!");
		// 	}
		// }

        // System.out.print("Enter your command: ");
		// String cmd = sc.nextLine();
        // String cmd = new String("create");
        // switch (cmd) {
        //     case "create": {
        //         System.out.println("Start creating data ...");
        //         break;
        //     }
        //     case "update": {
        //         System.out.println("Start updating data ...");
        //         break;
        //     }
        //     case "delete": {
        //         System.out.println("Start deleting data ...");
        //         break;
        //     }
        //     case "query": {
        //         System.out.println("Start querying data ...");
        //         break;
        //     }
        //     default: {
        //         System.out.println("Invalid cmd!");
        //         break;
        //     }
        // }

        // int n = 10;
        // if (n == 1) {
        //     System.out.println();
        // } else if (n == 2) {
        //     System.out.println();
        // }else {
        //     System.out.println();
        // }

        // String cmd = new String("create");
        // if (cmd.equals("create")) {
        //     System.out.println("1");
        // } else if (cmd.equals("update")) {
        //     System.out.println("2");
        // } else {
        //     System.out.println("3");
        // }

        // int a = 10;
        // int b = 10;
        // int c = 10;
        // if (a == b) {
        //     System.out.println();
        // } else if (a == c) {
        //     System.out.println();
        // } else {
        //     System.out.println();
        // }
        
        // long start = System.nanoTime();
        // int i = 0;
        // // String sumStr = "";
        // StringBuffer sumStr1 = new StringBuffer();
        // for(; i < 500000; i++) {
		// 	sumStr1.append("Hello world " + i + "\n");
		// }
        // System.out.println(sumStr1);
        // long stop = System.nanoTime();
        // System.out.println("Duration: " + (stop - start));

        // System.out.println();

        // long start = System.nanoTime();
        // int i = 0;
        // // String sumStr = "";
        // StringBuilder sumStr2 = new StringBuilder();
        // for(; i < 500000; i++) {
		// 	sumStr2.append("Hello world " + i + "\n");
		// }
        // System.out.println(sumStr2);
        // long stop = System.nanoTime();
        // System.out.println("Duration: " + (stop - start));
        
        // System.out.println(i);

        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // for (int i = 0; i < 500000; i++) {
        //     bw.write("Hello world " + i + "\n");
        // }
        // bw.flush();

        int i = 0;
		for(;;) {
            if (i >= 10) {
                break;
                // continue;
                // return;
            }

			System.out.println("Hello world " + i);
            i++;

            // if (i < 10) {
            //     System.out.println("Hello world " + i);
            //     i++;
            // } else {
            //     break;
            // }
		}
        System.out.println(i);

		sc.close();
        
    }

}
