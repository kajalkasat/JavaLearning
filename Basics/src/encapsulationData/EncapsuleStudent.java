package encapsulationData;

public class EncapsuleStudent {
    private int rollNo;
    public int getRollNo()
    {
        return rollNo;
    }

    public void setRollNo(int rollNo)
    {
        if(rollNo > 100) // this to show, that rollNo is restricted access, and can be set only on conditions set by us
            {
                System.out.println("seats are full !");
            }
        else
            this.rollNo = rollNo;
    }
}
