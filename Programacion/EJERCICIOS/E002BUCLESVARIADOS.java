import java.lang.IO;
import java.util.random.*;

void main() {
    //for
    IO.println("FOR");
    for (int i = 1; i <= 10; i++) {
        IO.println(i);
    }
    IO.println("");

    for (int i = 2; i <= 20; i++) {
        IO.println(i);
        i++;

        if (i > 20) {
            break;
        }

        IO.println(i);
        IO.println("");
    }
    IO.println("");
    IO.println("");


    //while
    IO.println("WHILE");
    int counter = 1;
    while (true) {
        IO.println(counter);
        counter++;

        if (counter >= 10) {
            break;
        }
    }
    IO.println("");

    counter = 2;
    while (true) {
        IO.println(counter);
        counter++;

        if (counter > 20) {
            break;
        }

        IO.println(counter);
        counter++;
        IO.println("");
    }
    IO.println("");
    IO.println("");


    //do while
    IO.println("DO WHILE");
    int number = 1;
    do {
        IO.println(number);
        number++;
    } while (number <= 10);
    IO.println("");

    number = 2;
    do {
        IO.println(number);
        number++;

        if (number > 20) {
            break;
        }

        IO.println(number);
        number++;
        IO.println("");
    } while (number <= 20);
    IO.println("");
    IO.println("");



    tirarError(); //>:D
}

public void tirarError() {
    RandomGenerator generator = new Random();

    if (generator.nextInt(0, 100) < 10) {
        IO.println("Mala suerte te toco el 10% >:D");
        ArrayIndexOutOfBoundsException indexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
        throw indexOutOfBoundsException;
    }

    IO.println("Te salvaste :D");
}

