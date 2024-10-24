Write a Python program to read “StudentsPerformance.csv” file. Solvefollowing:
- To display the shape of dataset.
- To display the top rows of the dataset with their columns.Note:
Download dataset from following link :
(https://www.kaggle.com/spscientist/students-performance-inexams?
select=StudentsPerformance.csv)




import pandas as pd

# Step 1: Load the dataset
# Update the path below to the location where you saved the StudentsPerformance.csv file
file_path = 'StudentsPerformance.csv'  # Update this path if needed
data = pd.read_csv(file_path)

# Step 2: Display the shape of the dataset
print("Shape of the dataset:")
print(data.shape)  # This will print the number of rows and columns

# Step 3: Display the top rows of the dataset with their columns
print("\nTop rows of the dataset:")
print(data.head())  # This will display the first 5 rows of the dataset