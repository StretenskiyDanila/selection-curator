Я выбрал задачи №25 ЕГЭ. Придумал, на мой взгляд, интересные задачки разного уровня сложности. Все задания можно решать "в лоб". Но с заданиями сложностью повыше можно подумать и оптимизировать решение, чтобы получить ответ в момент.

P.S. код можно посмотреть в соответствующих папках

# Условия

1. Однажды Владимир Владимирович потерял свой ключ от Кремля - его унесла наглая сорока. Но так как времени на поиски у президента нет, он вызвал к себе Дашу-путешественницу и её друга Башмачка, что они смогли найти столь важный ключ. Всё, что знал Владимир Владимирович, так это то, что сорока живёт рядом с Уральскими горами. И вот наши герои отправились в путь. Но при переходе через Волгу они встретили Кикимору. Она сказала, что пропустит их, если они смогут найти все числа из промежутка [2000, 2023], которые имеют 2 натуральных делителя, не считая 1 и самого числа. Даше и Башмачку нужно сказать Кикиморе эти числа и их делители (без 1 и самого числа). 

	*Пример*: На промежутке [4, 8] число 6 имеет 2 натуральных делителя 2 и 3. Тогда Кикиморе необходимо сказать:
		6 2 3

2. На уроке волшебной математики Гарри Поттер узнал, что такое нетривиальный делитель - это число, не равное 1 и самому числу. Спустя год наступает война с Волан-де-Мортом. Гарри срочно нужно достать свою мантию-невидимку из сундука. Но вот незадача, он забыл код от сундучка. Мгновенно Поттер вспоминает про тот самый урок математики, и понимает, как он примудывал код. Гарри взял промежуток [13211, 98341] и нашел числа, имеющие 3 нетривиальных делителя. Все эти числа и составили код. Помоги Гарри открыть сундук и спасти мир.

	*Пример*: На промежутке [10, 20] число 16 имеет 3 нетривиальных делителя 2, 4, 8. Тогда ответ:
		16

3. В городе Стобалловка жил мальчик Петя. На день рождения родители ему подарили ноутбук, чтобы он готовился к инфоратике и сдал её на 100. Так как Петя был скрытным пацаном, он установил пароль на свой ноутбук. И вот, спустя долгое время, наш мальчик забыл его, и у него есть только 5 попыток угадать. Петя помнит только часть пароля - "2?953*6", где "?" - любая одна цифра, а "*" - любая последовательность цифр, также и пустая (например, для маски "1?23*2" подходят числа: 13232, 1323002 и т.п.). Тажке мальчик помнит, что его пароль сождержал от 7 до 9 цифр и делился на 2024 и на 552. Помоги Пете восстановить пароль.

# Решение (устное)

## 1 задание

a. Смотря на промежуток можно даже не думать особо на счёт решения и решать чисто "в лоб". Я сделал отдельную функцию для нахождения делителей, где мы циклом проходимся до половины данного числа и перебираем каждое число и проверяем, делится ли на него наше число. Если делится, то закидываем в массив, при этом проверяя количество делителей. 

b. Попробуем немного оптимизировать работу и будем перебирать не до половины числа, а до квадратного корня из числа. Смотрим на условие и понимаем, что корень из числа не будет целым: так как надо найти числа, которые имеют 2 натуральных делителя, т.е. это первый попавшийся делитель и результат от деления числа на этот делитель (второй делитель). Т.е. пусть i - делитель, n - число, тогда второй делитель числа это n / i.  И тогда нам нужно найти такие числа n, делители которого равны i и n / i. А если бы был ещё и корень от числа, то уже было бы 3 делителя.

Посмотрев первое задание, делаем вывод, что решение "в лоб" имеет два варианта: идти до середины числа и идти до корня из числа. В следующих заданиях для простой реализации кода я сразу показываю вариант с проходом до корня из числа, но мы помним, что есть ещё и первый вариант.

## 2 задание

a. Посмотрим внимательно на условие задачи - нам нужно найти число с 3 нетривиальными делителями. Сразу бросается в глаза, что делителей нечетное количество. Значит, должна быть одна пара делителей (т.е. это делители i и n / i), и плюс к ним один делитель. Но не бывает так, чтобы был делитель i, но не было делителя n / i. Значит, i = n / i. А такое может быть, только если этот делитель равен корню из числа. Тогда, мы проверям, что число имеет корень, и только потом начинаем проверять то, что у него должно быть ещё 2 делителя.

b. Если так подумать, корень из числа не может быть простым числом, потому что тогда у нас не было бы 3 делителя, а только два: это i и корень из числа (т.е. корень из числа = n / i). Это нам не подходит. Значит корень имеет делители. Но опять же какие? Если это обычные делители (не корень из корня), то делителей нашего числа будет больше (разложение числа на простые множители). Значит корень должен иметь корень, который в свою очередь будет простым числом. Т.е. корень 4 степени из нашего числа должен быть простым числом.

## 3 задание

a. Максимальное 9-значное число, которые мы можем получить - это 299539996. Тогда, начиная с 2024, с шагом 2024 мы будет идти до максимума и проверять, удовлетворяет ли число нашей маске. 

b. Можно немного ускорить проход по циклу, если мы сами найдем начальное положение. Можно взять число 2095306, но оно не делится на 2024, поэтому будет немного сложновато: нужно взять шаг 10, найти первое число, которое подходит, потом шаг менять на 2024 и уже искать оставшееся. Не факт, что такое решение будет быстрее. Если же мы 2024\*2024\*2\*2, то получим 16386304, который делится на 2024 и при этом близок к начальной границе промежутка в нашей задаче.
P.S. можно домножить не на 2 и 2, а, например на 5. Будем ещё ближе к границе, но это уже мелочи, так как цилом за пару итераций дойдем до нужных чисел, что при умножении на 4, что на 5.
