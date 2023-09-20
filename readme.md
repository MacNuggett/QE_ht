**Запуск:**

- git clone https://github.com/MacNuggett/QE_ht.git
- cd demo\target
- java -jar demo-0.0.1-SNAPSHOT.jar

**Логика:**

Посылается запрос с длинами двух сторон(катетов) a и b прямоугольного треульника.
В ответе приходят длины всех сторон, периметр и площадь треугольника.

**Пример:** 

_Request_

URL: http://localhost:8080/get_triangle_info,
Method: POST,
json:
`{
"a": 3,
"b": 4
}`

_Response_

`{
"a": 3.0,
"b": 4.0,
"c": 5.0,
"perimeter": 12.0,
"square": 6.0
}`