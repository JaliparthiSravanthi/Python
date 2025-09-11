class Solution(object):
    def fizzBuzz(self, n):
        lst=[]
        i=1
        while i<=n:
            if i%3==0 and i%5==0:
                lst.append("FizzBuzz")
            elif i%3==0 and i%5!=0:
                 lst.append("Fizz")
            elif i%5==0 and i%3!=0:
                 lst.append("Buzz")
           
            elif i%3!=0 and i%5!=0:
                lst.append(str(i))
            i+=1
        return lst
              
