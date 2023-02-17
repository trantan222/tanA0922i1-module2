package ExceptionAndDebug;

public class IllegalTriangleException  {
    public void checkTriangle(double a, double b, double c) throws  IllegalTriangleMessage {
           if(a + b <=c || a + c <= b ||  b + c <= a){
               throw new IllegalTriangleMessage("Tam giác không hợp lệ !!! ");
           }else {
               System.out.println("Tam giác hợp lệ ");
           }
        }
    }

