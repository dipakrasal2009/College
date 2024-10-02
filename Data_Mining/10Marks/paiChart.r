# Digits on the dice
dice_numbers <- c(1, 2, 3, 4, 5, 6)

# Frequency of getting each number
frequency <- c(7, 2, 6, 3, 4, 8)

# Create labels for the pie chart
labels <- paste("Dice", dice_numbers)

# Draw the pie chart
pie(frequency, labels = labels, main = "Frequency of Getting Each Number on Dice", col = rainbow(length(frequency)))

# Add a legend
legend("topright", labels, fill = rainbow(length(frequency)))

