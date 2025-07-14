#A program that converts the time into 12 hour format and the date into its month and day
#Name: Modisane Gomolemo
#Student number: MDSGOM004
#Date: 29 March 2024


date_and_time = input('Enter the date and time (yyyy-mm-dd hh:mm):\n')

year = date_and_time[2:4:]# slices out the year
month = date_and_time[5:7]#slices out the month
day = int(date_and_time[8:10])#Slices out the daay and converts it into integer 

hours = int(date_and_time[11:13])#slices out the hour only in the time
minutes = date_and_time[14:16]#slices out the minutes only of the time

if hours > 12:
    hours -= 12
    time_suffix = "pm"# if the hours are greater that 12 we substract 12 and suffix our time as pm
elif hours == 0:
    hours = 12
    time_suffix = "am"#if the hours are 0 it means its 12 am 
elif hours == 12:
    hours = 12
    time_suffix = 'pm'

else:
    time_suffix = "am"#else if the time is less than or equals to 12 theb the suffix is am 

if 1<= day <= 3 or 21<= day <= 23 or day == 31:
    if day in (1,21,31):
        day_suffix = "st"# if the day is the 1st or 21st or the 31st then the suffix is going to be 'st'
    elif day in (2,22):
        day_suffix = "nd"#if the day is 2nd or 22nd then the suffix is going to be 'nd'
    else:
        day_suffix = "rd"#if the day is the 3rd or 23rd then the suffix is 'rd'

else:
    day_suffix = "th"#if the date is not in the range 1-3 or 21-23 or is 31 then the suffix is going to be 'th'

if month == "01":#this will check for each month 
    adj_month = 'January'
elif month == "02":
    adj_month = 'February'
elif month == "03":
    adj_month = 'March'
elif month == "04":
    adj_month ='April'
elif month == "05":
    adj_month = 'May'
elif month == "06":
    adj_month = 'June'
elif month == "07":
    adj_month = 'July'
elif month == "08":
    adj_month = 'August'
elif month == "09":
    adj_month = 'September'
elif month == "10":
    adj_month = 'October'
elif month == "11":
    adj_month = 'November'
else :
    adj_month = 'December'

print(hours ,":", minutes ," ", time_suffix , " on the " , day , day_suffix , " of " , adj_month , " '",year, sep = "")