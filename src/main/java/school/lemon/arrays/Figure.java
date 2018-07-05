package school.lemon.arrays;

public abstract class Figure {
    protected abstract int perimetr();
    protected abstract double square();
    public void whoIam(){
        System.out.println(Figure.class.getName());
    }
}
