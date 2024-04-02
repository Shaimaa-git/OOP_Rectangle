public class Rectangle {
    private Integer Length;
    private Integer Width;

    public Rectangle(Integer length, Integer width) {
        Length = length;
        Width = width;
    }
    public Integer CalculateArea(){
        return Length*Width;
    }

    public Integer getLength() {
        return Length;
    }

    public void setLength(Integer length) {
        Length = length;
    }

    public Integer getWidth() {
        return Width;
    }

    public void setWidth(Integer width) {
        Width = width;
    }
}
