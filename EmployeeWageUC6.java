public class UC1 {

     public static void main(String[] args)  {
	static int IS_FULL_TIME = 1;
	static int IS_PART_TIME = 2;
	static int EMP_RATE_PER_HOUR = 20;
	static int empHrs=0;
	static int empWage=0;
	double empCheck = Math.floor(Math.random() * 10) % 3;
	if (empCheck == IS_FULL_TIME)
	    empHrs=4;
	else if (empCheck == IS_FULL_TIME)
	    empHrs=8;
	else
           empHrs=0;
	empWage = empHrs * EMP_RATE_PER_HOUR;
	System.out.println("EmpWage: " + empWage);
	}
}
