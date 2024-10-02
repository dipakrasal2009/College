# Creating a Data Frame with employee details
employee_data <- data.frame(
  empno = c(101, 102, 103, 104, 105),
  empname = c("John", "Sara", "Mike", "Anna", "David"),
  gender = c("M", "F", "M", "F", "M"),
  age = c(28, 34, 29, 31, 40),
  designation = c("HR Manager", "Finance Analyst", "IT Specialist", "Marketing Head", "Operations Manager")
)

# Display the Data Frame
cat("Employee Data:\n")
print(employee_data)

