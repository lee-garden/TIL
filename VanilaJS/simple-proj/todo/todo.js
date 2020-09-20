const inputBox = document.getElementById("inputBox");
const content = document.getElementById("content");
const todoUl = document.getElementById("todoListUl");

function deleteItem(e) {
  const targetBtn = e.target;

  // 부모인 li에 접근해 삭제한다.
  targetBtn.parentNode.remove();
}

function writeTodo(e) {
  if (e.key === "Enter") {
    saveTodo(inputBox.value);
  }
}

function saveTodo(todoName) {
  // ul 태그 안에 들어갈 li와 그 안에 들어갈 버튼을 만든다.
  const todoItem = document.createElement("li");
  const deleteBtn = document.createElement("button");

  // 버튼에 누르면 li가 삭제되는 이벤트를 붙인다.
  deleteBtn.append("X");
  deleteBtn.addEventListener("click", deleteItem);

  todoItem.append(todoName);
  todoItem.appendChild(deleteBtn);

  todoUl.appendChild(todoItem);
}

function init() {
  inputBox.addEventListener("keypress", writeTodo);
}

init();
