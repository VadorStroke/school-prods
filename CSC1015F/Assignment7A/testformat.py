# Name:Modisane Gomolemo
#Student number:MDSGOM004
#Testing for 8 test cases using path coverage

"""
>>> import format
>>> format.time_str(9,0)
"9 o'clock"
>>> format.time_str(9,30)
'half past 9'
>>> format.time_str(12,50)
'10 minutes to 1'
>>> format.time_str(10,40)
'20 minutes to 11'
>>> format.time_str(9,1)
'1 minute past 9'
>>> format.time_str(9,3)
'3 minutes past 9'
>>> format.time_str(12,59)
'1 minute to 1'
>>> format.time_str(10,59)
'1 minute to 11'

"""
import doctest
doctest.testmod(verbose=True)