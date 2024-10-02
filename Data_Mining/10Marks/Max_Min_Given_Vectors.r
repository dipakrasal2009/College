# Function to find maximum and minimum values of a vector
find_max_min <- function(vec) {
  max_value <- max(vec)
  min_value <- min(vec)
  
  cat("Maximum value of the vector: ", max_value, "\n")
  cat("Minimum value of the vector: ", min_value, "\n")
}

# Example vector
my_vector <- c(10, 45, 23, 89, 67, 34, 12)

# Call the function
find_max_min(my_vector)

