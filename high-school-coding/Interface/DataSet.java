public class DataSet
{
   private double sum;
   private double maximum; //
   private int count;
//Constructor
   public DataSet()
   {
      sum = 0;
      count = 0;
      maximum = 0;
   }

   // Function add - one for BankAccount; one for Coin
   /*public void add(BankAccount x)
   {
      sum = sum + x.getMeasure();
      if (count == 0 || maximum.getMeasure() < x.getMeasure())
         maximum = x;
         
      sum = sum + x.getBalance();
      if (count == 0 || maximum < x.getBalance())
        maximum = x.getBalance();
      count++;
   }
   public void add(Coin x)
   {
      sum = sum + x.getMeasure();
      if (count == 0 || maximum.getMeasure() < x.getMeasure())
         maximum = x;
         
      sum = sum + x.getValue();
      if (count == 0 || maximum < x.getValue())
        maximum = x.getValue();
      count++;
   }*/
//    public void add(Measurable x){
//        sum = sum + x.getMeasure();
//        if(count == 0 || maximum.getMeasure() < x.getMeasure())
//        maximum = x;
//        count++;
//     }
   /**
      Gets the average of the added data.
      @return the average or 0 if no data has been added
   */
   public double getAverage()
   {
      if (count == 0) return 0;
      else return sum / count;
   }

   /**
      Gets the largest of the added data.
      @return the maximum or 0 if no data has been added
   */
   public Double getMaximum()
   {
      return maximum;
   }
}