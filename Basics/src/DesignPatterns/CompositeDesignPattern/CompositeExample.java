package DesignPatterns.CompositeDesignPattern;

import java.util.*;


// super class
abstract class Account
{
    abstract float getbalance();
}

class DepositAcc extends Account
{
    private String accno;
    private float balance;

    public DepositAcc(String accno, float balance)
    {
        this.accno = accno;
        this.balance = balance;
    }

    @Override
    float getbalance() {
        return this.balance;
    }

}

class SavingsAcc extends Account
{
    private String accno;
    private float balance;

    public SavingsAcc(String accno, float balance)
    {
        this.accno = accno;
        this.balance = balance;
    }

    @Override
    float getbalance() {
        return this.balance;
    }

}

class compositeClass extends Account
{
    
        List<Account> AcctList = new ArrayList<Account>();

        float totalBal = 0;

        public void addAcc(Account ac)
        {
            AcctList.add(ac);
        }

        @Override
        float getbalance() 
        {
            // TODO Auto-generated method stub
            for(Account s : AcctList)
            {
                totalBal += s.getbalance();
            }
            return totalBal;
        }
}

    

public class CompositeExample {
    
    
    /*
        composite follows a componentised format pattern
        4 components are : 
            -> component : super class
            -> leaf      : implentation classes
            -> composite : sum of all the leaf classes
            -> client    : main() where we return the values / the class the client uses for object instantiation   
        
    */

    public static void main(String[] args) {
        
        compositeClass c = new compositeClass();
        c.addAcc(new DepositAcc("1234", 100));
        c.addAcc(new SavingsAcc("1515", 485));
        c.addAcc(new DepositAcc("5565", 885));

        System.out.println(c.getbalance());
    }

    
}
