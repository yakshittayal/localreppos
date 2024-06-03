package javafiles;
public class Song {

    public static void lineStart(){
        System.out.print("There was an old woman who swallowed a ");
    }
    public static void lineEnd(){
        System.out.println("I don't know why she swallowed that fly,");
        System.out.println("Perhaps she'll die.");
        System.out.println();
    }
    public static void lineMid(){
        System.out.println("She swallowed the spider to catch the fly,");
        lineEnd();
    }
    public static void lineMid2(){
        System.out.println("She swallowed the bird to catch the spider,");
        lineMid();
    }
    public static void lineMid3(){
        System.out.println("She swallowed the cat to catch the bird,");
        lineMid2();
    }
    public static void lineMid4(){
        System.out.println("She swallowed the dog to catch the cat,");
        lineMid3();
    }
    public static void main(String[] args){
        lineStart();
        System.out.println("fly.");
        lineEnd();
        lineStart();
        System.out.println("spider,");
        System.out.println("That wriggled and iggled and jiggled inside her.");
        lineMid();
        lineStart();
        System.out.println("bird,");
        System.out.println("How absurd to swallow a bird.");
        lineMid2();
        lineStart();
        System.out.println("cat,\n" +
                           "Imagine that to swallow a cat.");
        lineMid3();
        lineStart();
        System.out.println("dog,\n" +
                           "What a hog to swallow a dog.");
        lineMid4();  
    }
}