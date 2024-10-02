# Function to reverse a number
reverse_number <- function(num) {
  reversed <- 0
  original_num <- num
  
  while (num > 0) {
    remainder <- num %% 10
    reversed <- reversed * 10 + remainder
    num <- floor(num / 10)
  }
  
  return(reversed)
}

# Function to calculate the sum of digits
sum_of_digits <- function(num) {
  sum <- 0
  
  while (num > 0) {
    sum <- sum + (num %% 10)
    num <- floor(num / 10)
  }
  
  return(sum)
}

# Input number
num <- as.integer(readline(prompt = "Enter a number: "))

# Reverse the number
reversed <- reverse_number(num)

# Calculate the sum of digits
digit_sum <- sum_of_digits(num)

# Output the results
cat("Reversed Number: ", reversed, "\n")
cat("Sum of Digits: ", digit_sum, "\n")

