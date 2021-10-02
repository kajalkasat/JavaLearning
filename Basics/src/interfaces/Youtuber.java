package interfaces;

public abstract interface Youtuber {
    abstract void makeVideo();

    default void myVideo() // to avoid implementing this method in the classes or interfaces implementing this interfaces
                            // now person doesot have to compulsorily create myVideo()
    {
        System.out.println("my video");
    }

    default void kkkk()
    {
        System.out.println("2nd default function");
    }
}
