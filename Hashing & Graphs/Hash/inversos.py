def mcd(num1,num2):
    resultados = []
    if num1 > num2:
        mayor = num1
        menor = num2
    else: 
        mayor = num2
        menor = num1

    residuo = mayor % menor

    if residuo == 0:
        mcd = menor
    
    else:
        while residuo != 0:
            division = mayor// menor
            residuo = mayor % menor

            operacion = division * menor + residuo

            residuo1 = operacion - (division * menor)

            mayor = menor
            menor = residuo
            resultados.append(residuo)
            

        final = len(resultados)
        mcd = (resultados[final-2])
        
        print(residuo1)

    return mcd

def invers(mod,num) : 
    num = num % mod
    for var in range(1, mod) : 
        if ((num * var) % mod == 1) : 
            return var 

def binario(num):
    bin = ''
    while num // 2 != 0:
        bin = str(num % 2) + bin
        num = num // 2
    return str(num) + bin

def exp_modular(base,exp,mod):
    bini = (binario(exp))
    numeros = [base]
    expos = []
    cont = 0
    mult = 1
    # print((bini))
    while cont < len(bini):
        base = (base**2) % mod    
        numeros.append(base)
        cont += 1
    # print(numeros)
    for i in range(len(bini)):
        bina = bini[len(bini)::-1]
        if bina[i] == "1":
            expos.append(numeros[i])
    for each in expos:
        mult = (mult*each) 
    return mult%mod
