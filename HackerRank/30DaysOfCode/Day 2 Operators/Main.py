#!/bin/python3

import sys

if __name__ == "__main__":
    meal_cost = float(input().strip())
    tip_percent = int(input().strip())
    tax_percent = int(input().strip())
    tip = meal_cost*tip_percent/100.00
    tax = meal_cost*tax_percent/100.00
    total = meal_cost+tip+tax + 0.5
    print('The total meal cost is',int(total),'dollars.')