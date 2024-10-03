


import numpy as nm
import matplotlib.pyplot as mtp
import pandas as pd

# Load the dataset
df = pd.read_csv('CC GENERAL.csv')

# Display the first few rows of the dataset
print(df.head())

# Check for missing values and drop rows with NaN values
df.dropna(inplace=True)

# Selecting relevant features for clustering (you can choose which features to use)
features = df.drop(columns=['CUST_ID']).values  # Using .values to get numpy array

# K-Means Clustering Implementation
def kmeans(X, k, max_iters=100):
    # Randomly initialize the centroids
    centroids = X[nm.random.choice(X.shape[0], k, replace=False)]
    
    for _ in range(max_iters):
        # Calculate distances from data points to centroids
        distances = nm.linalg.norm(X[:, nm.newaxis] - centroids, axis=2)
        
        # Assign clusters based on closest centroid
        labels = nm.argmin(distances, axis=1)
        
        # Calculate new centroids
        new_centroids = nm.array([X[labels == i].mean(axis=0) for i in range(k)])
        
        # If centroids do not change, break
        if nm.all(centroids == new_centroids):
            break
        
        centroids = new_centroids
        
    return labels, centroids

# Specify the number of clusters
k = 4  # You can adjust this based on your analysis

# Run K-Means
labels, centroids = kmeans(features, k)

# Add cluster labels to the dataframe
df['Cluster'] = labels

# Display the first few rows with cluster labels
print(df.head())

# Optional: Plotting clusters (use only 2 features for visualization)
mtp.scatter(features[:, 0], features[:, 1], c=labels, cmap='viridis', marker='o', edgecolor='k')
mtp.scatter(centroids[:, 0], centroids[:, 1], c='red', s=200, alpha=0.75, marker='X')  # Plot centroids
mtp.title('K-Means Clustering of Credit Card Data')
mtp.xlabel('Feature 1')
mtp.ylabel('Feature 2')
mtp.show()
