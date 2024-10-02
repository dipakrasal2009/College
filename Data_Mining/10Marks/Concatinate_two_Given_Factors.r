# Function to calculate the factors of a given number
calculate_factors <- function(number) {
  # Initialize an empty vector to store factors
  factors <- c()
  
  
  for (i in 1:number) {
    if (number %% i == 0) {
      factors <- c(factors, i)
    }
  }
  
  return(factors)
}

# Start the execution of the code
number1 <- 28
number2 <- 36

# call the function
factors_number1 <- calculate_factors(number1)
factors_number2 <- calculate_factors(number2)

# Concatenate the factors of both numbers
concatenated_factors <- c(factors_number1, factors_number2)

# Display the results
cat("Factors of", number1, ":\n")
print(factors_number1)

cat("Factors of", number2, ":\n")
print(factors_number2)

cat("Concatenated Factors of both numbers:\n")
print(concatenated_factors)

