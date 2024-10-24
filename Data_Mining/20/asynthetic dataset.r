Write a python program to implement k-means algorithms on asynthetic dataset.


import numpy as np
import matplotlib.pyplot as plt
from sklearn.datasets import make_blobs
from sklearn.cluster import KMeans

# Generate synthetic data
# make_blobs generates a dataset with 3 clusters, 300 samples, and 2 features
X, y_true = make_blobs(n_samples=300, centers=3, cluster_std=1.0, random_state=42)

# Visualize the generated data (optional)
plt.scatter(X[:, 0], X[:, 1], s=50)
plt.title("Synthetic Dataset")
plt.show()

# Apply K-Means algorithm
kmeans = KMeans(n_clusters=3, random_state=42)  # n_clusters is the number of clusters
kmeans.fit(X)

# Get the cluster centers and labels
centers = kmeans.cluster_centers_
labels = kmeans.labels_

# Visualize the clustered data
plt.scatter(X[:, 0], X[:, 1], c=labels, s=50, cmap='viridis')

# Plot the cluster centers
plt.scatter(centers[:, 0], centers[:, 1], c='red', s=200, alpha=0.75, marker='x')
plt.title("K-Means Clustering on Synthetic Data")
plt.show()