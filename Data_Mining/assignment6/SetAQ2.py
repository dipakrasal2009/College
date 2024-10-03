url--->  https://gist.github.com/akuks/2e9b08cebef0181b583a1dff4a97f8a1


import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.cluster import AgglomerativeClustering
from sklearn.preprocessing import StandardScaler

# Load the dataset directly from the URL
url = 'Customer.csv'  # Replace with the actual URL
df = pd.read_csv(url)

# Display the first few rows of the dataset
print(df.head())

# Check for missing values
print(df.isnull().sum())

# Drop rows with missing values (if any)
df.dropna(inplace=True)

# Convert DOB to age - specify the date format
df['DOB'] = pd.to_datetime(df['DOB'], format='%d/%m/%y %H:%M', dayfirst=True)  # Adjust the format for day first
df['Age'] = (pd.Timestamp.now() - df['DOB']).dt.days // 365  # Calculate age in years

# Select relevant features for clustering
features = df[['Age', 'Gender']]

# One-hot encode the categorical 'Gender' feature
features_encoded = pd.get_dummies(features, columns=['Gender'], drop_first=True)

# Check the resulting DataFrame after encoding
print("Encoded Features:\n", features_encoded.head())
print("Columns after Encoding:", features_encoded.columns.tolist())

# Standardize the features
scaler = StandardScaler()
features_scaled = scaler.fit_transform(features_encoded)

# Perform Hierarchical Agglomerative Clustering
model = AgglomerativeClustering(n_clusters=4)  # Adjust the number of clusters as needed
labels = model.fit_predict(features_scaled)

# Add cluster labels to the original dataframe
df['Cluster'] = labels

# Display the first few rows with cluster labels
print(df.head())

# Check the unique labels
print("Unique Cluster Labels:", df['Cluster'].unique())

# Optional: Plotting the clusters (use only Age and one gender column for visualization)
gender_column = features_encoded.columns[1]  # Assuming the first column is 'Age'
plt.figure(figsize=(10, 6))
plt.scatter(df['Age'], features_encoded[gender_column], c=labels, cmap='viridis', marker='o', edgecolor='k')
plt.title('Hierarchical Agglomerative Clustering of Customers')
plt.xlabel('Age')
plt.ylabel(gender_column)  # Update the y-label to match the gender column
plt.colorbar(label='Cluster')
plt.grid(True)  # Add grid for better readability
plt.show()

# Optional: Dendrogram for visualizing hierarchical clustering
plt.figure(figsize=(10, 6))
from scipy.cluster.hierarchy import dendrogram, linkage
linked = linkage(features_scaled, 'ward')
dendrogram(linked,
           orientation='top',
           distance_sort='descending',
           show_leaf_counts=True)
plt.title('Dendrogram for Hierarchical Clustering')
plt.xlabel('Sample Index')
plt.ylabel('Distance')
plt.grid(True)  # Add grid for better readability
plt.show()


