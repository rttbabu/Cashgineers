// This file contains the JavaScript code for the bank dashboard. 
// It handles user interactions, fetches data from the backend, and updates the UI dynamically.

document.addEventListener('DOMContentLoaded', function() {
    const userDataContainer = document.getElementById('user-data');
    
    // Function to fetch user data from the backend
    async function fetchUserData() {
        try {
            const response = await fetch('/api/users'); // Adjust the endpoint as necessary
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            const data = await response.json();
            displayUserData(data);
        } catch (error) {
            console.error('There has been a problem with your fetch operation:', error);
        }
    }

    // Function to display user data in the UI
    function displayUserData(data) {
        userDataContainer.innerHTML = ''; // Clear existing data
        data.forEach(user => {
            const userElement = document.createElement('div');
            userElement.className = 'user';
            userElement.innerHTML = `<h3>${user.name}</h3><p>Email: ${user.email}</p>`;
            userDataContainer.appendChild(userElement);
        });
    }

    // Initial fetch of user data
    fetchUserData();
});