import numpy as np
import matplotlib.pyplot as plt
import pandas as pd
import sklearn
weather=['Sunny','Sunny','Overcast','Rainy','Rainy','Rainy','Overcast','Sunny','Sunny',
'Rainy','Sunny','Overcast','Overcast','Rainy']
temp=['Hot','Hot','Hot','Mild','Cool','Cool','Cool','Mild','Cool','Mild','Mild','Mild','Hot','Mild']

play=['No','No','Yes','Yes','Yes','No','Yes','No','Yes','Yes','Yes','Yes','Yes','No']
from sklearn.preprocessing import LabelEncoder
le = LabelEncoder()
w_encode=le.fit_transform(weather)
print("Weather",w_encode)
t_encode=le.fit_transform(temp)
label=le.fit_transform(play)
print ("Temp:",t_encode)
print ("Play:",label)
features = list(zip(w_encode, t_encode))
print(features)
#Import Gaussian Naive Bayes model
from sklearn.naive_bayes import GaussianNB
#Create a Gaussian Classifier
classifier = GaussianNB()
classifier.fit(features,label)
predicted= classifier.predict([[0,2]]) # 0:Overcast, 2:Mild #1:yes, 0:no
print("Predicted value:",predicted)
