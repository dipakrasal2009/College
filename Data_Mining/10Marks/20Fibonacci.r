# Function to generate the first n Fibonacci numbers
generate_fibonacci <- function(n) {
  fib_sequence <- numeric(n)  # Create a vector to store Fibonacci numbers
  fib_sequence[1] <- 0        # First Fibonacci number
  fib_sequence[2] <- 1        # Second Fibonacci number
  
  for (i in 3:n) {
    fib_sequence[i] <- fib_sequence[i - 1] + fib_sequence[i - 2]
  }
  
  return(fib_sequence)
}

# Get the first 20 Fibonacci numbers
fibonacci_20 <- generate_fibonacci(20)

# Display the Fibonacci numbers
cat("The first 20 Fibonacci numbers are:\n")
print(fibonacci_20)

