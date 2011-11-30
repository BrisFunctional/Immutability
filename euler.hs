import List(nub)

multiples :: Integer
multiples = foldl (+) 0 (nub [x | x <- [1..999], y <- [3,5], mod x y == 0])
