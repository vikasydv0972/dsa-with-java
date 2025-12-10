package Recursions;
import java.util.*;
public class PrintName {

static void printName(int i, int n){
    if(i>n){
        return;
    }
    else{
        System.out.println("Vikas");
        printName(i+1,n);

    }

}

    public static void main(String[] args) {

        int i=1;
        int n=5;

        printName(i,n);

    }

}
