# Function to generate Fibonacci sequence
fibonacci <- function(n) {
  fib_sequence <- numeric(n) # Create a vector to store Fibonacci numbers
  fib_sequence[1] <- 0 # First Fibonacci number
  fib_sequence[2] <- 1 # Second Fibonacci number
  
  for (i in 3:n) {
    fib_sequence[i] <- fib_sequence[i-1] + fib_sequence[i-2]
  }
  
  return(fib_sequence)
}

# Get the first 10 Fibonacci numbers
first_10_fibonacci <- fibonacci(10)

# Print the result
cat("The first 10 Fibonacci numbers are: \n")
print(first_10_fibonacci)

