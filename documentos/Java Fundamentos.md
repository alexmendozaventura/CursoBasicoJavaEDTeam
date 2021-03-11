# Java Fundamentos

Pasos para instalar el openjdk

https://ed.team/blog/instalar-openjdk-en-windows

Para compilar un archivo

```
javac NombreArchivo.java
```

Para ejecutar

```
java NombreArchivo
```

## Operadores

### Operadores de asignación

```
tipo_de_dato variable = valor
```

Ejemplo:

```java
int a = 2;
int b; 
b = 2 + 2 + 3; //asignación
```

###  Preincremento

```java
int a = 0
++a;
```

### Postincremento

```java
int b = 0;
b++;
```

### Operadores aritmeticos

```
+ - * /
```

#### Jerarquía

* Operador . (POO), operador()
* Primero  * /  (prioridad de izquierda a derecha)
* Segundo + - (prioridad de izquierda a derecha)

### Operadores logicos (Y / O)

#### Tabla de verdad de Y(&&)

| A     | B     | Resultado |
| ----- | ----- | --------- |
| true  | true  | true      |
| true  | false | false     |
| false | true  | false     |
| false | false | false     |

#### Tabla de verdad de O (||)

| A     | B     | Resultado |
| ----- | ----- | --------- |
| true  | true  | true      |
| true  | false | true      |
| false | true  | true      |
| false | false | false     |

### Condicional IF

```java
if(expresion){
//sentencia
}
```

### Condicional switch

```java
switch(expresion){
    case valor : //sentencia; 
    break;
    default: 
        //sentencia
        break;
}
```

### Ciclo do while

```java
do{
   //sentencia          
  }
  while(expresion);
```

### Ciclo while

```java
while(expresion){
//sentecia
}
```

### Ciclo For

```java
for(inicializacion;expresion booleana; incremento){
//sentencia
}
```

### Ciclo Foreach

```java
for(variable_temporal : array){
//sentencia
}
```

### Arreglos

1. Tamaño fijo

2. Solo puede contener elementos de un mismo tipo

Puede almacenar tipo de datos primitivos o referencias Objetos.

#### Conceptos base

* posicion / indice

* Los indices comienzan con cero

### POO

Los pilares de programación Orientada a objetos

* Abstracción
* Encapsulamiento
* Herencia
* Polimorfismo

### Clase

Agrupación de objetos con caracteristicas y comportamientos principales.

### Objeto 

(Instancia de una clase)

### Getters and Setters

(Encapsulamiento)

Paquetes

```
dominio.
ed.team
golan.es.com

comienza de derecha a izquierda
team.ed.staff
```

Modificadores

* **public**: Puede ser accedido desde cualquier lugar.

* **private**: Puede ser accedido solo desde su propia clase.

* **default**: Puede ser accedido desde su clase, las clases que están en el mismo paquete y las clases que hereden el mismo paquete.

* **protected**: Puede ser accedido desde su clase, las clases que están en el mismo paquete y desde las clases que hereden asi esten en otras clases.

  | Modificador     | Clase | Paquete | Subclase(Mismo paquete) | Subclase(Diferente paquete) | Mundo |
  | --------------- | ----- | ------- | ----------------------- | --------------------------- | ----- |
  | public          | Si    | Si      | Si                      | Si                          | Si    |
  | private         | Si    | No      | No                      | No                          | No    |
  | sin modificador | Si    | Si      | Si                      | No                          | No    |
  | protected       | Si    | Si      | Si                      | Si                          | No    |

  

### Notas:

En VisualStudioCode:

```
main + tab
```

https://www.rimac.com.pe/ACUERDO/certificado.do?method=imprimirCertificadoWKS

