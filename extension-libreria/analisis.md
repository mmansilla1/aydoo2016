Del an�lisis de �ste c�digo se observa que la idea principal es, en lugar de calcular el costo de una Suscripci�n, hacer que estas no tengan costo, y al momento de calcular el costo final generar (a partir de las Suscripciones compradas) tantos Productos como sean necesarios. Por ejemplo: Si se tiene una Suscripci�n de una revista quincenal, se generar� una Compra con dos Productos iguales a la revista que corresponde la Suscripci�n.



Modificaciones realizadas:

- Cambio la interface Suscribible por una clase abstracta ProductoSuscribible que extiende de Producto y las clases Diario y Revista extienden de ProductoSuscribible porque son exactamente iguales

- Se modifican condiciones booleanas que comparan si algo es = true o = false en vez de usar solamente la expresi�n.

- Se modifica (en varios lugares) la declaraci�n de una variable s�lo con el prop�sito de devolverla. 

- Se modifica la clase Producto porque el equals() ten�a dos returns.

- Se crea la clase abstracta ProductoConIVA que extiende de Producto. La clase ArticuloDeLibreria extiende de ProuctoConIVA, porque no sabemos cuando un producto tiene IVA. De esta forma podemos saber si hay que calcularlo. 

- El m�todo contiene() de la clase Cuenta se modifica para que tenga un solo return y sea m�s legible.

- En la clase Libreria se sobrecarga el m�todo agregarProducto() para evitar la llamada a reflection, sacar el if y aprovechar la herencia.

- Se modifica el equals() de la clase Producto porque estaba casteando y luego preguntaba se la clase era correcta, lo que es redundante.

- Se modifica el equals() de la clase Cliente para que sea m�s legible y sin tantos returns.

- Se cambia la clase Mes a enumerado porque sino se puede crear un mes con cualquier nombre o un nombre incorrecto.

- Refactor para que el Diario se ajuste a la consigna y se llame Periodico.



Observaciones adicionales que no se llegaron a implementar (Oportunidades de mejora):

-  Un Cliente se crea a partir de una Libreria (No me parece correcto pero es parte del dise�o de la soluci�n).

- El m�todo verificarSiEstaEnStock() de la clase Libreria se puede modificar para usar herencia y polimorfismo. 
