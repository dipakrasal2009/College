import React, { useState, useEffect } from 'react';
import {registerRootComponent } from 'expo';

import { 
  StyleSheet, 
  Text, 
  View, 
  TextInput, 
  TouchableOpacity, 
  FlatList,
  SafeAreaView,
  StatusBar,
  AsyncStorage
} from 'react-native';
import { FontAwesome } from '@expo/vector-icons';

export default function App() {
  const [tasks, setTasks] = useState([]);
  const [taskInput, setTaskInput] = useState('');
  const [filter, setFilter] = useState('all');

  useEffect(() => {
    loadTasks();
  }, []);

  const loadTasks = async () => {
    try {
      const storedTasks = await AsyncStorage.getItem('tasks');
      if (storedTasks) {
        setTasks(JSON.parse(storedTasks));
      }
    } catch (error) {
      console.error('Error loading tasks:', error);
    }
  };

  const saveTasks = async (newTasks) => {
    try {
      await AsyncStorage.setItem('tasks', JSON.stringify(newTasks));
    } catch (error) {
      console.error('Error saving tasks:', error);
    }
  };

  const addTask = () => {
    if (taskInput.trim()) {
      const newTasks = [...tasks, { text: taskInput.trim(), completed: false }];
      setTasks(newTasks);
      saveTasks(newTasks);
      setTaskInput('');
    }
  };

  const toggleTask = (index) => {
    const newTasks = [...tasks];
    newTasks[index].completed = !newTasks[index].completed;
    setTasks(newTasks);
    saveTasks(newTasks);
  };

  const deleteTask = (index) => {
    const newTasks = tasks.filter((_, i) => i !== index);
    setTasks(newTasks);
    saveTasks(newTasks);
  };

  const clearCompleted = () => {
    const newTasks = tasks.filter(task => !task.completed);
    setTasks(newTasks);
    saveTasks(newTasks);
  };

  const filteredTasks = tasks.filter(task => {
    if (filter === 'active') return !task.completed;
    if (filter === 'completed') return task.completed;
    return true;
  });

  return (
    <SafeAreaView style={styles.container}>
      <StatusBar barStyle="light-content" />
      <View style={styles.todoApp}>
        <Text style={styles.title}>Task Manager <FontAwesome name="check-circle" size={24} color="#4CA1AF" /></Text>
        
        <View style={styles.inputSection}>
          <TextInput
            style={styles.input}
            value={taskInput}
            onChangeText={setTaskInput}
            placeholder="Add your task..."
            onSubmitEditing={addTask}
          />
          <TouchableOpacity style={styles.addButton} onPress={addTask}>
            <Text style={styles.buttonText}>Add</Text>
          </TouchableOpacity>
        </View>

        <View style={styles.filters}>
          {['all', 'active', 'completed'].map((filterType) => (
            <TouchableOpacity
              key={filterType}
              style={[styles.filterBtn, filter === filterType && styles.filterBtnActive]}
              onPress={() => setFilter(filterType)}
            >
              <Text style={[styles.filterBtnText, filter === filterType && styles.filterBtnTextActive]}>
                {filterType.charAt(0).toUpperCase() + filterType.slice(1)}
              </Text>
            </TouchableOpacity>
          ))}
        </View>

        <FlatList
          data={filteredTasks}
          keyExtractor={(_, index) => index.toString()}
          renderItem={({ item, index }) => (
            <View style={[styles.taskItem, item.completed && styles.taskItemCompleted]}>
              <TouchableOpacity onPress={() => toggleTask(index)}>
                <FontAwesome
                  name={item.completed ? "check-square-o" : "square-o"}
                  size={24}
                  color="#4CA1AF"
                />
              </TouchableOpacity>
              <Text style={[styles.taskText, item.completed && styles.taskTextCompleted]}>
                {item.text}
              </Text>
              <TouchableOpacity onPress={() => deleteTask(index)}>
                <FontAwesome name="trash" size={24} color="#ff5555" />
              </TouchableOpacity>
            </View>
          )}
        />

        <View style={styles.footer}>
          <Text style={styles.taskCount}>
            {tasks.filter(task => !task.completed).length} tasks left
          </Text>
          <TouchableOpacity style={styles.clearButton} onPress={clearCompleted}>
            <Text style={styles.clearButtonText}>Clear Completed</Text>
          </TouchableOpacity>
        </View>
      </View>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#4CA1AF',
  },
  todoApp: {
    flex: 1,
    padding: 20,
  },
  title: {
    fontSize: 24,
    fontWeight: 'bold',
    color: 'white',
    marginBottom: 20,
    textAlign: 'center',
  },
  inputSection: {
    flexDirection: 'row',
    marginBottom: 20,
  },
  input: {
    flex: 1,
    backgroundColor: 'white',
    padding: 12,
    borderRadius: 5,
    marginRight: 10,
  },
  addButton: {
    backgroundColor: '#2C3E50',
    padding: 12,
    borderRadius: 5,
    justifyContent: 'center',
  },
  buttonText: {
    color: 'white',
  },
  filters: {
    flexDirection: 'row',
    justifyContent: 'center',
    marginBottom: 20,
  },
  filterBtn: {
    backgroundColor: '#f0f0f0',
    padding: 8,
    borderRadius: 5,
    marginHorizontal: 5,
  },
  filterBtnActive: {
    backgroundColor: '#2C3E50',
  },
  filterBtnText: {
    color: '#333',
  },
  filterBtnTextActive: {
    color: 'white',
  },
  taskItem: {
    flexDirection: 'row',
    alignItems: 'center',
    backgroundColor: 'white',
    padding: 15,
    borderRadius: 5,
    marginBottom: 10,
  },
  taskItemCompleted: {
    opacity: 0.7,
  },
  taskText: {
    flex: 1,
    marginLeft: 10,
  },
  taskTextCompleted: {
    textDecorationLine: 'line-through',
    color: '#666',
  },
  footer: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    marginTop: 20,
    borderTopWidth: 1,
    borderTopColor: '#eee',
    paddingTop: 20,
  },
  taskCount: {
    color: 'white',
  },
  clearButton: {
    backgroundColor: '#ff5555',
    padding: 8,
    borderRadius: 5,
  },
  clearButtonText: {
    color: 'white',
  },
}); 

registerRootComponent(App);

