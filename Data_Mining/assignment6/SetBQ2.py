url----> https://github.com/TrainingByPackt/Data-Science-with-Python/blob/master/Chapter01/Data/Wholesale%20customers%20data.csv



import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from scipy.cluster.hierarchy import dendrogram, linkage, fcluster

# Step 1: Load the dataset
# Replace 'path_to_your_dataset' with the actual path to your dataset
url = 'wholesale-customer.csv'
df = pd.read_csv(url)

# Step 2: Preprocessing the data
# Dropping non-numeric columns (Channel and Region)
data = df.drop(['Channel', 'Region'], axis=1)

# Step 3: Perform Hierarchical Clustering
# Linkage matrix
Z = linkage(data, method='ward')

# Step 4: Plotting the Dendrogram
plt.figure(figsize=(12, 8))
dendrogram(Z, truncate_mode='level', p=3)
plt.title('Dendrogram for Hierarchical Clustering')
plt.xlabel('Customers')
plt.ylabel('Distance')
plt.grid()
plt.show()

# Step 5: Form clusters
# Define the number of clusters (e.g., 3)
n_clusters = 3
clusters = fcluster(Z, n_clusters, criterion='maxclust')

# Step 6: Add cluster labels to the original DataFrame
df['Cluster'] = clusters

# Step 7: Visualize the clusters
# For visualization, let's plot the first two features (Fresh and Milk)
plt.figure(figsize=(10, 6))
plt.scatter(df['Fresh'], df['Milk'], c=df['Cluster'], cmap='viridis', s=100)
plt.title('Hierarchical Clustering of Wholesale Customers')
plt.xlabel('Fresh Products')
plt.ylabel('Milk Products')
plt.grid()
plt.colorbar(label='Cluster')
plt.show()

