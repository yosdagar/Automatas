#Yosimar Davila Garcia
#Fernanda Aidee Garcia Novas
#Ricardo Hernadez Carrillo
#Socorro Abigail Cristóbal Hernández
#Adrian Madrid Morales
#Mirian Romero Martinez
abc = []
num = int(input("ingresa el numero de los elementos del alfabeto: "))
for i in range(num):
    abc.append(input("intruduce los elementos de alfabeto: "))
print ("tu alfabeto es: ")
print (abc)

ele = int(input("ingresa el numero que deseas multiplicar el abecedario (A^x): "))

if ele== 0:
    print ("alfabeto =[E]");
if ele==1:
    print ("el nuevo alfabeto es:" + abc);
    
if ele==2:
    print ("es"+ abc + "" + abc);
    
if ele==3:
    print ("es"+ abc + "" + abc + "" + abc);
##    for i in range(abc):

##        for ele in range(abc)

exit
        
