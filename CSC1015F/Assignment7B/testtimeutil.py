"""
>>> import timeutil
>>> timeutil.validate('5 33 p.m.')
False
>>> timeutil.validate('f:33 a.m.')
False
>>> timeutil.validate('02:54 p.m.')
False
>>> timeutil.validate('5:20')
False
>>> timeutil.validate('5:333 a.m.')
False
>>> timeutil.validate('8:52 p.m.')
True

"""
import doctest
doctest.testmod(verbose=True)