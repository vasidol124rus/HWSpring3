# HWSpring3
1. В класс RegistrationService добавить поля UserService, NotificationService(добавить в IOC контейнер аннотацией @Autowired или через конструктор класса)
2. Разработать метод processRegistration в котором:
   • создается пользователь из параметров метода • созданный пользователь добавляется в репозиторий • через notificationService выводится сообщение в консоль

3. В TaskController добавить обработчики filterUsersByAge()(Подсказка @GetMapping("/filter/{age}")) и calculateAverageAge (Подсказка @GetMapping("/calc"))
4. В методе filterUsersByAge параметр age получать через аннотацию @PathVariable
   Для теcтирования проекта использовать программу PostMan:

a) Добавление пользователя - запрос : метод - POST адрес - http://localhost:8080/user/body 

тело - {
"name":"Bob","age":26,"email":"example1@yandex.ru"},

{
"name": "gin",
"age": 27,
"email": "example2@yandex.ru"
},

{
"name": "gin",
"age": 27,
"email": "example2@yandex.ru"
},

{
"name": "aven",
"age": 22,
"email": "example3@yandex.ru"
}



b) Получение списка пользователей на сервере - запрос: метод - GET адрес - http://localhost:8080/user

[
{
"name": "Bob",
"age": 26,
"email": "example1@yandex.ru"
},

{
"name": "gin",
"age": 27,
"email": "example2@yandex.ru"
},

{
"name": "gin",
"age": 27,
"email": "example2@yandex.ru"
},

{
"name": "aven",
"age": 22,
"email": "example3@yandex.ru"
}
]

c) Проверка сортировки - запрос: метод - GET адрес - http://localhost:8080/tasks/sort

[
{
"name": "aven",
"age": 22,
"email": "example3@yandex.ru"
},

{
"name": "Bob",
"age": 26,
"email": "example1@yandex.ru"
},

{
"name": "gin",
"age": 27,
"email": "example2@yandex.ru"
},

{
"name": "gin",
"age": 27,
"email": "example2@yandex.ru"
}
]

d) Проверка фильтрации - запрос: метод - GET адрес - http://localhost:8080/tasks/filter/27

[
{
"name": "Bob",
"age": 26,
"email": "example1@yandex.ru"
},

{
"name": "aven",
"age": 22,
"email": "example3@yandex.ru"
}
]

e) Проверка среднего арифметического - запрос: метод - GET адрес - http://localhost:8080/tasks/calc

25.5
