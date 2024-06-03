package localreppos;

public class Rocket{
    public static void main(String[] args) {
        top();
        line();
        midTop();
        midBottom();
        line();
        midBottom();
        midTop();
        line();
        top();
    }
    //line method
    public static void line(){
        for(int lin=1;lin<=6;lin++){
            System.out.print("=");
            System.out.print("*");
        }
        System.out.println("+");
    }
    //top method
    public static void top() {
        for(int j=1;j<=5;j++){
            for(int k=1;k<=5-j;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=j;l++){
               System.out.print("/");  
            }
            for(int m=1;m<=2;m++){
                System.out.print("*");
            }
            for(int l=1;l<=j;l++){
                System.out.print("\\");  
            }
            
            for(int k=1;k<=5-j;k++){
                System.out.print("");
            }
            System.out.println();
        }
    }
    public static void midTop(){
        for(int a=1;a<=3;a++){
            System.out.print("|");
            for(int b=1;b<=3-a;b++){
                System.out.print(".");
            }
            for(int c=1;c<=a;c++){
                System.out.print("/\\");
            } 
            for(int b=1;b<=3-a;b++){
                System.out.print(".");
            }
            for(int b=1;b<=3-a;b++){
                System.out.print(".");
            }
            for(int c=1;c<=a;c++){
                System.out.print("/\\");
            }
            for(int b=1;b<=3-a;b++){
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }
    }
    
    public static void midBottom(){
        for(int v=1;v<=3;v++){
            System.out.print("|");
            for(int w=1;w<=v-1;w++){
                System.out.print(".");
            }
            for(int x=1;x<=3-v+1;x++){
                System.out.print("/\\");
            }
            for(int w=1;w<=v-1;w++){
                System.out.print(".");
            }
            for(int w=1;w<=v-1;w++){
                System.out.print(".");
            }
            for(int x=1;x<=3-v+1;x++){
                System.out.print("/\\");
            }
            for(int w=1;w<=v-1;w++){
                System.out.print(".");
            }
            System.out.println("|");
            
        }
         
    }
}
