# Define four vectors
vector_rollno <- c(101, 102, 103, 104)
vector_studname <- c("John", "Sara", "Mike", "Anna")
vector_address <- c("123 Main St", "456 Oak St", "789 Pine St", "101 Maple St")
vector_marks <- c(85, 90, 78, 92)

# Create a data frame using the four vectors
student_data <- data.frame(
  Rollno = vector_rollno,
  Studname = vector_studname,
  Address = vector_address,
  Marks = vector_marks
)

# Display the data frame
cat("Student Data Frame:\n")
print(student_data)

