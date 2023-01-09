#%%writefile CS418P05Paulski.py
# Izabella Paulski CS418 P05
# Logic Puzzle L828JU
# 1 2 3 4 -- 44, 45, 49, 53

from constraint import *
problem = Problem()

firstNames = ["Ashlee", "Elias", "Makenzie", "Sophie"]
cars = ["Chrysler", "Lamborghini", "McLaren", "Mercedes"]
islands = ["Aruba", "Barbuda", "Saint Lucia", "Saint Martin"]

criteria = firstNames + cars + islands
problem.addVariables(criteria,[1,2,3,4])

problem.addConstraint(AllDifferentConstraint(), firstNames)
problem.addConstraint(AllDifferentConstraint(), cars)
problem.addConstraint(AllDifferentConstraint(), islands)

#1 & 9
problem.addConstraint(NotInSetConstraint([4]), ["Lamborghini", 'Sophie'])
problem.addConstraint(InSetConstraint([4]), ["Aruba"])
problem.addConstraint(lambda ns, dl: ns-dl <= 4, ("Sophie","Lamborghini"))
problem.addConstraint(lambda ns, dl: ns == dl, ("Sophie","Lamborghini"))
#2
problem.addConstraint(lambda vb, dl: vb != dl, ("Barbuda","Lamborghini"))
#3
problem.addConstraint(InSetConstraint([2]), ["Sophie"])
#4
problem.addConstraint(lambda nm, vsm, vb: nm==vsm or nm==vb, ('Makenzie', 'Saint Martin', 'Barbuda'))
#5
problem.addConstraint(InSetConstraint([3]), ["McLaren"])
#6
problem.addConstraint(lambda dm, ne: dm != ne, ("Mercedes","Elias"))
#7
problem.addConstraint(lambda vsl, dm, ne: vsl!=dm and vsl!=ne, ('Saint Lucia', 'Mercedes', 'Elias'))
#8
problem.addConstraint(lambda va, nm: va-nm >= 1, ("Aruba","Makenzie"))
problem.addConstraint(NotInSetConstraint([1]), ["Aruba"])
#9
problem.addConstraint(lambda dl, vsm: vsm-dl >= 1, ("Lamborghini","Saint Martin"))
problem.addConstraint(NotInSetConstraint([4]), ["Lamborghini"])
#10
problem.addConstraint(NotInSetConstraint([1]), ["Mercedes"])
#11
problem.addConstraint(lambda dc, nm: dc != nm, ("Chrysler","Makenzie"))


solutions = problem.getSolutions()

for solution in solutions:
    for i in range(1,5):
        for x in solution:
            if solution[x] == i:
                print (str(i), x)
        print()

#ANS KEY
#1 44 elias chrysler barbuda
#2 45 sophie lamborghini saint lucia
#3 49 makenzie mclaren saint martin
#4 53 ashlee mercedes aruba

#output:
#1 Elias
#1 Barbuda
#1 Chrysler

#2 Lamborghini
#2 Sophie
#2 Saint Lucia

#3 Makenzie
#3 Saint Martin
#3 McLaren

#4 Mercedes
#4 Aruba
#4 Ashlee