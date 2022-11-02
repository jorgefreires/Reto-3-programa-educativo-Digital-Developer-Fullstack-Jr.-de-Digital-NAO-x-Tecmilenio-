# Reto 2 del programa educativo Digital Developer Fullstack Jr. de Digital NAO x Tecmilenio

Este repositorio ha sido creado para subir las evidencias de uno de los retos del programa educativo Digital Developer Fullstack Jr. de Digital NAO x Tecmilenio. Dicha evidencia consiste en la creación de una aplicación de escritorio, mediante el uso de Java y la API de Scopus, capaz de leer un archivo JSON y alimentar una base de datos SQL. Se ha utilizado Eclipse como plataforma para desarrollar el código y json.simple como libreria para la lectura de los archivos JSON.

A continuación, se hará una pequeña introducción a la API de Scopus.

## API de Scopus

La API de Scopus que nos interesa para esta actividad es la llamada Author Retrieval API. Esta recupera un perfil de autor de Scopus pudiendo contener enlaces a los perfiles de búsqueda y afiliación de Scopus. Los perfiles de autor están indexados y se pueden buscar mediante la API de búsqueda de autores. 

¿Cuántos datos se pueden recuperar con la APIKey?: Cada Clave API tiene la capacidad de ejecutar un cierto número de solicitudes de datos de las APIs. Las cuotas, es decir, el número de solicitudes ejecutables, se restablecen cada siete días. En el caso de la Author retrieval API, la cuota semanal es de 5.000 solicitudes y se pueden ejecutar hasta 3 por segundo.

Para consultas relacionadas con la cuota se pueden utilizar las siguientes cabeceras:

``` Java
X-RateLimit-Limit       <----Muestra la configuración de la cuota de la API
X-RateLimit-Remaining   <----Muestra la cuota restante de la API
X-RateLimit-Reset       1234567891 <----Fecha/hora en que se restablece la cuota de la API
```

