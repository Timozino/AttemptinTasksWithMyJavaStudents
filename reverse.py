def reverseString(s):
    reversed = ""
    for i in range(1,len(s)):
        # if i >=0:
        #     i-=1
            
        reversed +=s[::-i]
        
    return reversed


print(reverseString("Timson"))