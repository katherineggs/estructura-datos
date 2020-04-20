import random
import inversos

print("\n--------CIFRADO RSA-----------")

mensaje = input("Ingrese mensaje: ")
# mensaje="hola a todos"
c = ""
mensj = ""
pasar = []
desencripta = ""
grupos = []
abc={"00":"_", "01":"a", "02":"b", "03":"c",
     "04":"d", "05":"e", "06":"f", "07":"g",
     "08":"h", "09":"i", "10":"j", "11":"k",
     "12":"l", "13":"m", "14":"n", "15":"o",
     "16":"p", "17":"q", "18":"r", "19":"s",
     "20":"t", "21":"u", "22":"v", "23":"w",
     "24":"x", "25":"y", "26":"z"}

###LISTA DE PRIMOS
primos = [ 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
#P Y Q
# p = random.choice(primos)
# primos.remove(p)
# q = random.choice(primos)

p = int(input("Ingrese p: "))
q = int(input("Ingrese q: "))

#N Y E POSIBLES
n = p * q
e_lista = []

#SI ES MAYOR A LA CANTIDAD DE MONOGRAMAS 
if n > 27:
    phi = (p-1)*(q-1)             ## PHI DE N
    for i in range(1,phi):        #NUMEROS DE 1 HASTA PHI
        mod = phi % i             #PARA ESCOGER E, QUE SEA MENOR Y PRIMO RELATIVO
        if mod == 1:
            e_lista.append(i)     #LISTA DE E

#E RANDOM
e = random.choice(e_lista)

#INVERSO DE E
d = inversos.invers(phi,e)

#LLAVES
clave_publica = [n,e]
clave_privada = [n,d]
print("llave publica ", clave_publica)
print("llave privada", clave_privada)

encripta = []
#ENCRIPTACION
for m in mensaje:
    for k,v in abc.items():
        if v == m:
            k = int(k)
            ci = (k ** e) % n    # ci = inversos.exp_modular(k,e,n)
            ci = str(ci)

            if len(ci) == 1:
                ci = "0"+ci
            elif (len(ci)%2) == 1:
                ci = "0" + ci

            encripta.append(ci)
ultimo = ""
for i in encripta:
    ultimo = ultimo + i + " "
print("\nPalabra encriptada "+ultimo)


#DESENCRIPTA
for i in range(0, len(c), 2):
    grupos.append(c[i:i+2])

for each in encripta:
    if each.startswith("0"):
        each.replace("0","")
    each = int(each)
    des = inversos.exp_modular(each,d,n)  # des = (each ** d) % n
    des = str(des)

    if len(des) == 1:
        des = "0"+des
    mensj = mensj + des

for i in range(0, len(mensj), 2):
    pasar.append(mensj[i:i+2])

for i in pasar:
    for k,v in abc.items():
        if i == k:
            desencripta = desencripta + v

print("Palabra original--- "+desencripta)

