class Person:
    age = 0
    def __init__(self,initialAge):  
        global age
        if initialAge<0:
            print('Age is not valid, setting age to 0.')
            age = 0
        else:
            age = initialAge
    def amIOld(self):
        global age
        if age<13:
            print('You are young.')
        elif age>=13 and age<18:
            print('You are a teenager.')
        else:
            print('You are old.')
            
    def yearPasses(self):        
        global age
        age = age+1