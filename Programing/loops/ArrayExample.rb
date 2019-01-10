class ArrayExample
 array=Array[1,2,3,4,5,6,7,8,9,10]
  for i in 0..array.length
    if i%2==0
      puts array[i]
      puts "even"
    else
      puts array[i]
      puts "odd"
    end
  end
end
