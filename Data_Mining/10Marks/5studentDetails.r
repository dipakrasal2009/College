# Create a data frame with the details of 5 students
student_data <- data.frame(
  Rollno = c(101, 102, 103, 104, 105),
  Studname = c("John", "Sara", "Mike", "Anna", "David"),
  Address = c("123 Main St", "456 Oak St", "789 Pine St", "101 Maple St", "202 Birch St"),
  Marks = c(85, 90, 78, 92, 88)
)

# Display the student data
cat("Student Details:\n")
print(student_data)

