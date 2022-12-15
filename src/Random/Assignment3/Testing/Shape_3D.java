package Random.Assignment3.Testing;

public class Shape_3D extends Shape{

        @Override
        public void calArea(){
            System.out.println("Area of 3D shape");
        }

        public Shape_3D(String name) {
            super(name);
        }

        public void display(){
            System.out.println("name is " + super.getName());
        }
    }

