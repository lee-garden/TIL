import React from 'react';
import PropTyeps from 'prop-types';

const foodILike = [
  {
    id:1,
    name: "kimchi",
    rating: 5
  },
  {
    id:2,
    name: "samgiopsal",
    rating: 4.9
  },
  {
    id:3,
    name: "chukumi",
    rating: 4.8
  }
]

function Food({ name, rating }) {
  return (
    <div>
      <h1>Hello {name}</h1>
      <h2>rating {rating}</h2>
    </div>
  );
}
Food.prototype = {
  name: PropTyeps.string.isRequired,
  rating: PropTyeps.number.isRequired
}

function App() {
  return (
    <div className="App">
      {foodILike.map(
        dish => <Food key={dish.id} name={dish.name} rating={dish.rating}/>)}
    </div>
  );
}

export default App;
