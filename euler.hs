import List(nub)

multiples :: [Integer] -> Integer
multiples a = foldl (+) 0 (nub [x | x <- [1..999], y <- a, y /= 0, mod x y == 0])
