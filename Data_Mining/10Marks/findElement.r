# Given lists
list_A <- list("x", "y", "z")
list_B <- list("X", "Y", "Z", "x", "y", "z")

# Function to find elements in list_A that are not in list_B
find_elements_not_in_B <- function(A, B) {
  # Use setdiff to find elements in A that are not in B
  result <- setdiff(A, B)
  
  if (length(result) > 0) {
    cat("Elements in list_A that are not in list_B: \n")
    print(result)
  } else {
    cat("No elements in list_A that are not in list_B.\n")
  }
}

# Call the function
find_elements_not_in_B(list_A, list_B)

