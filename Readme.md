Я выбрал задачи №25 ЕГЭ. Придумал, на мой взгляд, интересные задачки разного уровня сложности. Все задания можно решать "в лоб". Но с заданиями сложностью повыше можно подумать и оптимизировать решение, чтобы получить ответ в момент.

P.S. код можно посмотреть в соответствующих папках

# Условия

1. Однажды Владимир Владимирович потерял свой ключ от Кремля - его унесла наглая сорока. Но так как времени на поиски у президента нет, он вызвал к себе Дашу-путешественницу и её друга Башмачка, что они смогли найти столь важный ключ. Всё, что знал Владимир Владимирович, так это то, что сорока живёт рядом с Уральскими горами. И вот наши герои отправились в путь. Но при переходе через Волгу они встретили Кикимору. Она сказала, что пропустит их, если они смогут найти все числа из промежутка [2000, 2023], которые имеют 2 натуральных делителя, не считая 1 и самого числа. Даше и Башмачку нужно сказать Кикиморе эти числа и их делители (без 1 и самого числа). 

	*Пример*: На промежутке [4, 8] число 6 имеет 2 натуральных делителя 2 и 3. Тогда Кикиморе необходимо сказать:
		6 2 3

2. На уроке волшебной математики Гарри Поттер узнал, что такое нетривиальный делитель - это число, не равное 1 и самому числу. Спустя год наступает война с Волан-де-Мортом. Гарри срочно нужно достать свою мантию-невидимку из сундука. Но вот незадача, он забыл код от сундучка. Мгновенно Поттер вспоминает про тот самый урок математики, и понимает, как он примудывал код. Гарри взял промежуток [] и нашел числа, имеющие 3 нетривиальных делителя. Все эти числа и составили код. Помоги Гарри открыть сундук и спасти мир.

	*Пример*: На промежутке [10, 20] число 16 имеет 3 нетривиальных делителя 2, 4, 8. Тогда ответ:
		16

3. В городе Стобалловка жил мальчик Петя. На день рождения родители ему подарили ноутбук, чтобы он готовился к инфоратике и сдал её на 100. Так как Петя был скрытным пацаном, он установил пароль на свой ноутбук. И вот, спустя долгое время, наш мальчик забыл его, и у него есть только 5 попыток угадать. Всё, что помнит Петя, так это то, что его пароль находится в промежутке [1000000, 1277000] и имеет один натуральный делитель, не считая 1 и самого числа. Помоги мальчику сократить этот промежуток и определить пароль.

	*Пример*: На промежутке [20, 30] число 25 имеет 1 натуральный делитель 5. Тогда ответ:
		25

# Решение (устное)

## 1 задание

a. Смотря на промежуток можно даже не думать особо на счёт решения и решать чисто "в лоб". Я сделал отдельную функцию для нахождения делителей, где мы циклом проходимся до половины данного числа и перебираем каждое число и проверяем, делится ли на него наше число. Если делится, то закидываем в массив, при этом проверяя количество делителей. 

b. Попробуем немного оптимизировать работу и будем перебирать не до половины числа, а до квадратного корня из числа. Смотрим на условие и понимаем, что корень из числа не будет целым: так как надо найти числа, которые имеют 2 натуральных делителя, т.е. это первый попавшийся делитель и результат от деления числа на этот делитель (второй делитель). Т.е. пусть i - делитель, n - число, тогда второй делитель числа это n / i.  И тогда нам нужно найти такие числа n, делители которого равны i и n / i. А если бы был ещё и корень от числа, то уже было бы 3 делителя.

## 2 задание



## 3 задание
