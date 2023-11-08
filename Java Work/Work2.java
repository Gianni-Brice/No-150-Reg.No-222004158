// Interface for class E

interface Emerine {
    
    void play();

}

// Class Divine implementing the E interface
class Divine implements Emerine {

    public void play() {

        System.out.println("Class Divine: General player - Runs, passes, and tackles.");
    }
}


// Class Claude extending Divine and implementing the Emerine interface
class Claude extends Divine {

    public void play() {

        System.out.println("Class Claude: Goalkeeper - Blocks shots and clears the ball.");
    }
}

// Class Boss extending Claude

class Boss extends Claude {


    void specificMethodB() {

        System.out.println("Class Boss: Additional specific method.");

    }
}

// Class Alfa extending Boss and implementing the Emerine interface

class A extends Boss implements Emerine {

    public void play() {

        System.out.println("Class Alfa: Forward - Scores goals and attacks opponents' defense.");

    }
}

public class Inherit{

    public static void main(String[] args) {

        Alfa playerAlfa = new Alfa();

        Emerine playerBoss = new Divine(); // You can create another player of the same type

        Divine playerClaude = new Alfa();

        Divine playerDivine = new Claude();

        playerAlfa.play(); // Calls the play method in class A

        playerBoss.play(); // Calls the play method in class D

        playerClaude.play(); // Calls the play method in class A

        playerDivine.play(); // Calls the play method in class A
    }
}

