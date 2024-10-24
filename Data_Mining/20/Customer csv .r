Write a python program to implement hierarchical Agglomerativeclustering algorithm.
(Download Customer.csv dataset from github.com).




import pandas as pd
import matplotlib.pyplot as plt
from sklearn.cluster import AgglomerativeClustering
import scipy.cluster.hierarchy as sch
from sklearn.preprocessing import StandardScaler

# Step 1: Load the dataset
url = "https://github.com/datasets/customers.csv"  # Update this with the correct GitHub link
df = pd.read_csv(url)

# Step 2: Display the first few rows of the dataset
print("First 5 rows of the dataset:")
print(df.head())

# Step 3: Extract relevant features (e.g., 'Annual Income' and 'Spending Score')
X = df[['Annual Income (k$)', 'Spending Score (1-100)']]

# Step 4: Standardize the data (optional, improves performance)
scaler = StandardScaler()
X_scaled = scaler.fit_transform(X)

# Step 5: Visualize the dendrogram to find the optimal number of clusters
plt.figure(figsize=(10, 7))
plt.title("Dendrogram for Customer Clustering")
dendrogram = sch.dendrogram(sch.linkage(X_scaled, method='ward'))
plt.xlabel('Customers')
plt.ylabel('Euclidean Distances')
plt.show()

# Step 6: Apply Agglomerative Clustering
n_clusters = 5  # Set based on dendrogram observation
hc = AgglomerativeClustering(n_clusters=n_clusters, affinity='euclidean', linkage='ward')
y_hc = hc.fit_predict(X_scaled)

# Step 7: Visualize the clusters
plt.figure(figsize=(10, 7))
plt.scatter(X_scaled[y_hc == 0, 0], X_scaled[y_hc == 0, 1], s=100, c='red', label='Cluster 1')
plt.scatter(X_scaled[y_hc == 1, 0], X_scaled[y_hc == 1, 1], s=100, c='blue', label='Cluster 2')
plt.scatter(X_scaled[y_hc == 2, 0], X_scaled[y_hc == 2, 1], s=100, c='green', label='Cluster 3')
plt.scatter(X_scaled[y_hc == 3, 0], X_scaled[y_hc == 3, 1], s=100, c='cyan', label='Cluster 4')
plt.scatter(X_scaled[y_hc == 4, 0], X_scaled[y_hc == 4, 1], s=100, c='magenta', label='Cluster 5')
plt.title('Clusters of Customers')
plt.xlabel('Annual Income (k$) [Standardized]')
plt.ylabel('Spending Score (1-100) [Standardized]')
plt.legend()
plt.show()