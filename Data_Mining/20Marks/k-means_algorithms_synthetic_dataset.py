import numpy as np
import matplotlib.pyplot as plt
import pandas as pd

# Step 1: Generate a synthetic dataset
from sklearn.datasets import make_blobs

# Generate synthetic data with 3 clusters
n_samples = 300
n_features = 2
n_clusters = 3
random_state = 42

X, y = make_blobs(n_samples=n_samples, centers=n_clusters, n_features=n_features, random_state=random_state)

# Convert to a DataFrame for easier manipulation
data = pd.DataFrame(X, columns=['Feature_1', 'Feature_2'])

# Step 2: Visualize the synthetic dataset
plt.figure(figsize=(10, 6))
plt.scatter(data['Feature_1'], data['Feature_2'], s=30)
plt.title('Synthetic Dataset')
plt.xlabel('Feature 1')
plt.ylabel('Feature 2')
plt.grid()
plt.show()

# Step 3: Implement K-Means algorithm
def k_means(X, n_clusters, n_iterations=100):
    # Step 3.1: Randomly initialize the centroids
    centroids = X.sample(n_clusters).to_numpy()
    
    for _ in range(n_iterations):
        # Step 3.2: Assign clusters based on closest centroid
        distances = np.linalg.norm(X.to_numpy()[:, np.newaxis] - centroids, axis=2)
        labels = np.argmin(distances, axis=1)

        # Step 3.3: Update centroids based on mean of assigned points
        new_centroids = np.array([X.to_numpy()[labels == k].mean(axis=0) for k in range(n_clusters)])

        # Step 3.4: Check for convergence
        if np.all(centroids == new_centroids):
            break
        
        centroids = new_centroids
    
    return labels, centroids

# Step 4: Run K-Means algorithm
labels, centroids = k_means(data, n_clusters)

# Step 5: Visualize the clustering results
plt.figure(figsize=(10, 6))
plt.scatter(data['Feature_1'], data['Feature_2'], c=labels, s=30, cmap='viridis', marker='o', edgecolor='k')
plt.scatter(centroids[:, 0], centroids[:, 1], c='red', s=200, alpha=0.75, marker='X')  # Centroids
plt.title('K-Means Clustering Results')
plt.xlabel('Feature 1')
plt.ylabel('Feature 2')
plt.grid()
plt.show()

