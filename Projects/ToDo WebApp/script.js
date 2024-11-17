document.addEventListener('DOMContentLoaded', () => {
    const taskInput = document.getElementById('taskInput');
    const addBtn = document.getElementById('addBtn');
    const taskList = document.getElementById('taskList');
    const taskCount = document.getElementById('taskCount');
    const clearCompleted = document.getElementById('clearCompleted');
    const filterBtns = document.querySelectorAll('.filter-btn');

    let tasks = JSON.parse(localStorage.getItem('tasks')) || [];

    function saveTasks() {
        localStorage.setItem('tasks', JSON.stringify(tasks));
    }

    function updateTaskCount() {
        const activeTasks = tasks.filter(task => !task.completed).length;
        taskCount.textContent = `${activeTasks} task${activeTasks !== 1 ? 's' : ''} left`;
    }

    function createTaskElement(task) {
        const li = document.createElement('li');
        li.className = `task-item ${task.completed ? 'completed' : ''}`;
        li.innerHTML = `
            <input type="checkbox" ${task.completed ? 'checked' : ''}>
            <span>${task.text}</span>
            <button class="delete-btn"><i class="fas fa-trash"></i></button>
        `;

        const checkbox = li.querySelector('input');
        checkbox.addEventListener('change', () => {
            task.completed = checkbox.checked;
            li.classList.toggle('completed');
            saveTasks();
            updateTaskCount();
        });

        const deleteBtn = li.querySelector('.delete-btn');
        deleteBtn.addEventListener('click', () => {
            tasks = tasks.filter(t => t !== task);
            li.remove();
            saveTasks();
            updateTaskCount();
        });

        return li;
    }

    function renderTasks(filterType = 'all') {
        taskList.innerHTML = '';
        let filteredTasks = tasks;
        
        if (filterType === 'active') {
            filteredTasks = tasks.filter(task => !task.completed);
        } else if (filterType === 'completed') {
            filteredTasks = tasks.filter(task => task.completed);
        }

        filteredTasks.forEach(task => {
            taskList.appendChild(createTaskElement(task));
        });
    }

    addBtn.addEventListener('click', () => {
        const text = taskInput.value.trim();
        if (text) {
            const task = { text, completed: false };
            tasks.push(task);
            taskList.appendChild(createTaskElement(task));
            taskInput.value = '';
            saveTasks();
            updateTaskCount();
        }
    });

    taskInput.addEventListener('keypress', (e) => {
        if (e.key === 'Enter') {
            addBtn.click();
        }
    });

    clearCompleted.addEventListener('click', () => {
        tasks = tasks.filter(task => !task.completed);
        saveTasks();
        renderTasks();
        updateTaskCount();
    });

    filterBtns.forEach(btn => {
        btn.addEventListener('click', () => {
            filterBtns.forEach(b => b.classList.remove('active'));
            btn.classList.add('active');
            renderTasks(btn.dataset.filter);
        });
    });

    // Initial render
    renderTasks();
    updateTaskCount();
}); 