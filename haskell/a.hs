
numbersFrom n = n : numbersFrom (n + 1)

isMultipleOf3Or5 n = (mod n 3 == 0) || (mod n 5 == 0)

main = putStrLn $ show $ sum $ filter isMultipleOf3Or5 $ take 1000 $ numbersFrom 0

