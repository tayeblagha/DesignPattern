package Adapter;

public class PenAdaptor implements Pen {
    PilotPen pp = new PilotPen();
    @Override
    public void Write(String str) {
        pp.mark(str);
    }
}
