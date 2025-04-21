interface Playable {
    void play();
}
class Football implements Playable {
    public void play() {
        System.out.println("Playing football");
    }
}
class Volleyball implements Playable {
    public void play() {
        System.out.println("Playing volleyball");
    }
}
class Basketball implements Playable {
    public void play() {
        System.out.println("Playing basketball");
    }
}

public class week8q2 {
    public static void main(String[] args) {
        System.out.println("NAME: P SAI LIKHITH ROLL NO: 24306 SEC: CSE-A" );
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        football.play();
        volleyball.play();
        basketball.play();
    }
}
