The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

ANS: 6857



Explanation:

Euler003 is a VERY inefficient solution. I left it running for several minutes and it did not come close to solving. It
was a naive but very simple to understand approach. Start at the input number and try every number less than that input.
If the trial number is both a factor and is a prime number, then we have the answer. This approach is fine for very
small numbers.


Euler003V2 is a much more efficient solution. The result comes back instantly. The logic is very simple as well.
Essentially, brute forcing every number is too slow, so we need a way to decrease the value of the input number very
quickly and skip over numbers that aren't the answer. One important piece of information is that every number has a
distinct set of prime numbers that can be multiplied together to get the original number. 9 = 3 x 3. There is no other
combination of prime numbers that can be multiplied to achieve 9.



So, we take the number and find the smallest prime factor. Then we can divide the input number by the smallest prime
factor and repeat


100 is our number

First we try 2. That works so we divide by 2

50 is our number.

Divide by 2 works so we divide by 2.

25 is our number.

Divide by 2 does not work
Divide by 3 does not work
Divide by 4 does not work
Divide by 5 works! So we divide by 5

5 is our number
Divide by 2 does not work
Divide by 3 does not work
Divide by 4 does not work
Divide by 5 works! So we divide by 5

1 is our number and its prime so we are finished


So the prime factorization of 100 is 2*2*5*5 so we would return 5