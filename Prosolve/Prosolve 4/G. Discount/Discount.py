'''
To check the price range and give discount
'''
t = int(input('Enter test case: '))

for i in range(t):
    priceOriginal = int(input('Enter original price: '))
    afterPrice = 0
    if priceOriginal <= 500:
        afterPrice = priceOriginal
    elif priceOriginal >= 501 and priceOriginal <= 1000:
        afterPrice = priceOriginal * 0.95
    elif priceOriginal >= 1001 and priceOriginal <= 2000:
        afterPrice = priceOriginal * 0.92
    elif priceOriginal >2000:
        afterPrice = priceOriginal * 0.85
    print('RM %.2f' %afterPrice)