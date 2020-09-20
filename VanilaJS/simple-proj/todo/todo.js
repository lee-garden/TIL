const inputBox = document.getElementById("inputBox");
const content = document.getElementById("content");
const todoUl = document.getElementById("todoListUl");

function writeTodo(e) {
  if (e.key === "Enter") {
    console.log(inputBox.value);
    saveTodo(inputBox.value);
  }
}

function saveTodo(todoName) {
  const todoItem = document.createElement("li");
  todoItem.append(todoName);
  todoUl.appendChild(todoItem);
}

function init() {
  inputBox.addEventListener("keypress", writeTodo);
}

init();
