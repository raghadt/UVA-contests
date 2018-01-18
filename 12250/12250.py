i=0;
while(True):
    st = input()
    i+=1
    if st=='#':
        break

    if st == 'HELLO':
        print('Case ' + str(i) + ': ENGLISH')
    elif st == 'HOLA':
        print('Case '+ str(i)+ ': SPANISH')
    elif st == 'HALLO':
        print('Case '+ str(i)+ ': GERMAN')
    elif st == 'BONJOUR':
        print('Case '+ str(i)+ ': FRENCH')
    elif st == 'CIAO':
        print('Case '+ str(i)+ ': ITALIAN')
    elif st == 'ZDRAVSTVUJTE':
        print('Case '+ str(i)+ ': RUSSIAN')
    else:
        print('Case '+ str(i)+ ': UNKNOWN')
