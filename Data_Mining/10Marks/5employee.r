# Creating a Data Frame with details of 5 employees
employee_data <- data.frame(
  Employee_ID = c(101, 102, 103, 104, 105),
  Name = c("John", "Sara", "Mike", "Anna", "David"),
  Age = c(28, 34, 29, 31, 40),
  Department = c("HR", "Finance", "IT", "Marketing", "Operations"),
  Salary = c(50000, 65000, 72000, 48000, 55000)
)

# Display the Data Frame
cat("Employee Data:\n")
print(employee_data)

# Display summary of the data
cat("\nSummary of Employee Data:\n")
summary(employee_data)

