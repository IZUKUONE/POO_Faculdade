package nelioAlves.introductionToPoo.exercise.entities;

public class Rectangle {
    public double Width;
    public double Height;

    public double Area(){
        return Width*Height;
    }

    public double Perimeter(){
        return 2*(Width+Height);
    }

    public double Diagonal(){
        return Math.sqrt((Width*Width)+(Height*Height));
    }

    public String toString(){
        return "AREA = " + String.format("%.2f",Area())
                + "\n Perimeter = "
                + String.format("%.2f",Perimeter())
                + "\n Diagonal = "
                + String.format("%.2f",Diagonal());
    }
}
