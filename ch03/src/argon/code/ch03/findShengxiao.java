package argon.code.ch03;

import java.util.Scanner;

public class findShengxiao {
    public static void main(String[] args) {
        String[] shengxiao;
        shengxiao= new String[]{"π", "π", "π", "π", "π", "π", "π", "π", "π", "π", "π", "π"};
        int years;
        var sc=new Scanner(System.in);
        System.out.print("θ―·θΎε₯εΉ΄δ»½οΌ");
        years=sc.nextInt();
        System.out.println(shengxiao[(years+8)%12]);//ε δΈΊε¬εδΈεΉ΄ζ―ιΈ‘εΉ΄ζδ»₯ε¨εΉ΄δ»½δΈ+8mod12ε³ε―ζ±εΊθ―₯εΉ΄ηηθ

    }
}
