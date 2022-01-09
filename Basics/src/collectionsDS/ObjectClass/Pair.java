package collectionsDS.ObjectClass;

/* this pair now accepts 1string 1 integer pair, we might want to lattern add support of double,float to this Pair, 
we use generics for that case */
// public class Pair {
//     String x;
//     int y;

//     public Pair(String x, int y)
//     {
//         this.x = x;
//         this.y = y;
//     }
// }

/* this is the generic definition of Pair, like how we can use ArrayList for creating String or Integer*/
public class Pair<X,Y> {
    X x;
    Y y;

    public Pair(X x,Y y)
    {
        this.x = x;
        this.y = y;
    }

    public void Description()
    {
        System.out.println(x+" "+y);
    }

}


