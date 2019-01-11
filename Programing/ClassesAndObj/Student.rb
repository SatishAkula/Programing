class Student
  def initialize(name,id,rollno)
    @stud_name=name
    @stud_id=id
    @stud_rollno=rollno
  end
  def getDetails()
    puts "name of student #{@stud_name}"
    puts "id of student #{@stud_id}"
    puts "rollno of student #{@stud_rollno}"
  end
  obj1=Student.new("satish",347,33)
  obj2=Student.new("raj",33,333)
  obj1.getDetails()
  obj2.getDetails()
end
