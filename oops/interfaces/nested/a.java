package oops.interfaces.nested;

class a {
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class b implements a.NestedInterface{
    @Override
    public boolean isOdd(int num){ return (num & 1) == 1;}
}