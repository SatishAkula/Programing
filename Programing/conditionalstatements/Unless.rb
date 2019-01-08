#Executes code if conditional is false. If the conditional is true, code specified in the else clause is executed.
class Unless
  x=1
  unless x>=2
    puts "x is less than 2"
  else
    puts "x is grater than 2"
  end
end
