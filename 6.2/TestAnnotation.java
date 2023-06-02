class Animal {
    void eatSomething() {
        System.out.println("Eating something.");
    }
}

class Cat extends Animal {
    @Override
    void eatsomething() {
        System.out.println("Eating foods.");
    }
}

public class TestAnnotation {
    public static void main(String[] args) {
        
    }
}