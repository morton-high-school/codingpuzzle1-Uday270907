import java.util.*;
import java.io.*;

public class puzzle1{
    public static void main(String[] args) throws Exception{
        File puz = new File("puzzle.txt");
        Scanner reader = new Scanner(puz);
        String text = reader.nextLine();
        String word = "giraffe";
        int count = 0;
        // System.out.println(text.length());
        // for(int i = 0; i < text.length()-8; i++){
        //     if(text.substring(i, i+8).equals("giraffe")){
        //         count++;
        //         if(count==10){
        //             System.out.println(text.substring(i+8, i+130));
        //         }
        //     }
        // }
        // System.out.println(text.contains(word));
        // System.out.println(text.indexOf(word));
        // for(int i = 0; i<text.length()-8; i++){
        //     if(text.substring(i).contains(word)){
        //         count++;
        //         i += text.substring(i).indexOf(word)+8;
        //         System.out.println(i + text.substring(i).indexOf(word)+8);
        //     }
        // }
        // System.out.println(text.substring(99410, 99421+123));
        int greatest = 0;
        int current = 0;
        int pos = 0;
        for(int i = 6; i<text.length()-5; i++){
            for(int j = 1; j<6 && text.substring(i-j, i-j+1).equals(text.substring(i+j, i+j+1)); j++){
                if(j==5){
                    System.out.println(text.substring(i+j, i+j+1+25));
                }
            }
        }
        System.out.println(pos);
        System.out.println(greatest * 2);
        System.out.println(text.substring(pos+greatest*2, pos+greatest*2+125));
        // for(int i = 0; i<text.length()-30; i++){
        //     for(int j = 0; j<30; j++){
        //         if(text.substring(i+j, i+j+1).equals("u") || text.substring(i+j, i+j+1).equals("o") || text.substring(i+j, i+j+1).equals("a") || text.substring(i+j, i+j+1).equals("e") || text.substring(i+j, i+j+1).equals("i")){
        //             current++;
        //             if(current>greatest){
        //                 greatest = current;
        //                 pos = i;
        //             }
        //         }
        //     }
        //     current = 0;
        // }
        // System.out.println(text.substring(pos+30, pos+110));
        System.out.println("The answer to the puzzle is \"badger\"!");
    }
}