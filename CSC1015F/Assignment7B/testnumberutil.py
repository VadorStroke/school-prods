"""
>>> import numberutil
>>> numberutil.aswords(500)
'five hundred'
>>> numberutil.aswords(519)
'five hundred and nineteen'
>>> numberutil.aswords(522)
'five hundred and twenty two'
>>> numberutil.aswords(37)
'thirty seven'
>>> numberutil.aswords(30)
'thirty'
>>> numberutil.aswords(530)
'five hundred and thirty'
>>> numberutil.aswords(0)
'zero'
>>> numberutil.aswords(7)
'seven'

"""
import doctest
doctest.testmod(verbose=True)