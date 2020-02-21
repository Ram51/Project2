package com.cuberootz.vms.dataAccess.util;

import java.util.Calendar;

public class VmsCommonUtils 
{

	public static String getWeekDay(int dayOfWeek)
	{
		if (Calendar.SUNDAY == dayOfWeek)
		{
			return "sun";
		} else if (Calendar.MONDAY == dayOfWeek) 
		{
			return "mon";
		} else if (Calendar.TUESDAY == dayOfWeek) 
		{
			return "tue";
		} else if (Calendar.WEDNESDAY == dayOfWeek) 
		{
			return "wed";
		} else if (Calendar.THURSDAY == dayOfWeek) 
		{
			return "thu";
		} else if (Calendar.FRIDAY == dayOfWeek) 
		{
			return "fri";
		} else if (Calendar.SATURDAY == dayOfWeek) 
		{
			return "sat";
		} else 
		{
			return "";
		}
	}
}
