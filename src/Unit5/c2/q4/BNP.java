package Unit5.c2.q4;

import java.util.Scanner;

public class BNP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paisa = sc.nextInt();

        if(paisa==10){
            Paper paper = new small();
            System.out.println(paper.getDifferentSize());
        }
        else if(paisa ==100){
            Paper paper = new medium();
            System.out.println(paper.getDifferentSize());
        }
        else if(paisa == 1000){
            Paper paper = new large();
            System.out.println(paper.getDifferentSize());
        }
        else{
            System.out.println("Invalid Number");
        }
    }
}

interface Paper{
    public String getDifferentSize();
}

class small implements Paper {

    @Override
    public String getDifferentSize() {
        return "s1";
    }
}

class  medium implements Paper {

    @Override
    public String getDifferentSize() {
        return "s2";
    }
}
class large implements Paper {

    @Override
    public String getDifferentSize() {
        return "s3";
    }
}

