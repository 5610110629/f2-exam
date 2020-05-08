public class DiceTest {
    private int face;
    public DiceTest(){
        face = 1;
    }

    public void roll(){
        face = ((int)(Math.random() * 6) + 1);
    }

    public int getFace(){
        return face;
    }

    public String toString(){
        String display;
        display = "face" + " " + "=" + " " + face;
        return display;
    }
    
}