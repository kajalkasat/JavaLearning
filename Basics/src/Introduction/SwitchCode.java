package Introduction;


public class SwitchCode
{
    public static void main(String[] args) {
        
        int dayOfWeek = 6;
        int val = 4;
        switch(dayOfWeek)
        {
            // case 1:
            // case 2:
            //     if (dayOfWeek == 1)
            //     {    
            //         System.out.println("Monday");
            //         break;
            //     }
            //     else 
            //     {
            //         System.out.println("Tuesday");
            //         break;
            //     }
            /* 1) add and remove break here and see */
            case 7: 
                System.out.println("day 7");
                break;
            case 6:
                if(val>5)
                {
                    System.out.println("not a valid day 6");
                    break;
                }
                else if(val==4)
                {
                    System.out.println("val = 4 & day =6");
                }
                else 
                {
                System.out.println("valid day 6");
                break;
                }

                // break;  // 2) comment and uncomment this break and check the output
            case 3:
                System.out.println("I am only day 3");
                break;
            
            default:
                System.out.println("Nothing like this bro");

        }

    }
}