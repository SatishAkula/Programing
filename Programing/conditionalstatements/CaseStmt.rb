class CaseStmt
  case capacity=100
    when 1..20
    puts "it is in the range of 1 to 20"
    when 21..50
    puts "it is in the range of 21 to 50"
    when 51..100
    puts "it is in the ragne of 51 to 100"
  else
    puts "more than 100"
  end
end
