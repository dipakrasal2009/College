# Import necessary libraries
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score

# Load the dataset (downloading from the provided link)
url = 'https://www.w3schools.com/python/dataset.csv'
data = pd.read_csv(url)

# Display the first few rows of the dataset
print(data.head())

# Preprocessing: Select independent and dependent variables
# Independent variables (features)
X = data[['Weight', 'Volume']]

# Dependent variable (target)
y = data['CO2']

# Split the dataset into training and test sets (80% train, 20% test)
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Create the Multiple Linear Regression model
model = LinearRegression()

# Train the model
model.fit(X_train, y_train)

# Make predictions on the test set
y_pred = model.predict(X_test)

# Display the model coefficients (weights)
print(f"Intercept: {model.intercept_}")
print(f"Coefficients: {model.coef_}")

# Evaluate the model
mse = mean_squared_error(y_test, y_pred)
r2 = r2_score(y_test, y_pred)

# Output model performance
print(f"Mean Squared Error: {mse}")
print(f"R-squared: {r2}")

# Making a new prediction (optional)
new_data = [[2300, 1300]]  # Weight, Volume
predicted_CO2 = model.predict(new_data)
print(f"Predicted CO2 for new data: {predicted_CO2[0]}")

