import numpy as np

# Given data
x = np.array([0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13])
y = np.array([1, 3, 2, 5, 7, 8, 8, 9, 10, 12, 16, 18])

# Calculate the means of x and y
mean_x = np.mean(x)
mean_y = np.mean(y)

# Calculate the slope (b1) and intercept (b0) of the regression line
numerator = np.sum((x - mean_x) * (y - mean_y))
denominator = np.sum((x - mean_x) ** 2)
b1 = numerator / denominator
b0 = mean_y - b1 * mean_x

# Print the estimated coefficients
print('Estimated coefficient b0 (intercept)', b0)
print('Estimated coefficient b1 (slope)', b1)
