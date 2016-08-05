#Automata#
#Ricardo Hernandez Carrillo
#Adrian Madrid Morales
#Yosimar Davila Garcia
#Fernanda Aidee Garcia Novas
#Abigail Socorro Cristobal Hernandez


cadena = input("Ingrese la cadena por favor: ")

print ("la cadena: " + cadena);
res= cadena.find('ab')
res2 = cadena.find('ba')
res3 = cadena.find('baba')
#print (res)
#print (res2)
if res >= 0  and res >= 1 :
    print ("es valida");
elif res <= 0 and res2 > 1 :
    print ("es valida")
elif res ==1 and res2 ==0:
    print ("no es valida");
elif res and res2 <= 0 :
    print("no es valida");




#pruebas
#aaaaaab /
#ab      /
#abbb    /
#aaaaaabbbbb /
#babb   x
#bbbbb  /
