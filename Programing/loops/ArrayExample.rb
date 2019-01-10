class ArrayExample
  num=Array[1,2,3,4,5,6,7,8,9,10]
  for i in 0..num.length
    if i%2==0
      puts num[i]
      puts "even"
    else
      puts num[i]
      puts "odd"
    end
  end
end
