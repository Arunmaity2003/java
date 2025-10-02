package oops.inheritance;

class boxWeight extends box{
    double weight;

    public boxWeight() {
        this.weight = 1;
    }

    
    public boxWeight(double l,double h,double w,double weight){
        super(l,h,w);
        this.weight = weight;
    }

}