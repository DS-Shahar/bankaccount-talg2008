public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }

    public int calcArea()
    {
        return length*width;
    }

    public int calcPerimeter()
    {
        return 2*(length+width);
    }

    public void scale(int factor)
    {
        length=length*factor;
        width=width*factor;
    }

    public String toString()
    {
        return "length: "+length+" width:"+width;
    }

    public void draw() {
        String row = "_".repeat(length / 10);
        for (int i=0; i<width/10; i++)
        {
           System.out.println(row);
        }
    }






}
