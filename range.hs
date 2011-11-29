range :: Int -> [Int]
range 0 = []
range i = (i-1):(range (i-1))

