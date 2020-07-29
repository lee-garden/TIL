import React from 'react';

function Food({ name }) {
  return <h1>Hello {name}</h1>
}

const foodILike = [
  {
    "name": "kimchi"
  },
  {
    "name": "samgiopsal"
  },
  {
    "name": "chukumi"
  }
]

function App() {
  return (
    <div className="App">
      {foodILike.map(dish => <Food name={dish.name}/>)}
    </div>
  );
}

export default App;
