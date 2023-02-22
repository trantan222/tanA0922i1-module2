package File.FileIO.DemoFile;

public class mark {
    private int markk;

    public mark(int markk) {
        this.markk = markk;
    }



    public int getMarkk() {
        return markk;
    }

    public void setMarkk(int markk) {
        this.markk = markk;
    }

    @Override
    public String toString() {
        return "mark{" +
                "markk=" + markk +
                '}';
    }
    public String toStringFile(){
        return markk +" ";
    }
}
