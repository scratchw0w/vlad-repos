package HW;

public class Main {
    public static void main(String[] args) {
        MusicalInstrument piano = new Piano();
        MusicalInstrument violin = new Violin();
        MusicalInstrument guitar = new Guitar();
        MusicalInstrument[] allInstruments = new MusicalInstrument[]{piano, violin, guitar};

        for (int i = 0; i < allInstruments.length; i++) {
            allInstruments[i].play();
            allInstruments[i].stopPlaying();
        }
    }
}
