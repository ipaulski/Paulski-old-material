/* The program provide no output
 * students should use IDE debugger to trace each variable for each loop
 * Use the worksheet that teacher provided to record the values for each variable
 */
public class ForLoop
{
   public static void main(String args[])
   {
       int iFirst=73, iSecond=15;
       double dFirst=30.5, dSecond=12.5;
       String sFirst="Poodle", sSecond="Beagle";
       char cFirst='u', cSecond='H';
       int[] a = new int[10];
       //loop starts here
       int i; 
       for(i = 0 ; i< 10; i ++)  //place your breakpoint here
       {
           cFirst = (char)(1 + i + iFirst);
           sFirst = sSecond + Integer.toString(iFirst+ i);
           iSecond ++;
           dFirst -= 0.7;
           cSecond++;
           a[i] = a[i] + (int)dSecond; 
           System.out.println(a);
        }
       
    }
}