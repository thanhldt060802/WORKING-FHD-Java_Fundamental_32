public class RectangleV2 {
    
    public int perimeter;
    public int area;

    public RectangleV2(int width, int height) {
        this.perimeter = (width + height) * 2;
        this.area = width * height;
    }

    // public RectangleV2(int perimeter, int area) {
    //     this.perimeter = perimeter;
    //     this.area = area;
    // }

}
