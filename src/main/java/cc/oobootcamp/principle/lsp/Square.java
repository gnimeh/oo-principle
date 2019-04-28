package cc.oobootcamp.principle.lsp;

public class Square extends Rectangle {

    protected double side;

    public void setSide(double side) {
        this.side = side;
        setWidth(side);
        setHeight(side);
    }
}
