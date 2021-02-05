public class EmpWageBuilderUC9 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkDays;
    private final int maxHoursMonth;
    private int totalEmpWage;

    public EmpWageBuilderUC9(String company,int empRatePerHour,int numOfWorkDays,int maxHoursMonth)
      {
         this.company = company;
         this.empRatePerHour = empRatePerHour;
         this.numOfWorkDays = numOfWorkDays;
         this.maxHoursMonth = maxHoursMonth;
      }

    public void computeEmpWage() {
        int emphrs = 0;
        int totalemphrs = 0;
        int totalworkingdays = 0;
        while(totalemphrs <= maxHoursMonth && totalworkingdays < numOfWorkDays) {
            totalworkingdays++;
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch(empcheck) {
                case IS_PART_TIME:
                    emphrs = 4;
                    break;
                case IS_FULL_TIME:
                    emphrs = 8;
                    break;
                default:
                    emphrs = 0;
            }
            totalemphrs += emphrs;
            System.out.println("Day: " + totalworkingdays + "emp hr: " + emphrs);
        }
        totalEmpWage = totalemphrs * empRatePerHour;
}

   @Override
    public String toString()
    {
      return "Total Employee Wage for Company :" + company + " is :" + totalEmpWage;
         }
   public static void main(String args[])
   {
   EmpWageBuilderUC9 Dmart=new EmpWageBuilderUC9("DMart",20,2,10);
   EmpWageBuilderUC9 Adani=new EmpWageBuilderUC9("Adani",10,4,20);
   Dmart.computeEmpWage();
   System.out.println(Dmart);
   Adani.computeEmpWage();
   System.out.println(Adani);
   }
}
