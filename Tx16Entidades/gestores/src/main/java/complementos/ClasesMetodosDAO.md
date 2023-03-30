## CLASES y METODOS

##### Clase LocalDate

```java
java.time.LocalDate.minusWeeks(long weeksToSubtract)
```

* Método

```java
minusWeeks(1)
```

* Devuelve una copia de esta ``LocalDate`` con el número especificado de semanas restadas 


* Este método resta la cantidad especificada en semanas del campo días disminuyendo los campos 
mes y año según sea necesario para asegurar que el resultado sigue siendo válido 


* El resultado sólo es inválido si se supera el año máximo/mínimo


```java
Por ejemplo, 2009-01-07 menos una semana daría como resultado 2008-12-31.
```


* Esta instancia es inmutable y no se ve afectada por esta llamada al método


##### Clase LocalDateTime

```java
java.time.LocalDate.atStartOfDay()
```

* Método

```java
atStartOfDay()
```


* Combina esta fecha con la hora de medianoche para crear un ``LocalDateTime`` al inicio de esta fecha


* Devuelve una ``LocalDateTime`` formada a partir de esta fecha a la hora de medianoche, 00:00, al inicio de esta fecha


* Devuelve: la fecha-hora local de medianoche al inicio de esta fecha, no null


##### Clase LocalDateTime 

```java
java.time.LocalDateTime.minus(long amountToSubtract, TemporalUnit unit)
```

* Método 

```java
minus()
```

* Devuelve una copia de esta fecha y hora con la cantidad especificada restada


* Esto devuelve un ``LocalDateTime``` basado en este, con la cantidad en términos de la unidad restada 


* Si no es posible restar la cantidad, porque la unidad no está soportada o por alguna otra razón, se lanza una ``excepción``


* Este método es equivalente a ``plus(long, TemporalUnit)`` con la cantidad negada


* Consulte ese método para obtener una descripción completa de cómo funciona la adición y, por lo tanto, la resta 


* Esta instancia es inmutable y no se ve afectada por esta llamada al método


##### Enum DayOfWeek 

```java
java.time.LocalDate.getDayOfWeek()
```

* Obtiene el campo día de la semana, que es un ``enum DayOfWeek`` 


* Este método devuelve el ``enum DayOfWeek`` para el día de la semana 


* Esto evita confusiones sobre el significado de los valores ``int``


* Si necesita acceder al valor ``int primitivo`` , entonces el ``enum`` proporciona el valor ``int``


* Se puede obtener información adicional de ``DayOfWeek`` 


* Esto incluye nombres textuales de los valores

