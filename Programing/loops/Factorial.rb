class Factorial
  i=1;             #variable for iteration
  fact=1;          #variable to store factorial value
  num=6;
  while i <= num do    #loop 
    fact=fact*i        #calculating factorial value
    i=i+1              
  end
  puts "The factorial of #{num} is #{fact}";     #printing factorial value
end
