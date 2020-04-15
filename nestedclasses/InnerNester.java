package nestedclasses;

public class InnerNester {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        // For static inner class.
        //OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        System.out.println("Outer variable: " + outerClass.x);
        System.out.println("Inner variable: " + innerClass.y);
        System.out.println("Inner variable: " + innerClass.myInnerMethod());
    }
}

/**
 * Case1: Basic Inner class.
 * <p>
 * Case2: Making inner class private - Unlike a "regular" class, an inner class can be private or protected.
 * If you don't want outside objects to access the inner class, declare the class as private:
 * <p>
 * Case3: Static inner class - An inner class can also be static, which means that you can access it without creating an object of the outer class:
 *
 * Case4: Access Outer Class From Inner Class - inner classes, is that they can access attributes and methods of the outer class:
 */
class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 20;

        public int myInnerMethod() {
            System.out.println("myInnerMethod called");
            return x;
        }
    }
}
